/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unal.crocante.venta.opinion;

import com.unal.crocante.MysqlConexion;
import com.unal.crocante.venta.VentaPrincipal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author VenusBaquero
 */
public class DarOpinion extends javax.swing.JFrame {

    int idVenta;
    Connection conexion;

    /**
     * Creates new form DarOpinion
     */
    public DarOpinion() {
        initComponents();
        // Add positions label in the slider
        Hashtable position = new Hashtable();
        position.put(0, new JLabel("0"));
        position.put(1, new JLabel("1"));
        position.put(2, new JLabel("2"));
        position.put(3, new JLabel("3"));
        position.put(4, new JLabel("4"));
        position.put(5, new JLabel("5"));

        // Set the label to be drawn
        starSlider.setLabelTable(position);
    }

    public DarOpinion(int idVenta) {
        this();
        this.idVenta = idVenta;
        Hashtable position = new Hashtable();
        position.put(0, new JLabel("0"));
        position.put(1, new JLabel("1"));
        position.put(2, new JLabel("2"));
        position.put(3, new JLabel("3"));
        position.put(4, new JLabel("4"));
        position.put(5, new JLabel("5"));
        starSlider.setLabelTable(position);

        MysqlConexion conector = new MysqlConexion("Venus", "gerente");
        conexion = conector.iniciarConexion();

        llenarInfoPedido();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        resumenPedido = new javax.swing.JTable();
        starSlider = new javax.swing.JSlider();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        commentTextArea = new javax.swing.JTextArea();
        comentLabel = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        opinionLabel = new javax.swing.JLabel();
        volverBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 500));

        resumenPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(resumenPedido);

        starSlider.setMaximum(5);
        starSlider.setMinorTickSpacing(1);
        starSlider.setPaintLabels(true);
        starSlider.setPaintTicks(true);
        starSlider.setSnapToTicks(true);
        starSlider.setToolTipText("Calificación Pedido");

        commentTextArea.setColumns(20);
        commentTextArea.setRows(5);
        jScrollPane2.setViewportView(commentTextArea);

        jLayeredPane2.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
        );

        comentLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comentLabel.setText("Comentarios:");

        addButton.setText("Confirmar");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(starSlider, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLayeredPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(comentLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(addButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(starSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(comentLabel)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addButton)
                        .addGap(122, 122, 122))))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(comentLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(starSlider, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(addButton)
                        .addContainerGap())))
        );

        opinionLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        opinionLabel.setText("Opiniones");

        volverBtn.setText("Volver");
        volverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(volverBtn)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(opinionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(opinionLabel)
                .addGap(1, 1, 1)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(volverBtn))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverBtnActionPerformed
        dispose();
    }//GEN-LAST:event_volverBtnActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed

        int stars = starSlider.getValue();
        String comment = commentTextArea.getText();
        int cc = -1;
        int idComment = -1;

        String getCC = "select Persona_per_id from Venta where ven_id = " + idVenta + ";";
        PreparedStatement s;
        try {
            s = conexion.prepareStatement(getCC);
            ResultSet cedula = s.executeQuery();
            cedula.next();
            cc = cedula.getInt(1);
        } catch (SQLException ex) {
            Logger.getLogger(VentaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        String commentInsert = "insert into comentario (com_descripcion, Persona_per_id, Venta_ven_id) "
                + "values ('" + comment + "', " + cc + " , '" + idVenta + "');";

        PreparedStatement comentarios;
        try {
            comentarios = conexion.prepareStatement(commentInsert);
            int com = comentarios.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(VentaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        String getIdComment = "select * from comentario where Venta_ven_id = " + idVenta + ";";
        PreparedStatement getcomentario;
        try {
            getcomentario = conexion.prepareStatement(getIdComment);
            ResultSet idcom = getcomentario.executeQuery();
            idcom.next();
            idComment = idcom.getInt(1);
        } catch (SQLException ex) {
            Logger.getLogger(VentaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        String getIdProducto = "select Producto_pro_id from Pedido where Venta_ven_id =" + idVenta + "; ";
        PreparedStatement prod;
        try {

            prod = conexion.prepareStatement(getIdProducto);
            ResultSet producto = prod.executeQuery();

            while (producto.next()) {

                int idProd = producto.getInt(1);

                String insertCalificacion = "insert into calificación (cal_estrellas, cal_fecha, Persona_per_id, Comentario_com_id, Producto_pro_id) "
                        + "values (" + stars + ", curdate()," + cc + ", " + idComment + ", " + idProd + ");";
                PreparedStatement calif;
                try {
                    calif = conexion.prepareStatement(insertCalificacion);
                    int insertcalif = calif.executeUpdate();
                } catch (SQLException ex) {
                    Logger.getLogger(VentaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        } catch (SQLException ex) {
            Logger.getLogger(VentaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        dispose();

    }//GEN-LAST:event_addButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DarOpinion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DarOpinion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DarOpinion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DarOpinion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DarOpinion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel comentLabel;
    private javax.swing.JTextArea commentTextArea;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel opinionLabel;
    private javax.swing.JTable resumenPedido;
    private javax.swing.JSlider starSlider;
    private javax.swing.JButton volverBtn;
    // End of variables declaration//GEN-END:variables

    private void llenarInfoPedido() {
        String consulta = "select pro_nombre "
                + "from Producto join Pedido on (pro_id = Producto_pro_id) "
                + "where Venta_ven_id=" + idVenta + ";";
        PreparedStatement s;
        try {
            s = conexion.prepareStatement(consulta);
            ResultSet resultado = s.executeQuery();
            while (resultado.next()) {
                String producto = resultado.getString(1);
                System.out.println(producto);
                DefaultTableModel model = (DefaultTableModel) resumenPedido.getModel();
                model.addRow(new Object[]{producto});
            }

        } catch (SQLException ex) {
            Logger.getLogger(VentaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
