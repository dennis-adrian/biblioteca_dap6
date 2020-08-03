/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Clases.Autor;
import Clases.Genero;
import Clases.Libro;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Megashi
 */
public class FormLibro extends javax.swing.JFrame {

    /**
     * Creates new form FormLibro
     */
    LinkedList<Autor> autores = new LinkedList<Autor>();
    LinkedList<Genero> generos = new LinkedList<Genero>();

    public FormLibro() {
        initComponents();
        cargarCBs();
        mostrarJTableLibros(this.edtBuscar.getText().toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        edtNombreL = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        edtIsbn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        edtAnio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jcbAutores = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        edtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jcbGeneros = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        edtCodLibro = new javax.swing.JTextField();
        btnOpenPrestamos = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        edtStock = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Libro:");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel2.setText("Isbn:");

        jLabel3.setText("Año:");

        jLabel4.setText("Autor:");

        jcbAutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAutoresActionPerformed(evt);
            }
        });

        jLabel5.setText("Genero:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Libro", "ISBN", "Año", "Autor", "Genero", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(50);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(50);
            jTable1.getColumnModel().getColumn(2).setMinWidth(80);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(80);
            jTable1.getColumnModel().getColumn(3).setMinWidth(50);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(50);
            jTable1.getColumnModel().getColumn(6).setMinWidth(50);
            jTable1.getColumnModel().getColumn(6).setMaxWidth(50);
        }

        jLabel6.setText("Buscar:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jcbGeneros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbGenerosActionPerformed(evt);
            }
        });

        jLabel7.setText("Codigo:");

        edtCodLibro.setEditable(false);

        btnOpenPrestamos.setText("Prestamos");
        btnOpenPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenPrestamosActionPerformed(evt);
            }
        });

        jLabel8.setText("Stock:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                .addComponent(edtCodLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(edtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(edtIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(edtNombreL, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jcbAutores, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(edtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(52, 52, 52)
                                        .addComponent(btnBuscar))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addComponent(btnGuardar)
                                        .addGap(31, 31, 31)
                                        .addComponent(btnModificar)
                                        .addGap(32, 32, 32)
                                        .addComponent(btnEliminar)))
                                .addGap(148, 148, 148)
                                .addComponent(btnOpenPrestamos))
                            .addComponent(jcbGeneros, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(edtCodLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(edtNombreL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(edtIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(edtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jcbAutores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jcbGeneros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(edtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar)
                            .addComponent(btnModificar)
                            .addComponent(btnEliminar)
                            .addComponent(btnOpenPrestamos))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(edtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbAutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAutoresActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jcbAutoresActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        try {
            Libro libros = new Libro();
            libros.setNombre(this.edtNombreL.getText());
            libros.setIsbn(this.edtIsbn.getText());
            libros.setAnio_publicacion(Integer.parseInt(this.edtAnio.getText().toString()));
            int filaAutores = this.jcbAutores.getSelectedIndex();
            int filaGeneros = this.jcbGeneros.getSelectedIndex();
            libros.setId_autor(autores.get(filaAutores).getId());
            libros.setId_genero(autores.get(filaGeneros).getId());

            if (libros.insertar()) {
                mostrarMensajeOK("Libro guardado Correctamente");
                this.mostrarJTableLibros(this.edtBuscar.getText().toString());
            } else {
                mostrarMensajeError("Error al guardar el Libro");
            }
        } catch (Exception e) {
            mostrarMensajeError(e.getMessage());
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jcbGenerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbGenerosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbGenerosActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        String id = this.jTable1.getModel().getValueAt(this.jTable1.getSelectedRow(), 0).toString();
        String nombre = this.jTable1.getModel().getValueAt(this.jTable1.getSelectedRow(), 1).toString();
        String isbn = this.jTable1.getModel().getValueAt(this.jTable1.getSelectedRow(), 2).toString();
        String anio = this.jTable1.getModel().getValueAt(this.jTable1.getSelectedRow(), 3).toString();
        String nombreAutor = this.jTable1.getModel().getValueAt(this.jTable1.getSelectedRow(), 4).toString();
        String nombreGenero = this.jTable1.getModel().getValueAt(this.jTable1.getSelectedRow(), 5).toString();
        String stock = this.jTable1.getModel().getValueAt(this.jTable1.getSelectedRow(), 6).toString();
        
        this.jcbAutores.setSelectedItem(nombreAutor);
        this.jcbGeneros.setSelectedItem(nombreGenero);
        this.edtCodLibro.setText(id);
        this.edtNombreL.setText(nombre);
        this.edtIsbn.setText(isbn);
        this.edtAnio.setText(anio);
        this.edtStock.setText(stock);
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        mostrarJTableLibros(this.edtBuscar.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        try {
            Libro libros = new Libro();
            libros.setId(Integer.parseInt(this.edtCodLibro.getText().toString()));
            libros.setCantidad(Integer.parseInt(this.edtStock.getText().toString()));
            libros.setNombre(this.edtNombreL.getText());
            libros.setIsbn(this.edtIsbn.getText());
            libros.setAnio_publicacion(Integer.parseInt(this.edtAnio.getText().toString()));
            int filaAutores = this.jcbAutores.getSelectedIndex();
            int filaGeneros = this.jcbGeneros.getSelectedIndex();
            libros.setId_autor(autores.get(filaAutores).getId());
            libros.setId_genero(autores.get(filaGeneros).getId());

            if (libros.modificar()) {
                mostrarMensajeOK("Libro modificado Correctamente");
                this.mostrarJTableLibros(this.edtBuscar.getText().toString());
            } else {
                mostrarMensajeError("Error al modificar el Libro");
            }
        } catch (Exception e) {
            mostrarMensajeError(e.getMessage());
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        try {
            if (confirmarAccion("Esta seguro de eliminar el Libro?")) {
                Libro libro = new Libro();
                libro.setId(Integer.parseInt(this.edtCodLibro.getText().toString()));

                if (libro.eliminar()) {
                    mostrarMensajeOK("Libro eliminado Correctamente");
                    this.mostrarJTableLibros(this.edtBuscar.getText().toString());
                } else {
                    mostrarMensajeError("Error al eliminar el Producto");
                }
            }

        } catch (Exception e) {
            mostrarMensajeError(e.getMessage());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnOpenPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenPrestamosActionPerformed
        // TODO add your handling code here:
        new FormPrestamo().setVisible(true);
        this.dispose();//to close the current jframe
    }//GEN-LAST:event_btnOpenPrestamosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLibro().setVisible(true);
            }
        });
    }

    private void cargarCBs() {
        Autor objAutor = new Autor();
        Genero objGenero = new Genero();
        autores = objAutor.buscarAutor();
        generos = objGenero.buscarGenero();
        for (int i = 0; i < autores.size(); i++) {
            this.jcbAutores.addItem(autores.get(i).getNombre());
        }
        for (int i = 0; i < generos.size(); i++) {
            this.jcbGeneros.addItem(generos.get(i).getNombre());
        }
    }

    private void mostrarMensajeOK(String msg) {
        JOptionPane.showMessageDialog(this, msg, "Informacion", JOptionPane.INFORMATION_MESSAGE);
    }

    private void mostrarMensajeError(String msg) {
        JOptionPane.showMessageDialog(this, msg, "Informacion", JOptionPane.ERROR_MESSAGE);

    }

    private boolean confirmarAccion(String msg) {
        return JOptionPane.showConfirmDialog(this, msg, "Informacion", JOptionPane.YES_NO_OPTION) == 0;

    }

    private void mostrarJTableLibros(String criterio) {
        try {
            Libro libro = new Libro();
            DefaultTableModel tabla = (DefaultTableModel) this.jTable1.getModel();
            LinkedList<Libro> listaLibros = libro.buscarLibro(criterio);
            tabla.setNumRows(0);
            for (int i = 0; i < listaLibros.size(); i++) {
                Libro l = listaLibros.get(i);
                Object[] fila = {l.getId(), l.getNombre(), l.getIsbn(), l.getAnio_publicacion(), l.getNombreAutor(), l.getNombreGenero(),l.getCantidad()};
                tabla.addRow(fila);
            }
        } catch (Exception e) {
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnOpenPrestamos;
    private javax.swing.JButton btnSalir;
    private javax.swing.JTextField edtAnio;
    private javax.swing.JTextField edtBuscar;
    private javax.swing.JTextField edtCodLibro;
    private javax.swing.JTextField edtIsbn;
    private javax.swing.JTextField edtNombreL;
    private javax.swing.JTextField edtStock;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> jcbAutores;
    private javax.swing.JComboBox<String> jcbGeneros;
    // End of variables declaration//GEN-END:variables

}
