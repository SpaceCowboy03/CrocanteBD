/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unal.crocante;

import com.mysql.cj.jdbc.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Manuel Martinez
 */
public class LocalEmpleado extends javax.swing.JFrame {

    /**
     * Creates new form LocalEmpleado
     */
    public LocalEmpleado() {
        initComponents();
        
        MysqlConexion conexion = new MysqlConexion();

        String usuario = "Venus";
        String apellido = "Baquero";
        String contrasena = "gerente";

        conexion.setPassword(contrasena);
        conexion.setUser(usuario);

        Connection conectar = conexion.iniciarConexion();

        int num_gastos = conexion.Contar_tablas(conectar, "Empleado");

        System.out.println(num_gastos);
        try {

            String matris[][] = new String[num_gastos][6];

            Statement s = conectar.createStatement();
            ResultSet rs = s.executeQuery("select emp_id, concat(per_nombre,'"+" "+"', per_apellido) , emp_horasSemanales, sal_valor,Sede_sede_id  from Empleado join Cargo on (Cargo_car_id = car_id) join Persona on (Persona_per_id = per_id) join Salario on (Empleado_emp_id = emp_id) where emp_estado = 1;");

// Recorremos el resultado, mientras haya registros para leer, y escribimos el resultado en pantalla.
            int i = 0;

            while (rs.next()) {

                matris[i][0] = rs.getString(1);
                matris[i][1] = rs.getString(2);
                matris[i][2] = rs.getString(3);
                matris[i][3] = rs.getString(4);
                matris[i][4] = rs.getString(5);

                i++;

            }

            System.out.println(matris);

            jTable1.setModel(new javax.swing.table.DefaultTableModel(
                    matris,
                    new String[]{
                        "ID", "Nombre del Empleado", "horas semanales","Salario","sede"
                    }));

        } catch (SQLException sqle) {
            System.out.println("Imposible realizar consulta ... FAIL");
            sqle.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Editar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Recargar_datos_empleado = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Atras = new javax.swing.JButton();
        Pagar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setEnabled(false);
        jScrollPane1.setViewportView(jTable1);

        Editar.setText("Editar");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        Recargar_datos_empleado.setText("Recargar Datos");
        Recargar_datos_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Recargar_datos_empleadoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Empleados");

        Atras.setText("Atras");
        Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }
        });

        Pagar.setText("Pagar");
        Pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Recargar_datos_empleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(Pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Atras))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Atras)))
                .addGap(18, 18, 18)
                .addComponent(Recargar_datos_empleado)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        new LocalEmpleadoEditar().setVisible(true);
    }//GEN-LAST:event_EditarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed

        new LocalEmpleadoEliminar().setVisible(true);
    }//GEN-LAST:event_EliminarActionPerformed

    private void Recargar_datos_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Recargar_datos_empleadoActionPerformed

       MysqlConexion conexion = new MysqlConexion();

        String usuario = "Venus";
        String apellido = "Baquero";
        String contrasena = "gerente";

        conexion.setPassword(contrasena);
        conexion.setUser(usuario);

        Connection conectar = conexion.iniciarConexion();

        int num_gastos = conexion.Contar_tablas(conectar, "Empleado");

        System.out.println(num_gastos);
        try {

            String matris[][] = new String[num_gastos][6];

            Statement s = conectar.createStatement();
            ResultSet rs = s.executeQuery("select emp_id, concat(per_nombre,'"+" "+"', per_apellido) , emp_horasSemanales, sal_valor,Sede_sede_id  from Empleado join Cargo on (Cargo_car_id = car_id) join Persona on (Persona_per_id = per_id) join Salario on (Empleado_emp_id = emp_id) where emp_estado = 1;");

// Recorremos el resultado, mientras haya registros para leer, y escribimos el resultado en pantalla.
            int i = 0;

               while (rs.next()) {

                matris[i][0] = rs.getString(1);
                matris[i][1] = rs.getString(2);
                matris[i][2] = rs.getString(3);
                matris[i][3] = rs.getString(4);
                matris[i][4] = rs.getString(5);

                i++;

            }

            System.out.println(matris);

            jTable1.setModel(new javax.swing.table.DefaultTableModel(
                    matris,
                    new String[]{
                        "ID", "Nombre del Empleado", "horas semanales","Salario","sede"
                    }));

        } catch (SQLException sqle) {
            System.out.println("Imposible realizar consulta ... FAIL");
            sqle.printStackTrace();
        }

    }//GEN-LAST:event_Recargar_datos_empleadoActionPerformed

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed

        new Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_AtrasActionPerformed

    private void PagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagarActionPerformed
        
        MysqlConexion conexion = new MysqlConexion();

        String usuario = "Venus";
        String apellido = "Baquero";
        String contrasena = "gerente";

        conexion.setPassword(contrasena);
        conexion.setUser(usuario);

        Connection conectar = conexion.iniciarConexion();
        
        try {

                        String Consulta = "{call gast_salario()}";

                        CallableStatement procedimiento = (CallableStatement) conectar.prepareCall(Consulta);

                        procedimiento.execute();

                        JOptionPane.showMessageDialog(this, "Se realizo el pago con exito");

                    } catch (SQLException ex) {
                        Logger.getLogger(LocalGastoInsertar.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(this, "La conexion fallo, vuelva a intentar", "Error de conexion", JOptionPane.ERROR_MESSAGE);
                    }
        
    }//GEN-LAST:event_PagarActionPerformed

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
            java.util.logging.Logger.getLogger(LocalEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LocalEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LocalEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LocalEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LocalEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atras;
    private javax.swing.JButton Editar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Pagar;
    private javax.swing.JButton Recargar_datos_empleado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
