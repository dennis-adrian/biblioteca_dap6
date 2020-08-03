/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Conexion.Conexion;
import java.sql.ResultSet;
import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author Megashi
 * id int PRIMARY KEY,
    codigo varchar2(10) UNIQUE,
    fecha date,
    devolucion date,
    devuelto char,
    id_libro int,
    id_cliente int,
    id_empleado int,
    creado_en date,
    modificado_en date,
 */
public class Prestamo extends Conexion{
    private int id;
    private String codigo;
    private Date fecha;
    private Date devolucion;
    private String devuelto;
    private int id_libro;
    private int id_cliente;
    private int id_empleado;
    ////////////////////////////////////////////////////////
    private String nombreLibro,nombreCliente,nombreEmpleado;

    public Prestamo(int id, String codigo, Date fecha, Date devolucion, String devuelto, int id_libro, int id_cliente, int id_empleado) {
        this.id = id;
        this.codigo = codigo;
        this.fecha = fecha;
        this.devolucion = devolucion;
        this.devuelto = devuelto;
        this.id_libro = id_libro;
        this.id_cliente = id_cliente;
        this.id_empleado = id_empleado;
    }
    public Prestamo() {
        this.id = 0;
        this.codigo = "";
        this.fecha = new Date();
        this.devolucion = new Date();
        this.devuelto = "";
        this.id_libro = 0;
        this.id_cliente = 0;
        this.id_empleado = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getDevolucion() {
        return devolucion;
    }

    public void setDevolucion(Date devolucion) {
        this.devolucion = devolucion;
    }

    public String getDevuelto() {
        return devuelto;
    }

    public void setDevuelto(String devuelto) {
        this.devuelto = devuelto;
    }

    public int getId_libro() {
        return id_libro;
    }

    public void setId_libro(int id_libro) {
        this.id_libro = id_libro;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }
    
    public boolean insertar(){ //insert into prestamo (nombre,isbn,anio_publicacion,id_autor,id_genero,creado_en) values ('Cien Años de Soledad','9781234567897',1967,1,4, SYSDATE);
        try {
            String sql = "insert into prestamo (codigo,fecha,devuelto,id_libro,id_cliente,id_empleado,creado_en) values (?,SYSDATE,'N',?,?,?,SYSDATE)";
            this.st = this.cnx.prepareStatement(sql);
            this.st.setString(1, this.codigo);
            this.st.setInt(2, this.id_libro);
            this.st.setInt(3, this.id_cliente);
            this.st.setInt(4, this.id_empleado);
            
            return this.ejecutar();
            
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean modificar(int id){
        try {
            String sql = "update prestamo set codigo= ?, modificado_en = SYSDATE,devolucion = SYSDATE,devuelto= 'Y' where id_libro=? and devuelto = 'N'";
            this.st = this.cnx.prepareStatement(sql);
            this.st.setString(1, this.codigo);
            this.st.setInt(2, id);
            
            return this.ejecutar();
            
        } catch (Exception e) {
            return false;
        }
    }
    /*
    public boolean eliminar(){
        try {
            String sql = "delete from libro where id=?";
            this.st = this.cnx.prepareStatement(sql);
            this.st.setInt(1, this.id);
            
            return this.ejecutar();
            
        } catch (Exception e) {
            return false;
        }
    }*/
    
    public LinkedList<Prestamo> buscarPrestamo(String criterio){
    
        LinkedList<Prestamo> prestamos = new LinkedList<Prestamo>();
        try {
            String sql = "select p.id as idprestamo,p.codigo,p.fecha,p.devolucion,p.devuelto,p.id_libro as idlibro,l.nombre as libro,c.id as idcliente,c.nombre as cliente,e.id as idemp,e.nombre as empleado "
                    + "from prestamo p inner join libro l on(p.id_libro = l.id) inner join cliente c on (c.id = p.id_cliente) inner join empleado e on (e.id = p.id_empleado) "
                    + "where c.nombre like ?";
            this.st = this.cnx.prepareStatement(sql);
            this.st.setString(1, "%"+criterio+"%");
            ResultSet rs = this.st.executeQuery();
            while (rs.next()) {                
                Prestamo p = new Prestamo();
                
                p.setId(rs.getInt(1));
                p.setCodigo(rs.getString(2));
                p.setFecha(rs.getDate(3));
                p.setDevolucion(rs.getDate(4));
                p.setDevuelto(rs.getString(5));
                p.setId_libro(rs.getInt(6));
                p.setNombreLibro(rs.getString(7));
                p.setId_cliente(rs.getInt(8));
                p.setNombreCliente(rs.getString(9));
                p.setId_empleado(rs.getInt(10));
                p.setNombreEmpleado(rs.getString(11));
                prestamos.add(p);
            }
        } catch (Exception e) {
            System.out.println("Error al buscar Prestamos");
        }
            return prestamos;
    }
    
}
