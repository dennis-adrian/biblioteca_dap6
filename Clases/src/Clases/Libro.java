/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Conexion.Conexion;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author Megashi
 * id int PRIMARY KEY,
    nombre varchar2(50),
    isbn varchar2(20),
    anio_publicacion int,
    id_autor int,
    id_genero int,
    creado_en date,
    modificado_en date
    * 
    * set nls_date_format = 'DD-MON-YYYY HH24:MI:SS';
 */
public class Libro extends Conexion{
    private int id;
    private String nombre;
    private String isbn;
    private int anio_publicacion;
    private int id_autor;
    private int id_genero;
    private Date creado_en;
    private Date modificado_en;
     //////////////////////////SOLO PARA PARTE VISUAL/////////////////////////
    private String nombreAutor;
    private String nombreGenero;
    
    private int cantidad;

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public String getNombreGenero() {
        return nombreGenero;
    }

    public void setNombreGenero(String nombreGenero) {
        this.nombreGenero = nombreGenero;
    }

    DateFormat dfor = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
    
    
    public Libro(int id, String nombre, String isbn, int anio_publicacion, int id_autor, int id_genero, Date creado_en, Date modificado_en) {
        this.id = id;
        this.nombre = nombre;
        this.isbn = isbn;
        this.anio_publicacion = anio_publicacion;
        this.id_autor = id_autor;
        this.id_genero = id_genero;
        this.creado_en = creado_en;
        this.modificado_en = modificado_en;
    }
    public Libro() {
        this.id = 0;
        this.nombre = "";
        this.isbn = "";
        this.anio_publicacion = 0;
        this.id_autor = 0;
        this.id_genero = 0;
        this.creado_en = new Date();
        this.modificado_en = new Date();
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getAnio_publicacion() {
        return anio_publicacion;
    }

    public void setAnio_publicacion(int anio_publicacion) {
        this.anio_publicacion = anio_publicacion;
    }

    public int getId_autor() {
        return id_autor;
    }

    public void setId_autor(int id_autor) {
        this.id_autor = id_autor;
    }

    public int getId_genero() {
        return id_genero;
    }

    public void setId_genero(int id_genero) {
        this.id_genero = id_genero;
    }

    public Date getCreado_en() {
        return creado_en;
    }

    public void setCreado_en(Date creado_en) {
        this.creado_en = creado_en;
    }

    public Date getModificado_en() {
        return modificado_en;
    }

    public void setModificado_en(Date modificado_en) {
        this.modificado_en = modificado_en;
    }

    public DateFormat getDfor() {
        return dfor;
    }

    public void setDfor(DateFormat dfor) {
        this.dfor = dfor;
    }
    
    public boolean insertar(){ //insert into libro (nombre,isbn,anio_publicacion,id_autor,id_genero,creado_en) values ('Cien Años de Soledad','9781234567897',1967,1,4, SYSDATE);
        try {
            String sql = "insert into libro (nombre,isbn,anio_publicacion,id_autor,id_genero,creado_en) values (?,?,?,?,?,SYSDATE)";
            
            this.st = this.cnx.prepareStatement(sql);
            this.st.setString(1, this.nombre);
            this.st.setString(2, this.isbn);
            this.st.setInt(3, this.anio_publicacion);
            this.st.setInt(4, this.id_autor);
            this.st.setInt(5, this.id_genero);
            
            return this.ejecutar();
            
        } catch (Exception e) {
            return false;
        }
    }
    
        
    public boolean modificar(){
        try {
            String sql = "update libro set nombre = ?, isbn = ?, anio_publicacion = ?,id_autor = ?, id_genero = ?  where id=?";
            this.st = this.cnx.prepareStatement(sql);
            this.st.setString(1, this.nombre);
            this.st.setString(2, this.isbn);
            this.st.setInt(3, this.anio_publicacion);
            this.st.setInt(4, this.id_autor);
            this.st.setInt(5, this.id_genero);
            this.st.setInt(6, this.id);
            
            String sq2 = "update stock set cantidad = ?,modificado_en = SYSDATE where id_libro = ?";
            this.st = this.cnx.prepareStatement(sq2);
            this.st.setInt(1, this.cantidad);
            this.st.setInt(2, this.id);
            
            return this.ejecutar();
            
        } catch (Exception e) {
            return false;
        }
    }
    
    
    public boolean eliminar(){
        try {
            String sql = "delete from libro where id=?";
            this.st = this.cnx.prepareStatement(sql);
            this.st.setInt(1, this.id);
            
            return this.ejecutar();
            
        } catch (Exception e) {
            return false;
        }
    }
    
    public LinkedList<Libro> buscarLibro(String criterio){
    
        LinkedList<Libro> libros = new LinkedList<Libro>();
        try {
            String sql = "select l.id,l.nombre,l.isbn,l.anio_publicacion,l.id_autor,a.nombre,l.id_genero,g.nombre,s.cantidad "
                    + "from libro l inner join autor a on(l.id_autor = a.id) inner join genero g on (g.id = l.id_genero) inner join stock s on (s.id_libro = l.id)"
                    + "where l.nombre like ?";
            //String sql = "select * from testview where nombre like ?";
            this.st = this.cnx.prepareStatement(sql);
            this.st.setString(1, "%"+criterio+"%");
            ResultSet rs = this.st.executeQuery();
            while (rs.next()) {                
                Libro l = new Libro();
                l.setId(rs.getInt(1));
                l.setNombre(rs.getString(2));
                l.setIsbn(rs.getString(3));
                l.setAnio_publicacion(rs.getInt(4));
                l.setId_autor(rs.getInt(5));
                l.setNombreAutor(rs.getString(6));
                l.setId_genero(rs.getInt(7));
                l.setNombreGenero(rs.getString(8));
                l.setCantidad(rs.getInt(9));
                libros.add(l);
            }
        } catch (Exception e) {
            System.out.println("Error al buscar Libros");
        }
            return libros;
    }
    
}
