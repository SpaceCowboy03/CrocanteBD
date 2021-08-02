
package com.unal.crocante;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Manuel Martinez
 */
public class LocalGasto extends javax.swing.JFrame {

    /**
     * Creates new form Local_Gastos
     */
    public LocalGasto() {

        initComponents();

        llenarGasto();

    }

    private void llenarGasto() {
        MysqlConexion conexion = new MysqlConexion();

        String usuario = "Venus";
        String apellido = "Baquero";
        String contrasena = "gerente";

        conexion.setPassword(contrasena);
        conexion.setUser(usuario);

        Connection conectar = conexion.iniciarConexion();

        int num_gastos = conexion.Contar_tablas(conectar, "Gasto");

        System.out.println(num_gastos);
        try {

            String matris[][] = new String[num_gastos][6];

            Statement s = conectar.createStatement();
            ResultSet rs = s.executeQuery(" select * from Gasto order by gast_id desc");

// Recorremos el resultado, mientras haya registros para leer, y escribimos el resultado en pantalla.
            int i = 0;

            while (rs.next()) {

                matris[i][0] = rs.getString(1);
                matris[i][1] = rs.getString(2);
                matris[i][2] = rs.getString(3);
                matris[i][3] = rs.getString(4);
                matris[i][4] = rs.getString(5);
                matris[i][5] = rs.getString(6);

                i++;

            }

            System.out.println(matris);

            jTable1.setModel(new javax.swing.table.DefaultTableModel(
                    matris,
                    new String[]{
                        "ID", "Nombre del Gasto", "Costo", "fecha", "gast_tipo", "sede"
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Eliminar = new javax.swing.JButton();
        Editar = new javax.swing.JButton();
        Insertar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Fecha_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Costo_txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tipo_txt = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Gastos");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setEnabled(false);
        jScrollPane1.setViewportView(jTable1);

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        Editar.setText("Editar");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });

        Insertar.setText("Insertar");
        Insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarActionPerformed(evt);
            }
        });

        jButton2.setText("Atras");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Fecha_txt.setText("0000-00-00");

        jLabel2.setText("Fecha");

        jLabel3.setText("Minimo Costo ");

        jLabel4.setText("Tipo Costo ");

        tipo_txt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todo", "Nomina", "Servicios", "Insumos", "Otro" }));
        tipo_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo_txtActionPerformed(evt);
            }
        });

        jButton1.setText("Recargar Datos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Insertar, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(Fecha_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel1)
                                        .addGap(205, 205, 205)
                                        .addComponent(jButton2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Costo_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tipo_txt, 0, 145, Short.MAX_VALUE)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jLabel1))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Fecha_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Costo_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(tipo_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Insertar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed

        new LocalGastoEliminar().setVisible(true);

    }//GEN-LAST:event_EliminarActionPerformed

    private void InsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarActionPerformed

        new LocalGastoInsertar().setVisible(true);

    }//GEN-LAST:event_InsertarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        LocalMenu prov = new LocalMenu();
        prov.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void tipo_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipo_txtActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus

        System.out.println("identificado");
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        while (model.getRowCount() > 0) {
            model.setRowCount(0);
        }
        llenarGasto();
    }//GEN-LAST:event_formWindowGainedFocus

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        new LocalGastoEditar().setVisible(true);
    }//GEN-LAST:event_EditarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int costo = 0;

        MysqlConexion conexion = new MysqlConexion();

        String usuario = "Venus";
        String apellido = "Baquero";
        String contrasena = "gerente";

        conexion.setPassword(contrasena);
        conexion.setUser(usuario);

        Connection conectar = conexion.iniciarConexion();

        int num_gastos = conexion.Contar_tablas(conectar, "Gasto");

        System.out.println(num_gastos);

        String Fecha = Fecha_txt.getText();
        String S_Costo = Costo_txt.getText();
        String S_Tipo = (String) tipo_txt.getSelectedItem();

        try {

            if ("Todo".equals(S_Tipo)) {

                try {

                    if ("".equals(S_Costo)) {

                        costo = 0;

                    } else {

                        costo = Integer.parseInt(S_Costo);

                    }

                    String matris[][] = new String[num_gastos][6];

                    Statement s = conectar.createStatement();
                    ResultSet rs = s.executeQuery("select * from Gasto where gast_fecha > '" + Fecha + "' and gast_costo > " + costo + " order by gast_id desc");

                    // Recorremos el resultado, mientras haya registros para leer, y escribimos el resultado en pantalla.
                    int i = 0;

                    while (rs.next()) {

                        matris[i][0] = rs.getString(1);
                        matris[i][1] = rs.getString(2);
                        matris[i][2] = rs.getString(3);
                        matris[i][3] = rs.getString(4);
                        matris[i][4] = rs.getString(5);
                        matris[i][5] = rs.getString(6);

                        i++;

                    }

                    jTable1.setModel(new javax.swing.table.DefaultTableModel(
                            matris,
                            new String[]{
                                "ID", "Nombre del Gasto", "Costo", "fecha", "gast_tipo", "sede"
                            }));

                } catch (SQLException sqle) {
                    System.out.println("Imposible realizar consulta ... FAIL");
                    sqle.printStackTrace();
                }

            } else {

                try {

                    if ("".equals(S_Costo)) {

                        costo = 0;

                    } else {

                        costo = Integer.parseInt(S_Costo);

                    }

                    String matris[][] = new String[num_gastos][6];

                    Statement s = conectar.createStatement();
                    ResultSet rs = s.executeQuery("select * from Gasto where gast_fecha > '" + Fecha + "' and gast_costo > " + costo + " and gast_tipo = '" + S_Tipo + "' order by gast_id desc");

                    // Recorremos el resultado, mientras haya registros para leer, y escribimos el resultado en pantalla.
                    int i = 0;

                    while (rs.next()) {

                        matris[i][0] = rs.getString(1);
                        matris[i][1] = rs.getString(2);
                        matris[i][2] = rs.getString(3);
                        matris[i][3] = rs.getString(4);
                        matris[i][4] = rs.getString(5);
                        matris[i][5] = rs.getString(6);

                        i++;

                    }

                    jTable1.setModel(new javax.swing.table.DefaultTableModel(
                            matris,
                            new String[]{
                                "ID", "Nombre del Gasto", "Costo", "fecha", "gast_tipo", "sede"
                            }));

                } catch (SQLException sqle) {
                    System.out.println("Imposible realizar consulta ... FAIL");
                    sqle.printStackTrace();
                }

            }
        } catch (Exception ex) {
            Logger.getLogger(LocalGastoInsertar.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Ingrese nuevamente los datos", "Datos incorrectos", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(LocalGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LocalGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LocalGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LocalGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LocalGasto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Costo_txt;
    private javax.swing.JButton Editar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JTextField Fecha_txt;
    private javax.swing.JButton Insertar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> tipo_txt;
    // End of variables declaration//GEN-END:variables
}
