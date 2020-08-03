-- ===================
-- Crear la PDB
-- ===================
CREATE PLUGGABLE DATABASE BIBLIOTECABD ADMIN USER adminbiblioteca IDENTIFIED BY biblioteca2020 ROLES =(DBA) file_name_convert =(
    'C:\APP\DENNI\PRODUCT\18.0.0\ORADATA\XE\PDBSEED',
    'C:\APP\DENNI\PRODUCT\18.0.0\ORADATA\XE\PDBBIBLIOTECA'
);
ALTER PLUGGABLE DATABASE BIBLIOTECABD OPEN READ WRITE;
ALTER SESSION
SET CONTAINER = BIBLIOTECABD;
-- ===================
-- Crear Tablespaces
-- ===================
CREATE TABLESPACE tsbiblioteca DATAFILE 'C:\APP\DENNI\PRODUCT\18.0.0\ORADATA\XE\PDBBIBLIOTECA\tsbiblioteca.dbf' size 500k reuse autoextend on next 500k maxsize 5M;
CREATE TEMPORARY TABLESPACE tstmpbiblioteca tempfile 'C:\APP\DENNI\PRODUCT\18.0.0\ORADATA\XE\PDBBIBLIOTECA\tstmpbiblioteca.dbf' size 2M reuse autoextend on next 2M maxsize unlimited;
-- ===================
-- Crear Usuarios
-- ===================
create user dbabiblioteca identified by biblioteca2020 default tablespace tsbiblioteca temporary tablespace tstmpbiblioteca quota unlimited on tsbiblioteca;
grant dba to dbabiblioteca;
-- conn dbabiblioteca/biblioteca2020@localhost:1521/bibliotecabd
alter session
set nls_date_format = 'DD-MON-YYYY HH24:MI:SS';
-- ===================
-- Crear Tablas
-- ===================
CREATE TABLE pais_autor (
    id int PRIMARY KEY,
    pais varchar2(100) UNIQUE,
    creado_en date,
    modificado_en date
);
CREATE TABLE autor (
    id int PRIMARY KEY,
    nombre varchar2(50),
    id_pais int,
    creado_en date,
    modificado_en date,
    FOREIGN KEY (id_pais) REFERENCES pais_autor(id)
);
CREATE TABLE cliente (
    id int PRIMARY KEY,
    nombre varchar2(20),
    apellido varchar2(20),
    fecha_nac date,
    domicilio varchar2(100),
    telefono varchar2(20),
    email varchar2(50),
    creado_en date,
    modificado_en date
);
CREATE TABLE genero (
    id int PRIMARY KEY,
    nombre varchar2(30),
    creado_en date,
    modificado_en date
);
CREATE TABLE libro (
    id int PRIMARY KEY,
    nombre varchar2(50),
    isbn varchar2(20),
    anio_publicacion int,
    id_autor int,
    id_genero int,
    creado_en date,
    modificado_en date,
    FOREIGN KEY (id_autor) REFERENCES autor(id),
    FOREIGN KEY (id_genero) REFERENCES genero(id)
);
CREATE TABLE stock (
    id int PRIMARY KEY,
    cantidad int,
    id_libro int,
    creado_en date,
    modificado_en date,
    FOREIGN KEY(id_libro) REFERENCES libro(id)
);
CREATE TABLE empleado (
    id int PRIMARY KEY,
    nombre varchar2(20),
    apellido varchar2(30),
    cargo varchar2(30),
    usuario varchar2(30),
    password varchar2(100),
    fecha_nac date,
    telefono varchar2(50),
    email varchar2(50),
    creado_en date,
    modificado_en date
);
CREATE TABLE prestamo (
    id int PRIMARY KEY,
    codigo varchar2(10) UNIQUE,
    fecha date,
    devolucion date,
    devuelto char,
    id_libro int,
    id_cliente int,
    id_empleado int,
    creado_en date,
    modificado_en date,
    FOREIGN KEY (id_libro) REFERENCES libro(id),
    FOREIGN KEY (id_cliente) REFERENCES cliente(id),
    FOREIGN KEY (id_empleado) REFERENCES empleado(id)
);
-- ===================
-- Crear Sequences
-- ===================
CREATE SEQUENCE seq_pais increment by 1 start with 1 nocache;
CREATE SEQUENCE seq_autor increment by 1 start with 1 nocache;
CREATE SEQUENCE seq_cliente increment by 1 start with 1 nocache;
CREATE SEQUENCE seq_genero increment by 1 start with 1 nocache;
CREATE SEQUENCE seq_libro increment by 1 start with 1 nocache;
CREATE SEQUENCE seq_stock increment by 1 start with 1 nocache;
CREATE SEQUENCE seq_empleado increment by 1 start with 1 nocache;
CREATE SEQUENCE seq_prestamo increment by 1 start with 1 nocache;
--= =================
-- Crear Triggers
-- ===================
CREATE OR REPLACE TRIGGER TRG_PAIS_SEQ BEFORE
INSERT ON pais_autor FOR EACH ROW BEGIN
SELECT seq_pais.nextval INTO :new.id
FROM dual;
END;
/
CREATE OR REPLACE TRIGGER TRG_AUTOR_SEQ BEFORE
INSERT ON autor FOR EACH ROW BEGIN
SELECT seq_autor.nextval INTO :new.id
FROM dual;
END;
/
CREATE OR REPLACE TRIGGER TRG_CLIENTE_SEQ BEFORE
INSERT ON cliente FOR EACH ROW BEGIN
SELECT seq_cliente.nextval INTO :new.id
FROM dual;
END;
/
CREATE OR REPLACE TRIGGER TRG_GENERO_SEQ BEFORE
INSERT ON genero REFERENCING new as new for each row
declare proximoid Number := 0;
begin
select seq_genero.nextval into proximoid
from dual;
:new.id := proximoid;
end;
/
CREATE OR REPLACE TRIGGER TRG_LIBRO_SEQ BEFORE
INSERT ON libro REFERENCING new as new for each row
declare proximoid Number := 0;
begin
select seq_libro.nextval into proximoid
from dual;
:new.id := proximoid;
end;
/
CREATE OR REPLACE TRIGGER TRG_STOCK_SEQ BEFORE
INSERT ON stock REFERENCING new as new for each row
declare proximoid Number := 0;
begin
select seq_stock.nextval into proximoid
from dual;
:new.id := proximoid;
end;
/
CREATE OR REPLACE TRIGGER TRG_EMPLEADO_SEQ BEFORE
INSERT ON empleado REFERENCING new as new for each row
declare proximoid Number := 0;
begin
select seq_empleado.nextval into proximoid
from dual;
:new.id := proximoid;
end;
/
CREATE OR REPLACE TRIGGER TRG_PRESTAMO_SEQ BEFORE
INSERT ON prestamo REFERENCING new as new for each row
declare proximoid Number := 0;
begin
select seq_prestamo.nextval into proximoid
from dual;
:new.id := proximoid;
end;
/
CREATE OR REPLACE TRIGGER TRG_DISMINUIR_STOCK
AFTER
INSERT ON prestamo
DECLARE id_actual Number := 0;
id_libro_insertado Number := 0;
stock_actual Number := 0;
BEGIN
SELECT seq_prestamo.CURRVAL INTO id_actual
FROM dual;
SELECT id_libro INTO id_libro_insertado
FROM prestamo
WHERE id = id_actual;
UPDATE stock
SET cantidad = (cantidad - 1)
WHERE id_libro = id_libro_insertado;
END;
/ -- ===================
-- Stored Procedures
-- ===================
CREATE OR REPLACE PROCEDURE sp_pais_autor_insert (pais pais_autor.pais %TYPE) AS BEGIN
INSERT INTO pais_autor (id, pais, creado_en)
VALUES (0, UPPER(pais), SYSDATE);
COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE sp_autor_insert (
        nombre autor.nombre%TYPE,
        pais autor.id_pais%TYPE
    ) AS BEGIN
