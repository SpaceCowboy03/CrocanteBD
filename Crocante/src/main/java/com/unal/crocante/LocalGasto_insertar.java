/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unal.crocante;

import com.mysql.cj.jdbc.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Manuel Martinez
 */
public class LocalGasto_insertar extends javax.swing.JFrame {

    /**
     * Creates new form LocalGasto_insertar
     */
    public LocalGasto_insertar() {
        initComponents();
    }
    
    
        MysqlConexion conexion = new MysqlConexion();

        String usuario = "Venus";
        String apellido = "Baquero";
        String contrasena = "gerente";



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Nombre_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Costo_txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        sede_txt = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        tipo_txt = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Insertar");

        jLabel2.setText("Nombre Gasto :");

        jLabel3.setText("Costo :");

        jLabel4.setText("Tipo :");

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        sede_txt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));

        jLabel5.setText("Sede");

        tipo_txt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nomina", "Servicio", "Insumo", "Otro", " " }));
        tipo_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo_txtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(203, 203, 203)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(sede_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Costo_txt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Nombre_txt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tipo_txt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Costo_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipo_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sede_txt)
                    .addComponent(jLabel5))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        conexion.setPassword(contrasena);
        conexion.setUser(usuario);
        Connection conectar = conexion.iniciarConexion();
        
        String nombre = Nombre_txt.getText();

        String S_Costo = Costo_txt.getText();
        
        String Tipo =(String) tipo_txt.getSelectedItem();
        
        String s_Sede =(String) sede_txt.getSelectedItem();
        
        System.out.println(Tipo);

        if (("".equals(nombre)) || ("".equals(S_Costo)) || ("".equals(Tipo))) {

            JOptionPane.showMessageDialog(this, "La informacion esta incompleta vuelva a intentar");

        } else {
            
            int costo = Integer.parseInt(S_Costo);
            
            int sede = Integer.parseInt(s_Sede);

            int i = JOptionPane.showConfirmDialog(this, "¿Estas seguro de agregar esta informacion?\nnombre :"+nombre+"\ncosto :"+S_Costo+"\ntipo :"+Tipo+"\nsede :"+s_Sede);

            if (i == 0) {

                try {
                    
                    String Consulta = "{call Agregar_Gasto(?,?,?,?)}";
                    
                    CallableStatement procedimiento = (CallableStatement) conectar.prepareCall(Consulta);
                    
                    procedimiento.setString(1, nombre);
                    procedimiento.setInt(2, costo);
                    procedimiento.setString(3, Tipo);
                    procedimiento.setInt(4, sede);
                    
                    procedimiento.execute();
                    
                    JOptionPane.showMessageDialog(this, "La informacion se ha insertado con exito");
                    
                    
                    
                } catch (SQLException ex) {
                    Logger.getLogger(LocalGasto_insertar.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            } else if (i == 2) {
                
                dispose();
            } 

        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void tipo_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipo_txtActionPerformed

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
            java.util.logging.Logger.getLogger(LocalGasto_insertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LocalGasto_insertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LocalGasto_insertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LocalGasto_insertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LocalGasto_insertar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Costo_txt;
    private javax.swing.JTextField Nombre_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox<String> sede_txt;
    private javax.swing.JComboBox<String> tipo_txt;
    // End of variables declaration//GEN-END:variables
}
