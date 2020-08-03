/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Clases.Cliente;
import Clases.Empleado;
import Clases.Libro;
import Clases.Prestamo;
import java.text.MessageFormat;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Megashi
 */
public class FormPrestamo extends javax.swing.JFrame {

    /**
     * Creates new form FormPrestamo
     */
    public FormPrestamo() {
        initComponents();
        mostrarJTableCliente(this.edtBuscarCliente.getText().toString());
        mostrarJTableEmpleado(this.edtBuscarEmpleado.getText().toString());
        mostrarJTableLibros(this.edtBuscarLibro.getText().toString());
        mostrarJTablePrestamos(this.edtBuscarPrestamo.getText().toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        edtCodPrestamo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        edtBuscarCliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCliente = new javax.swing.JTable();
        btnBuscarCliente = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePrestamos = new javax.swing.JTable();
        btnPrestar = new javax.swing.JButton();
        btnRecibir = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        edtBuscarEmpleado = new javax.swing.JTextField();
        btnBuscarEmpleado = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableEmpleado = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        edtNombreLibro = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        lblIdLibro = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblIdCliente = new javax.swing.JLabel();
        edtNombreCliente = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        lblIdEmpleado = new javax.swing.JLabel();
        edtNombreEmpleado = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        edtBuscarLibro = new javax.swing.JTextField();
        btnBuscarLibro = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableLibros = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        edtBuscarPrestamo = new javax.swing.JTextField();
        btnBuscarPrestamo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnImprimir = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("ID:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 195, -1, -1));

        jLabel8.setText("Codigo:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 301, -1, -1));

        edtCodPrestamo.setEditable(false);
        getContentPane().add(edtCodPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 298, 162, -1));

        jLabel10.setText("Cliente:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 38, -1, -1));
        getContentPane().add(edtBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 35, 148, -1));

        jTableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Cod.", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCliente);
        if (jTableCliente.getColumnModel().getColumnCount() > 0) {
            jTableCliente.getColumnModel().getColumn(0).setMinWidth(50);
            jTableCliente.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 63, 306, 181));

        btnBuscarCliente.setText("Buscar");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 34, -1, -1));

