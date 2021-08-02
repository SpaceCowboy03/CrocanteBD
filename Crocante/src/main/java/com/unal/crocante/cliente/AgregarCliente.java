/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unal.crocante.cliente;

/**
 *
 * @author VenusBaquero
 */
public class AgregarCliente extends javax.swing.JFrame {

    /**
     * Creates new form AgregarCliente
     */
    public AgregarCliente() {
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

        cancelBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        precioLabel = new javax.swing.JLabel();
        precioFormattedTextField = new javax.swing.JFormattedTextField();
        formaPagoLabel = new javax.swing.JLabel();
        estadoPagoLabel = new javax.swing.JLabel();
        modalidadLabel = new javax.swing.JLabel();
        personaIdLabel = new javax.swing.JLabel();
        idFormattedTextField = new javax.swing.JFormattedTextField();
        editText = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cancelBtn.setText("Cancelar");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        precioLabel.setText("Precio:");

        precioFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        precioFormattedTextField.setText("0");

        formaPagoLabel.setText("Forma de Pago:");

        estadoPagoLabel.setText("Estado del pago:");

        modalidadLabel.setText("Modalidad:");

        personaIdLabel.setText("Id Cliente:");

        idFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(precioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(formaPagoLabel)
                    .addComponent(estadoPagoLabel)
                    .addComponent(modalidadLabel)
                    .addComponent(personaIdLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(idFormattedTextField)
                    .addComponent(precioFormattedTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precioLabel)
                    .addComponent(precioFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(formaPagoLabel)
                .addGap(18, 18, 18)
                .addComponent(estadoPagoLabel)
                .addGap(18, 18, 18)
                .addComponent(modalidadLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(personaIdLabel)
                    .addComponent(idFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 19, Short.MAX_VALUE))
        );

        editText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        editText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editText.setText("Agregar Cliente");

        addBtn.setText("Aceptar");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
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
                            .addComponent(editText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(addBtn)
                        .addGap(27, 27, 27)
                        .addComponent(cancelBtn)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(editText)
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

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VentaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        MysqlConexion conector = new MysqlConexion("Venus", "gerente");
        Connection conexion = conector.iniciarConexion();

        int precio = 0;
        String formaPago = null;
        String estadoPago = null;
        String modalidad = null;
        int id = 0;
        try {
            precio = Integer.parseInt(precioFormattedTextField.getText());
            formaPago = formaPagoComboBox.getSelectedItem().toString();
            estadoPago = estadoPagoComboBox.getSelectedItem().toString();
            modalidad = modalidadComboBox.getSelectedItem().toString();
            id = Integer.parseInt(idFormattedTextField.getText());

        } catch (NumberFormatException numberFormatException) {
            Logger.getLogger(AgregarVenta.class.getName()).log(Level.SEVERE, null, numberFormatException);
            JOptionPane.showMessageDialog(this, "No se insertaron datos validos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String consulta = "insert into venta (ven_fecha, ven_precioTotal, ven_formaPago, ven_estadoPago, ven_modalidad, ven_diaSemana, Persona_per_id, Sede_sede_id,ven_estado) "
                + "        values (now(), " + precio + ", '" + formaPago + "', '" + estadoPago + "', '" + modalidad + "', dayname(curdate()), " + id + ", 1, 1);";
        System.out.println(consulta);

        PreparedStatement s;
        try {
            s = conexion.prepareStatement(consulta);
            int resultado = s.executeUpdate();
            JOptionPane.showMessageDialog(this, "Registro satisfactorio", "Exito", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(AgregarVenta.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Imposible añadir el registro", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addBtnActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel editText;
    private javax.swing.JLabel estadoPagoLabel;
    private javax.swing.JLabel formaPagoLabel;
    private javax.swing.JFormattedTextField idFormattedTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel modalidadLabel;
    private javax.swing.JLabel personaIdLabel;
    private javax.swing.JFormattedTextField precioFormattedTextField;
    private javax.swing.JLabel precioLabel;
    // End of variables declaration//GEN-END:variables
}