INSERT INTO autor (id, nombre, id_pais, creado_en)
VALUES (0, UPPER(nombre), pais, SYSDATE);
COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE sp_cliente_insert (
        nombre cliente.nombre%TYPE,
        apellido cliente.apellido%TYPE,
        nacimiento cliente.fecha_nac%TYPE,
        domicilio cliente.domicilio%TYPE,
        telefono cliente.telefono%TYPE,
        email cliente.email%TYPE
    ) AS BEGIN
INSERT INTO cliente (
        id,
        nombre,
        apellido,
        fecha_nac,
        domicilio,
        telefono,
        email,
        creado_en
    )
VALUES (
        0,
        UPPER(nombre),
        UPPER(apellido),
        nacimiento,
        domicilio,
        telefono,
        email,
        SYSDATE
    );
COMMIT;
END;
/
CREATE OR REPLACE PROCEDURE sp_prestamo_insert(
        codigo prestamo.codigo%TYPE,
        fecha prestamo.fecha%TYPE,
        id_libro prestamo.id_libro%TYPE,
        id_cliente prestamo.id_cliente%TYPE,
        id_empleado prestamo.id_empleado%TYPE
    ) AS BEGIN
INSERT INTO prestamo (
        id,
        codigo,
        fecha,
        devuelto,
        id_libro,
        id_cliente,
        id_empleado
    )