        jTablePrestamos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Codigo", "Fec_Ent", "Fec_Dev", "Devuelto", "Id_Libro", "Nom_Libro", "Id_Cli", "Nom_Cliente", "Id_Emp", "Nom_Empleado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablePrestamos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePrestamosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTablePrestamos);
        if (jTablePrestamos.getColumnModel().getColumnCount() > 0) {
            jTablePrestamos.getColumnModel().getColumn(0).setMinWidth(50);
            jTablePrestamos.getColumnModel().getColumn(0).setMaxWidth(50);
            jTablePrestamos.getColumnModel().getColumn(1).setMinWidth(50);
            jTablePrestamos.getColumnModel().getColumn(1).setMaxWidth(50);
            jTablePrestamos.getColumnModel().getColumn(4).setMinWidth(40);
            jTablePrestamos.getColumnModel().getColumn(4).setMaxWidth(40);
            jTablePrestamos.getColumnModel().getColumn(5).setMinWidth(50);
            jTablePrestamos.getColumnModel().getColumn(5).setMaxWidth(50);
            jTablePrestamos.getColumnModel().getColumn(7).setMinWidth(50);
            jTablePrestamos.getColumnModel().getColumn(7).setMaxWidth(50);
            jTablePrestamos.getColumnModel().getColumn(9).setMinWidth(50);
            jTablePrestamos.getColumnModel().getColumn(9).setMaxWidth(50);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 511, 936, 238));

        btnPrestar.setText("Prestar");
        btnPrestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrestarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPrestar, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 357, -1, -1));

        btnRecibir.setText("Recibir");
        btnRecibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecibirActionPerformed(evt);
            }
        });
        getContentPane().add(btnRecibir, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 357, -1, -1));

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 700, 120, 46));

        jLabel12.setText("Empleado:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(776, 38, -1, -1));
        getContentPane().add(edtBuscarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 35, 148, -1));

        btnBuscarEmpleado.setText("Buscar");
        btnBuscarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEmpleadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(984, 34, -1, -1));

        jTableEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Cod.", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEmpleadoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableEmpleado);
        if (jTableEmpleado.getColumnModel().getColumnCount() > 0) {
            jTableEmpleado.getColumnModel().getColumn(0).setMinWidth(50);
            jTableEmpleado.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(776, 63, 306, 181));

        jLabel13.setText("Libro:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 223, -1, -1));

        edtNombreLibro.setEditable(false);
        getContentPane().add(edtNombreLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 220, 162, -1));
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 264, -1, -1));

        lblIdLibro.setText("id");
        getContentPane().add(lblIdLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 223, -1, -1));

        jLabel16.setText("Cliente:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 249, -1, -1));

        lblIdCliente.setText("id");
        getContentPane().add(lblIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 249, -1, -1));

        edtNombreCliente.setEditable(false);
        getContentPane().add(edtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 246, 162, -1));

        jLabel18.setText("Empleado:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 275, -1, -1));

        lblIdEmpleado.setText("id");
        getContentPane().add(lblIdEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 275, -1, -1));

        edtNombreEmpleado.setEditable(false);
        getContentPane().add(edtNombreEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 272, 162, -1));

        jLabel15.setText("Libro:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 292, -1, -1));
        getContentPane().add(edtBuscarLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 289, 148, -1));

        btnBuscarLibro.setText("Buscar");
        btnBuscarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarLibroActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscarLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(618, 288, -1, -1));

        jTableLibros.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableLibrosMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTableLibros);
        if (jTableLibros.getColumnModel().getColumnCount() > 0) {
            jTableLibros.getColumnModel().getColumn(0).setMinWidth(50);
            jTableLibros.getColumnModel().getColumn(0).setMaxWidth(50);
            jTableLibros.getColumnModel().getColumn(1).setMinWidth(200);
            jTableLibros.getColumnModel().getColumn(1).setMaxWidth(200);
            jTableLibros.getColumnModel().getColumn(2).setMinWidth(80);
            jTableLibros.getColumnModel().getColumn(2).setMaxWidth(80);
            jTableLibros.getColumnModel().getColumn(3).setMinWidth(80);
            jTableLibros.getColumnModel().getColumn(3).setMaxWidth(80);
            jTableLibros.getColumnModel().getColumn(6).setMinWidth(50);
            jTableLibros.getColumnModel().getColumn(6).setMaxWidth(50);
        }

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 317, 680, 125));

        jLabel17.setText("Prestamo:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 486, -1, -1));
        getContentPane().add(edtBuscarPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 483, 260, -1));

        btnBuscarPrestamo.setText("Buscar");
        btnBuscarPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPrestamoActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscarPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 482, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/prestamo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel1.setFont(new java.awt.Font("Californian FB", 1, 36)); // NOI18N
        jLabel1.setText("Prestamos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        btnImprimir.setText("PDF");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        getContentPane().add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 630, 120, 46));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu.jpeg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-460, -190, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClienteMouseClicked
        // TODO add your handling code here:
        String id = this.jTableCliente.getModel().getValueAt(this.jTableCliente.getSelectedRow(), 0).toString();
        String nombre = this.jTableCliente.getModel().getValueAt(this.jTableCliente.getSelectedRow(), 1).toString();
        
        this.lblIdCliente.setText(id);
        this.edtNombreCliente.setText(nombre);
    }//GEN-LAST:event_jTableClienteMouseClicked

    private void jTableEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEmpleadoMouseClicked
        // TODO add your handling code here:
        String id = this.jTableEmpleado.getModel().getValueAt(this.jTableEmpleado.getSelectedRow(), 0).toString();
        String nombre = this.jTableEmpleado.getModel().getValueAt(this.jTableEmpleado.getSelectedRow(), 1).toString();
        
        this.lblIdEmpleado.setText(id);
        this.edtNombreEmpleado.setText(nombre);
    }//GEN-LAST:event_jTableEmpleadoMouseClicked

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();//to close the current jframe
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        // TODO add your handling code here:
        mostrarJTableCliente(this.edtBuscarCliente.getText().toString());
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnBuscarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEmpleadoActionPerformed
        // TODO add your handling code here:
        mostrarJTableEmpleado(this.edtBuscarEmpleado.getText().toString());
    }//GEN-LAST:event_btnBuscarEmpleadoActionPerformed

    private void btnBuscarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarLibroActionPerformed
        // TODO add your handling code here:
        mostrarJTableLibros(this.edtBuscarLibro.getText().toString());
    }//GEN-LAST:event_btnBuscarLibroActionPerformed

    private void jTablePrestamosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePrestamosMouseClicked
        // TODO add your handling code here:
        //String codigo = this.jTablePrestamos.getModel().getValueAt(this.jTablePrestamos.getSelectedRow(), 0).toString();
        String id_libro = this.jTablePrestamos.getModel().getValueAt(this.jTablePrestamos.getSelectedRow(), 5).toString();
        String nombre_libro = this.jTablePrestamos.getModel().getValueAt(this.jTablePrestamos.getSelectedRow(), 6).toString();
        String id_cliente = this.jTablePrestamos.getModel().getValueAt(this.jTablePrestamos.getSelectedRow(), 7).toString();
        String nombre_cliente = this.jTablePrestamos.getModel().getValueAt(this.jTablePrestamos.getSelectedRow(), 8).toString();
        String id_empleado = this.jTablePrestamos.getModel().getValueAt(this.jTablePrestamos.getSelectedRow(), 9).toString();
        String nombre_empleado = this.jTablePrestamos.getModel().getValueAt(this.jTablePrestamos.getSelectedRow(), 10).toString();
        
        //this.edtCodPrestamo.setText(codigo);
        this.lblIdLibro.setText(id_libro);
        this.edtNombreLibro.setText(nombre_libro);
        this.lblIdCliente.setText(id_cliente);
        this.edtNombreCliente.setText(nombre_cliente);
        this.lblIdEmpleado.setText(id_empleado);
        this.edtNombreEmpleado.setText(nombre_empleado);
    }//GEN-LAST:event_jTablePrestamosMouseClicked

    private void jTableLibrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableLibrosMouseClicked
        // TODO add your handling code here:
        String id = this.jTableLibros.getModel().getValueAt(this.jTableLibros.getSelectedRow(), 0).toString();
        String nombre = this.jTableLibros.getModel().getValueAt(this.jTableLibros.getSelectedRow(), 1).toString();
        
        this.lblIdLibro.setText(id);
        this.edtNombreLibro.setText(nombre);
    }//GEN-LAST:event_jTableLibrosMouseClicked

    private void btnBuscarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPrestamoActionPerformed
        // TODO add your handling code here:
        mostrarJTablePrestamos(this.edtBuscarPrestamo.getText().toString());
    }//GEN-LAST:event_btnBuscarPrestamoActionPerformed

    private void btnPrestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrestarActionPerformed
        // TODO add your handling code here:\
        try {
            Prestamo prestamos = new Prestamo();
            prestamos.setCodigo(this.edtCodPrestamo.getText());
            prestamos.setId_cliente(Integer.parseInt(this.lblIdCliente.getText().toString()));
            prestamos.setId_empleado(Integer.parseInt(this.lblIdEmpleado.getText().toString()));
            prestamos.setId_libro(Integer.parseInt(this.lblIdLibro.getText().toString()));
            prestamos.setNombreCliente(this.edtNombreCliente.getText());
            prestamos.setNombreEmpleado(this.edtNombreEmpleado.getText());
            prestamos.setNombreLibro(this.edtNombreLibro.getText());
            
            if (prestamos.insertar()) {
                mostrarMensajeOK("Prestamo registrado Correctamente");
                this.mostrarJTablePrestamos(this.edtBuscarPrestamo.getText().toString());
                this.mostrarJTableLibros(this.edtBuscarLibro.getText().toString());
            } else {
                mostrarMensajeError("Error al registrar el Prestamo");
            }
        } catch (Exception e) {
            mostrarMensajeError(e.getMessage());
        }
    }//GEN-LAST:event_btnPrestarActionPerformed

    private void btnRecibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecibirActionPerformed
        // TODO add your handling code here:
        try {
            Prestamo prestamos = new Prestamo();
            prestamos.setCodigo(this.edtCodPrestamo.getText());
            prestamos.setId_cliente(Integer.parseInt(this.lblIdCliente.getText().toString()));
            prestamos.setId_empleado(Integer.parseInt(this.lblIdEmpleado.getText().toString()));
            prestamos.setId_libro(Integer.parseInt(this.lblIdLibro.getText().toString()));
            prestamos.setNombreCliente(this.edtNombreCliente.getText());
            prestamos.setNombreEmpleado(this.edtNombreEmpleado.getText());
            prestamos.setNombreLibro(this.edtNombreLibro.getText());
            
            if (prestamos.modificar(Integer.parseInt(this.lblIdLibro.getText().toString()))) {
                mostrarMensajeOK("Prestamo registrado Correctamente");
                this.mostrarJTablePrestamos(this.edtBuscarPrestamo.getText().toString());
                this.mostrarJTableLibros(this.edtBuscarLibro.getText().toString());
            } else {
                mostrarMensajeError("Error al registrar el Prestamo");
            }
        } catch (Exception e) {
            mostrarMensajeError(e.getMessage());
        }
    }//GEN-LAST:event_btnRecibirActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        // TODO add your handling code here:
        MessageFormat header = new MessageFormat("Reporte de Prestamos");
        MessageFormat footer = new MessageFormat("Page{0,number,integer}");
        try {
            jTablePrestamos.print(JTable.PrintMode.NORMAL, header, footer);
            
        } catch (java.awt.print.PrinterException e) {
            System.err.format("Error al imprimir", e.getMessage());
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

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
            java.util.logging.Logger.getLogger(FormPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrestamo().setVisible(true);
            }
        });
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
    
    private void mostrarJTableCliente(String criterio) {
        try {
            Cliente cliente = new Cliente();
            DefaultTableModel tabla = (DefaultTableModel) this.jTableCliente.getModel();
            LinkedList<Cliente> listaClientes = cliente.buscarCliente(criterio);
            tabla.setNumRows(0);
            for (int i = 0; i < listaClientes.size(); i++) {
                Cliente c = listaClientes.get(i);
                Object[] fila = {c.getId(), c.getNombreCompleto()};
                tabla.addRow(fila);
            }
        } catch (Exception e) {
        }
    }
    private void mostrarJTableEmpleado(String criterio) {
        try {
            Empleado empleado = new Empleado();
            DefaultTableModel tabla = (DefaultTableModel) this.jTableEmpleado.getModel();
            LinkedList<Empleado> listaEmpleados = empleado.buscarEmpleado(criterio);
            tabla.setNumRows(0);
            for (int i = 0; i < listaEmpleados.size(); i++) {
                Empleado e = listaEmpleados.get(i);
                Object[] fila = {e.getId(), e.getNombreCompleto()};
                tabla.addRow(fila);
            }
        } catch (Exception e) {
        }
    }
    
    private void mostrarJTableLibros(String criterio) {
        try {
            Libro libro = new Libro();
            DefaultTableModel tabla = (DefaultTableModel) this.jTableLibros.getModel();
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
    private void mostrarJTablePrestamos(String criterio) {
        try {
            Prestamo prestamo = new Prestamo();
            DefaultTableModel tabla = (DefaultTableModel) this.jTablePrestamos.getModel();
            LinkedList<Prestamo> listaPrestamo = prestamo.buscarPrestamo(criterio);
            tabla.setNumRows(0);
            for (int i = 0; i < listaPrestamo.size(); i++) {
                Prestamo p = listaPrestamo.get(i);
                Object[] fila = {p.getId(),p.getCodigo(),p.getFecha(),p.getDevolucion(),p.getDevuelto(),p.getId_libro(),p.getNombreLibro(),p.getId_cliente(),p.getNombreCliente(),p.getId_empleado(),p.getNombreEmpleado()};
                tabla.addRow(fila);
            }
        } catch (Exception e) {
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarEmpleado;
    private javax.swing.JButton btnBuscarLibro;
    private javax.swing.JButton btnBuscarPrestamo;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnPrestar;
    private javax.swing.JButton btnRecibir;
    private javax.swing.JButton btnSalir;
    private javax.swing.JTextField edtBuscarCliente;
    private javax.swing.JTextField edtBuscarEmpleado;
    private javax.swing.JTextField edtBuscarLibro;
    private javax.swing.JTextField edtBuscarPrestamo;
    private javax.swing.JTextField edtCodPrestamo;
    private javax.swing.JTextField edtNombreCliente;
    private javax.swing.JTextField edtNombreEmpleado;
    private javax.swing.JTextField edtNombreLibro;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTableCliente;
    private javax.swing.JTable jTableEmpleado;
    private javax.swing.JTable jTableLibros;
    private javax.swing.JTable jTablePrestamos;
    private javax.swing.JLabel lblIdCliente;
    private javax.swing.JLabel lblIdEmpleado;
    private javax.swing.JLabel lblIdLibro;
    // End of variables declaration//GEN-END:variables
}
