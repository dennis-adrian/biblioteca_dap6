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
 */
public class Genero extends Conexion {

    private int id;
    private String nombre;

    public Genero(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Genero() {
        this.id = 0;
        this.nombre = "";
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

    public LinkedList<Genero> buscarGenero() {

        LinkedList<Genero> generos = new LinkedList<Genero>();
        try {
            String sql = "select id,nombre from genero order by id";
            this.st = this.cnx.prepareStatement(sql);
            ResultSet rs = this.st.executeQuery();
            while (rs.next()) {
                Genero genero = new Genero();
                genero.setId(rs.getInt(1));
                genero.setNombre(rs.getString(2));

                generos.add(genero);
            }
        } catch (Exception e) {
            System.out.println("Error al buscar generos");
        }
        return generos;
    }
}
