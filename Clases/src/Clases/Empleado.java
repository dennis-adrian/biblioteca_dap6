/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Conexion.Conexion;
import java.sql.ResultSet;
import java.util.LinkedList;

/**
 *
 * @author Megashi
 * 
 * id int PRIMARY KEY,
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
 * 
 */
public class Empleado extends Conexion{
    private int id;
    private String nombre;
    private String apelllido;
    
    private String nombreCompleto;

    public Empleado(int id, String nombre, String apelllido) {
        this.id = id;
        this.nombre = nombre;
        this.apelllido = apelllido;
    }
    
    public Empleado() {
        this.id = 0;
        this.nombre = "";
        this.apelllido = "";
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

    public String getApelllido() {
        return apelllido;
    }

    public void setApelllido(String apelllido) {
        this.apelllido = apelllido;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    
    public LinkedList<Empleado> buscarEmpleado(String criterio){
    
        LinkedList<Empleado> empleados = new LinkedList<Empleado>();
        try {
            String sql = "select id,apellido ||' '|| nombre as nombre from empleado where nombre like ? and rownum <= 50 order by nombre";
            //String sql = "select * from testview where nombre like ?";
            this.st = this.cnx.prepareStatement(sql);
            this.st.setString(1, "%"+criterio+"%");
            ResultSet rs = this.st.executeQuery();
            while (rs.next()) {                
                Empleado e = new Empleado();
                e.setId(rs.getInt(1));
                e.setNombreCompleto(rs.getString(2));
                empleados.add(e);
            }
        } catch (Exception e) {
            System.out.println("Error al buscar Clientes");
        }
            return empleados;
    }
    
}
