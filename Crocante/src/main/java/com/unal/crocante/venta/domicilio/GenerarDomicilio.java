package com.unal.crocante.venta.domicilio;

import com.unal.crocante.MysqlConexion;
import com.unal.crocante.venta.VentaPrincipal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VenusBaquero
 */
public class GenerarDomicilio extends javax.swing.JFrame {

    int idVenta;
    Connection conexion;

    /**
     * Creates new form GenerarDomicilio
     */
    public GenerarDomicilio() {
        initComponents();
    }

    public GenerarDomicilio(int idVenta) {
        this();
        this.idVenta = idVenta;
        MysqlConexion conector = new MysqlConexion("Venus", "gerente");
        conexion = conector.iniciarConexion();
        cargarEmpleados();
        cargarBarrio();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deliveryText = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        dirLabel = new javax.swing.JLabel();
        dirTextField = new javax.swing.JTextField();
        estadoLabel = new javax.swing.JLabel();
        estadoComboBox = new javax.swing.JComboBox<>();
        precioLabel = new javax.swing.JLabel();
        precioFormattedTextField = new javax.swing.JFormattedTextField();
        empleadoLabel = new javax.swing.JLabel();
        empleadoComboBox = new javax.swing.JComboBox<>();
        barrioIdLabel = new javax.swing.JLabel();
        barrioComboBox = new javax.swing.JComboBox<>();
        cancelBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        deliveryText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        deliveryText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deliveryText.setText("Agregar Domicilio");

        addBtn.setText("Aceptar");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        dirLabel.setText("Dirección:");

        estadoLabel.setText("Estado:");

        estadoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No Enviado", "En Camino", "Entregado", "Cancelado" }));

        precioLabel.setText("Precio:");

        precioFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        precioFormattedTextField.setText("2000");

        empleadoLabel.setText("Empleado:");

        barrioIdLabel.setText("Barrio:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dirLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estadoLabel)
                    .addComponent(precioLabel)
                    .addComponent(empleadoLabel)
                    .addComponent(barrioIdLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(estadoComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(empleadoComboBox, 0, 102, Short.MAX_VALUE)
                    .addComponent(precioFormattedTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dirTextField)
                    .addComponent(barrioComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dirLabel)
                    .addComponent(dirTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estadoLabel)
                    .addComponent(estadoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precioLabel)
                    .addComponent(precioFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empleadoLabel)
                    .addComponent(empleadoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barrioIdLabel)
                    .addComponent(barrioComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 19, Short.MAX_VALUE))
        );

        cancelBtn.setText("Cancelar");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deliveryText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(addBtn)
                        .addGap(27, 27, 27)
                        .addComponent(cancelBtn)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(deliveryText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn)
                    .addComponent(cancelBtn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        String emp = empleadoComboBox.getSelectedItem().toString();
        String bar = barrioComboBox.getSelectedItem().toString();
        int empleado = -1;
        int barrio = -1;

        String search_emp = "select emp_id"
                + " from empleado join persona on (Persona_per_id = per_id)"
                + " where per_nombre = ?";

        PreparedStatement e;
        try {
            e = conexion.prepareStatement(search_emp);
            e.setString(1, emp);
            ResultSet resultadoe = e.executeQuery();
            resultadoe.next();
            empleado = resultadoe.getInt(1);
        } catch (SQLException ex) {
            Logger.getLogger(GenerarDomicilio.class.getName()).log(Level.SEVERE, null, ex);
        }

        String search_bar = "select bar_id"
                + " from barrio"
                + " where bar_nombre = ?;";

        PreparedStatement b;
        try {
            b = conexion.prepareStatement(search_bar);
            b.setString(1, bar);
            System.out.println("entro");
            System.out.println(b);
            ResultSet resultadob = b.executeQuery();
            resultadob.next();
            barrio = resultadob.getInt(1);
        } catch (SQLException ex) {
            Logger.getLogger(GenerarDomicilio.class.getName()).log(Level.SEVERE, null, ex);
        }

        String add = "insert into domicilio (dom_dirEntrega, dom_estado, dom_precio, Empleado_emp_id, Venta_ven_id, Barrio_bar_id) "
                + "values (?, ?, ?, ?, ?, ?);";
        PreparedStatement s;
        try {
            s = conexion.prepareStatement(add);
            s.setString(1, dirTextField.getText());
            s.setString(2, estadoComboBox.getSelectedItem().toString());
            s.setInt(3, Integer.parseInt(precioFormattedTextField.getText()));
            s.setInt(4, empleado);
            s.setInt(5, idVenta);
            s.setInt(6, barrio);
            System.out.println(s);
            int resultado = s.executeUpdate();
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(VentaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_addBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

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
            java.util.logging.Logger.getLogger(GenerarDomicilio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenerarDomicilio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenerarDomicilio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenerarDomicilio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GenerarDomicilio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JComboBox<String> barrioComboBox;
    private javax.swing.JLabel barrioIdLabel;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel deliveryText;
    private javax.swing.JLabel dirLabel;
    private javax.swing.JTextField dirTextField;
    private javax.swing.JComboBox<String> empleadoComboBox;
    private javax.swing.JLabel empleadoLabel;
    private javax.swing.JComboBox<String> estadoComboBox;
    private javax.swing.JLabel estadoLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFormattedTextField precioFormattedTextField;
    private javax.swing.JLabel precioLabel;
    // End of variables declaration//GEN-END:variables

    private void cargarEmpleados() {
        String empleado = "select per_nombre"
                + " from empleado join persona on (per_id = Persona_per_id)"
                + " join cargo on (Cargo_car_id = car_id)"
                + " where car_nombre = ?;";
        PreparedStatement s;
        try {
            System.out.println(empleado);
            s = conexion.prepareStatement(empleado);
            s.setString(1, "Mesero");
            System.out.println(s);
            ResultSet resultado = s.executeQuery();
            while (resultado.next()) {
                String domiciliario = resultado.getString(1);
                System.out.println(domiciliario);
                empleadoComboBox.addItem(domiciliario);
            }

        } catch (SQLException ex) {
            Logger.getLogger(VentaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void cargarBarrio() {
        String barrio = "select bar_nombre"
                + " from barrio;";
        PreparedStatement s;
        try {
            s = conexion.prepareStatement(barrio);
            System.out.println(s);
            ResultSet resultado = s.executeQuery();
            while (resultado.next()) {
                String bar = resultado.getString(1);
                barrioComboBox.addItem(bar);
            }

        } catch (SQLException ex) {
            Logger.getLogger(VentaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
