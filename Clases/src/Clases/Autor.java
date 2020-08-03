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
 * id int PRIMARY KEY,
    nombre varchar2(50),
    id_pais int,
    creado_en date,
    modificado_en date,
 */
public class Autor extends Conexion{
    private int id;
    private String nombre;
    private int id_pais;

    public Autor(int id, String nombre, int id_pais) {
        this.id = id;
        this.nombre = nombre;
        this.id_pais = id_pais;
    }
    public Autor() {
        this.id = 0;
        this.nombre = "";
        this.id_pais = 0;
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

    public int getId_pais() {
        return id_pais;
    }

    public void setId_pais(int id_pais) {
        this.id_pais = id_pais;
    }
    
    public LinkedList<Autor> buscarAutor(){
    
        LinkedList<Autor> autores = new LinkedList<Autor>();
        try {
            String sql = "select id,nombre from autor order by id";
            this.st = this.cnx.prepareStatement(sql);
            ResultSet rs = this.st.executeQuery();
            while (rs.next()) {                
                Autor autor = new Autor();
                autor.setId(rs.getInt(1));
                autor.setNombre(rs.getString(2));
                
                autores.add(autor);
            }
        } catch (Exception e) {
            System.out.println("Error al buscar autores");
        }
            return autores;
    }
}
