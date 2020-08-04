/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.*;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Megashi
 */
public class Conexion {

    protected Connection cnx;
    protected PreparedStatement st;
    public ResultSet rs;
    private Connection con = null;

    public Conexion() {
        String urlconnection = "jdbc:oracle:thin:@localhost:1521/BIBLIOTECABD";
        Properties propiedades = new Properties();
        propiedades.setProperty("user", "dbabiblioteca");
        propiedades.setProperty("password", "biblioteca2020");

        try {
            this.cnx = DriverManager.getConnection(urlconnection, propiedades);
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }

    public Connection getConexion() throws ClassNotFoundException {
        try {
            String urlconnection = "jdbc:oracle:thin:@localhost:1521/BIBLIOTECABD";
            Properties propiedades = new Properties();
            propiedades.setProperty("user", "dbabiblioteca");
            propiedades.setProperty("password", "biblioteca2020");
            //Class.forName ("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection(urlconnection, propiedades);
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
            return con;
    }

    public boolean seleccionar(String sql) {
        try {
            this.st = this.cnx.prepareStatement(sql);
            this.rs = this.st.executeQuery();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean ejecutar(String sql) {
        try {
            this.st = this.cnx.prepareStatement(sql);

            if (this.st.executeUpdate() > 0) {//insert,delete,update
                return true;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean ejecutar() {
        try {
            if (this.st.executeUpdate() > 0) {//insert,delete,update
                return true;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
