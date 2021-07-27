/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unal.crocante.venta.pedido;

import com.unal.crocante.MysqlConexion;
import com.unal.crocante.venta.VentaPrincipal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author VenusBaquero
 */
public class AgregarPedido extends javax.swing.JFrame {

    private String tipoProd;
    private int idVenta;
    private Connection conexion;

    /**
     * Creates new form AgregarPedido
     */
    public AgregarPedido() {
        initComponents();

        llenarInfoMenu();
    }

    public AgregarPedido(int idVenta) {
        this();
        this.idVenta = idVenta;
        llenarInfoMenu();

        MysqlConexion conector = new MysqlConexion("Venus", "gerente");
        conexion = conector.iniciarConexion();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        volverBtn = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        menu = new javax.swing.JTable();
        addBtn = new javax.swing.JButton();
        seleccionLabel = new javax.swing.JLabel();
        menuComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        volverBtn.setText("Volver");
        volverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverBtnActionPerformed(evt);
            }
        });

        menu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idProducto", "producto", "tipo", "precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        menu.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(menu);

        addBtn.setText("Añadir");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        seleccionLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        seleccionLabel.setText("Crear Pedido");

        menuComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Menu", "Hamburguesa", "Perro Caliente", "Carnes", "Varios", "Mazorcada", "Salchipapa", "Bebidas", "Adiciones" }));
        menuComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuComboBoxActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(addBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(seleccionLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(menuComboBox, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(seleccionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(menuComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(addBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seleccionLabel)
                    .addComponent(menuComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(addBtn)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(volverBtn)
                .addGap(0, 428, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1)
                .addGap(27, 27, 27)
                .addComponent(volverBtn))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverBtnActionPerformed
        dispose();
    }//GEN-LAST:event_volverBtnActionPerformed

    private void menuComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuComboBoxActionPerformed
        System.out.println("ingreso");
        DefaultTableModel model = (DefaultTableModel) menu.getModel();
        while (model.getRowCount() > 0) {
            model.setRowCount(0);
        }
        llenarInfoMenu();
    }//GEN-LAST:event_menuComboBoxActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        int row = menu.getSelectedRow();
        if (row >= 0) {
            int producto = (int) menu.getModel().getValueAt(row, 0);
            System.out.println(producto);
            int cedula = obtenerCedula();

            String queryInsert = "insert into pedido values (" + producto + "," + idVenta + "," + cedula + ");";
            PreparedStatement s;
            try {
                s = conexion.prepareStatement(queryInsert);
                int result = s.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(VentaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(this, "No se seleccionó ningun producto.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private int obtenerCedula() {
        int cc = -1;
        String queryGetCc = "select get_CC_venta(" + idVenta + ");";
        PreparedStatement s;
        try {
            s = conexion.prepareStatement(queryGetCc);
            ResultSet result = s.executeQuery();
            result.next();
            cc = result.getInt(1);
        } catch (SQLException ex) {
            Logger.getLogger(VentaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cc;
    }

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
            java.util.logging.Logger.getLogger(AgregarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable menu;
    private javax.swing.JComboBox<String> menuComboBox;
    private javax.swing.JLabel seleccionLabel;
    private javax.swing.JButton volverBtn;
    // End of variables declaration//GEN-END:variables

    private void llenarInfoMenu() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VentaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        MysqlConexion conector = new MysqlConexion("Venus", "gerente");
        Connection conexion = conector.iniciarConexion();
        tipoProd = (String) menuComboBox.getSelectedItem();
        String consulta;
        if (!"Menu".equals(tipoProd)) {
            consulta = "select pro_id, pro_nombre, tip_tipo, pro_precio "
                    + "from producto join tipo on (tip_id=Tipo_tip_id) "
                    + "where tip_tipo = '" + tipoProd + "';";
        } else {
            consulta = "select pro_id, pro_nombre, tip_tipo, pro_precio "
                    + "from producto join tipo on (tip_id=Tipo_tip_id) ";
        }

        PreparedStatement s;
        try {
            s = conexion.prepareStatement(consulta);
            ResultSet resultado = s.executeQuery();
            while (resultado.next()) {
                int id = resultado.getInt(1);
                String producto = resultado.getString(2);
                String tipo = resultado.getString(3);
                int precio = resultado.getInt(4);
                System.out.println(String.format("%s %s %s %s", Integer.toString(id), producto, tipo, Integer.toString(precio)));
                DefaultTableModel model = (DefaultTableModel) menu.getModel();
                model.addRow(new Object[]{id, producto, tipo, precio});
            }

        } catch (SQLException ex) {
            Logger.getLogger(VentaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
