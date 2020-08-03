/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

/**
 *
 * @author Megashi
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnReportes = new javax.swing.JButton();
        btnLibros = new javax.swing.JButton();
        btnPrestamos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pdf.png"))); // NOI18N
        btnReportes.setBorderPainted(false);
        btnReportes.setContentAreaFilled(false);
        getContentPane().add(btnReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, -1, -1));

        btnLibros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/libro (2).png"))); // NOI18N
        btnLibros.setBorderPainted(false);
        btnLibros.setContentAreaFilled(false);
        btnLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibrosActionPerformed(evt);
            }
        });
        getContentPane().add(btnLibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));

        btnPrestamos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/prestamo.png"))); // NOI18N
        btnPrestamos.setBorderPainted(false);
        btnPrestamos.setContentAreaFilled(false);
        btnPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrestamosActionPerformed(evt);
            }
        });
        getContentPane().add(btnPrestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, -1, -1));

        jLabel2.setFont(new java.awt.Font("Californian FB", 1, 36)); // NOI18N
        jLabel2.setText("Prestamos");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, -1, -1));

        jLabel3.setFont(new java.awt.Font("Californian FB", 1, 36)); // NOI18N
        jLabel3.setText("Libros");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Californian FB", 1, 48)); // NOI18N
        jLabel4.setText("Biblioteca");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo_transparent.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 0, 1140, 700));

        jLabel5.setFont(new java.awt.Font("Californian FB", 1, 36)); // NOI18N
        jLabel5.setText("Reportes");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu.jpeg"))); // NOI18N
        fondo.setText("jLabel1");
        fondo.setMinimumSize(new java.awt.Dimension(1638, 985));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibrosActionPerformed
        // TODO add your handling code here:
        new FormLibro().setVisible(true);
        //this.dispose();//to close the current jframe
    }//GEN-LAST:event_btnLibrosActionPerformed

    private void btnPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrestamosActionPerformed
        // TODO add your handling code here:
        new FormPrestamo().setVisible(true);
    }//GEN-LAST:event_btnPrestamosActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLibros;
    private javax.swing.JButton btnPrestamos;
    private javax.swing.JButton btnReportes;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
