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