VALUES(
        0,
        codigo,
        fecha,
        'N',
        id_libro,
        id_cliente,
        id_empleado
    );
END;
/
CREATE OR REPLACE PROCEDURE sp_devolver_prestamo(
    id_prestamo prestamo.id%TYPE
    c1 OUT SYS_REFCURSOR; 
)
IS
DECLARE
    id_libro_devuelto prestamo.id_libro%TYPE 
BEGIN
    UPDATE prestamo SET devuelto = 'Y', devolucion = SYSDATE, modificado_en = SYSDATE WHERE id = id_prestamo;
    OPEN c1 FOR
    SELECT id_libro INTO id_libro_devuelto FROM prestamo WHERE id = id_prestamo;
    UPDATE stock SET cantidad = (cantidad + 1) WHERE id_libro = id_libro_devuelto;
END sp_devolver_prestamo;
/
-- ===================
-- VISTAS
-- ===================
CREATE OR REPLACE VIEW vw_autor_pais AS
SELECT a.id,
    a.nombre,
    p.pais
FROM (
        autor a
        JOIN pais_autor p ON (a.id_pais = p.id)
    )
ORDER BY a.nombre ASC;
CREATE OR REPLACE VIEW vw_stock_libros AS
SELECT s.id,
    s.cantidad,
    l.nombre
FROM (
        stock s
        JOIN libro l ON (s.id_libro = l.id)
    )
ORDER BY l.nombre ASC;
CREATE OR REPLACE VIEW vw_clientes AS
SELECT s.id,
    s.cantidad,
    l.nombre
FROM (
        stock s
        JOIN libro l ON (s.id_libro = l.id)
    )
ORDER BY l.nombre ASC;
CREATE OR REPLACE VIEW vw_prestamo_cliente_empleado AS
SELECT p.id,
    p.codigo,
    c.nombre as nombre_cliente,
    c.apellido,
    p.fecha,
    l.nombre as nombre_libro,
    p.devolucion,
    p.devuelto,
    e.nombre as nombre_empleado,
    e.apellido as apellido_empleado
FROM (
        prestamo p
        JOIN libro l ON (p.id_libro = l.id)
        JOIN cliente c ON (p.id_cliente = c.id)
        JOIN empleado e ON (p.id_empleado = e.id)
    )
ORDER BY p.fecha ASC;