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
 * 
 * id int PRIMARY KEY,
    nombre varchar2(20),
    apellido varchar2(20),
    fecha_nac date,
    domicilio varchar2(100),
    telefono varchar2(20),
    email varchar2(50),
    creado_en date,
    modificado_en date
 */
public class Cliente extends Conexion{
    private int id;
    private String nombre;
    private String apellido;
    private Date fecha_nac;
    private String domicilio;
    private String telefono;
    private String email;
    ///////////////////
    private String nombreCompleto;

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Cliente(int id, String nombre, String apellido, Date fecha_nac, String domicilio, String telefono, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nac = fecha_nac;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.email = email;
    }
    public Cliente() {
        this.id = 0;
        this.nombre = "";
        this.apellido = "";
        this.fecha_nac = new Date();
        this.domicilio = "";
        this.telefono = "";
        this.email = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    //select id,nombre ||' '|| apellido as nombre from cliente where nombre like ? order by nombre
    public LinkedList<Cliente> buscarCliente(String criterio){
    
        LinkedList<Cliente> clientes = new LinkedList<Cliente>();
        try {
            String sql = "select id,apellido ||' '|| nombre as nombre from cliente where nombre like ? and rownum <= 50 order by nombre";
            //String sql = "select * from testview where nombre like ?";
            this.st = this.cnx.prepareStatement(sql);
            this.st.setString(1, "%"+criterio+"%");
            ResultSet rs = this.st.executeQuery();
            while (rs.next()) {                
                Cliente c = new Cliente();
                c.setId(rs.getInt(1));
                c.setNombreCompleto(rs.getString(2));
                clientes.add(c);
            }
        } catch (Exception e) {
            System.out.println("Error al buscar Clientes");
        }
            return clientes;
    }
    
}
