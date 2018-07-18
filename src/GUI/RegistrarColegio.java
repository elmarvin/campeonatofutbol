/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Clases.Colegio;
import Logica.ManColegio;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Karlita
 */
public class RegistrarColegio extends javax.swing.JFrame {

    ArrayList<Colegio> ArrayColegios = new ArrayList<>();
    ManColegio objManCol = new ManColegio();

    public RegistrarColegio() {

        this.setResizable(false);
        initComponents();
        VaciarRegistros();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CancelarArbitro = new javax.swing.JButton();
        RegistrarColegio = new javax.swing.JButton();
        EliminarArbitro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jTextTelefono = new javax.swing.JTextField();
        jTextRepre = new javax.swing.JTextField();
        jTextCod = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CancelarArbitro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CancelarArbitro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/back.png"))); // NOI18N
        CancelarArbitro.setText("Regresar");
        CancelarArbitro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarArbitroActionPerformed(evt);
            }
        });

        RegistrarColegio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RegistrarColegio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/guardar.png"))); // NOI18N
        RegistrarColegio.setText("Registrar");
        RegistrarColegio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarColegioActionPerformed(evt);
            }
        });

        EliminarArbitro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EliminarArbitro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Papelera_de_reciclaje.png"))); // NOI18N
        EliminarArbitro.setText("Eliminar");
        EliminarArbitro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarArbitroActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/colegio.png"))); // NOI18N
        jLabel1.setText("REGISTRAR COLEGIO");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Representante:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Teléfono:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Código:");

        jTextTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTelefonoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(CancelarArbitro)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                .addComponent(RegistrarColegio)
                                .addGap(38, 38, 38)
                                .addComponent(EliminarArbitro))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                        .addComponent(jTextRepre)
                                        .addComponent(jTextTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextCod, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextRepre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelarArbitro, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RegistrarColegio)
                    .addComponent(EliminarArbitro))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void VaciarRegistros() {

        this.jTextCod.setText("");
        this.jTextNombre.setText("");
        this.jTextTelefono.setText("");
        this.jTextRepre.setText("");
    }

    private void CancelarArbitroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarArbitroActionPerformed
        MenuEntrenador mentrenador = new MenuEntrenador();
        mentrenador.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CancelarArbitroActionPerformed

    private void RegistrarColegioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarColegioActionPerformed

        if (this.jTextNombre.getText().equals("") || this.jTextTelefono.getText().equals("") || this.jTextRepre.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "POR FAVOR INGRESE TODOS LOS CAMPOS", "REGISTRO DE COLEGIOS", JOptionPane.WARNING_MESSAGE);

        } else {

            Colegio objColegio = new Colegio(0, this.jTextCod.getText(), this.jTextNombre.getText(), this.jTextTelefono.getText(), this.jTextRepre.getText());

            ArrayColegios.add(objColegio);

            int resultado = 0;

            try {
                resultado = objManCol.AgregarColegio(objColegio);

                if (resultado == 1) {
                    JOptionPane.showMessageDialog(null, "DATOS REGISTRADOS");
                } else {
                    JOptionPane.showMessageDialog(null, "NO SE PUDO REGISTRAR");
                }
            } catch (SQLException ex) {
                Logger.getLogger(RegistrarColegio.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(RegistrarColegio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        VaciarRegistros();
    }//GEN-LAST:event_RegistrarColegioActionPerformed

    private void EliminarArbitroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarArbitroActionPerformed
        JOptionPane.showMessageDialog(this, "COLEGIO ELIMINADO");
    }//GEN-LAST:event_EliminarArbitroActionPerformed

    private void jTextTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTelefonoActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarColegio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarColegio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarColegio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarColegio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarColegio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelarArbitro;
    private javax.swing.JButton EliminarArbitro;
    private javax.swing.JButton RegistrarColegio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextCod;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextRepre;
    private javax.swing.JTextField jTextTelefono;
    // End of variables declaration//GEN-END:variables
}