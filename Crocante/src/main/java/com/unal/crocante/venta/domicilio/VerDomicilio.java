/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unal.crocante.venta.domicilio;

import com.unal.crocante.MysqlConexion;
import java.sql.*;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VenusBaquero
 */
public class VerDomicilio extends javax.swing.JFrame {

    Connection conexion;
    int idVenta;
    private int h, m, s;
    boolean test = true;

    /**
     * Creates new form VerDomicilio
     */
    public VerDomicilio() {
        initComponents();
    }

    public VerDomicilio(int idVenta) {
        this();
        this.idVenta = idVenta;
        MysqlConexion conector = new MysqlConexion("Venus", "gerente");
        conexion = conector.iniciarConexion();
        confirmarExistencia();
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
        addButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        timeLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        dirLabel = new javax.swing.JLabel();
        dirTextField = new javax.swing.JTextField();
        estadoLabel = new javax.swing.JLabel();
        estadoTextField = new javax.swing.JTextField();
        precioLabel = new javax.swing.JLabel();
        precioTextField = new javax.swing.JTextField();
        empleadoLabel = new javax.swing.JLabel();
        empleadoTextField = new javax.swing.JTextField();
        barrioLabel = new javax.swing.JLabel();
        barrioTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        deliveryText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        deliveryText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deliveryText.setText("Detalles Domicilio");

        addButton.setText("Agregar");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        editButton.setText("Editar");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        backButton.setText("Volver");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        timeLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        timeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLabel.setText("00:00:00");

        idLabel.setText("ID:");

        idTextField.setEditable(false);

        dirLabel.setText("Dirección:");

        dirTextField.setEditable(false);

        estadoLabel.setText("Estado:");

        estadoTextField.setEditable(false);

        precioLabel.setText("Precio:");

        precioTextField.setEditable(false);

        empleadoLabel.setText("Empleado:");

        empleadoTextField.setEditable(false);

        barrioLabel.setText("Barrio:");

        barrioTextField.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(deliveryText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idLabel)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(dirLabel)
                                            .addComponent(estadoLabel))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(estadoTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                            .addComponent(dirTextField))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(empleadoLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(precioLabel)
                                            .addGap(36, 36, 36)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(barrioLabel)
                                        .addGap(37, 37, 37)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(precioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(barrioTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                    .addComponent(empleadoTextField)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(188, 188, 188)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(addButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(editButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(backButton))
                                    .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 48, Short.MAX_VALUE)))
                        .addGap(48, 48, 48)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(deliveryText)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(precioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(precioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(empleadoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(empleadoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(barrioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(barrioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dirLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dirTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(estadoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(estadoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32)
                .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(editButton)
                    .addComponent(backButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        GenerarDomicilio newdom = new GenerarDomicilio(idVenta);
        newdom.setVisible(true);
        dispose();
    }//GEN-LAST:event_addButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        test = false;
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        test = true;
        llenarInfoDomicilios();
    }//GEN-LAST:event_formWindowGainedFocus

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        test = false;
        EditarDomicilio editdom = new EditarDomicilio(idVenta);
        editdom.setVisible(true);
    }//GEN-LAST:event_editButtonActionPerformed

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
            java.util.logging.Logger.getLogger(VerDomicilio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerDomicilio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerDomicilio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerDomicilio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerDomicilio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel barrioLabel;
    private javax.swing.JTextField barrioTextField;
    private javax.swing.JLabel deliveryText;
    private javax.swing.JLabel dirLabel;
    private javax.swing.JTextField dirTextField;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel empleadoLabel;
    private javax.swing.JTextField empleadoTextField;
    private javax.swing.JLabel estadoLabel;
    private javax.swing.JTextField estadoTextField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel precioLabel;
    private javax.swing.JTextField precioTextField;
    private javax.swing.JLabel timeLabel;
    // End of variables declaration//GEN-END:variables

    private void llenarInfoDomicilios() {
        String consulta = "select dom_id, dom_dirEntrega, dom_estado, dom_precio, per_nombre, bar_nombre, dom_tiempoEntrega"
                + " from domicilio join empleado on (Empleado_emp_id = emp_id)"
                + " join persona on (Persona_per_id = per_id)"
                + " join barrio on (Barrio_bar_id = bar_id)"
                + " where Venta_ven_id = ?;";
        PreparedStatement s;
        try {
            s = conexion.prepareStatement(consulta);
            s.setInt(1, idVenta);
            ResultSet resultado = s.executeQuery();
            if (resultado.next() != false) {
                int id = resultado.getInt(1);
                String direccion = resultado.getString(2);
                String estado = resultado.getString(3);
                int precio = resultado.getInt(4);
                String persona = resultado.getString(5);
                String barrio = resultado.getString(6);
                System.out.println(String.format("%s %s %s %s %s %s", Integer.toString(id), direccion, estado, Integer.toString(precio), persona, barrio));
                idTextField.setText(Integer.toString(id));
                dirTextField.setText(direccion);
                estadoTextField.setText(estado);
                precioTextField.setText(Integer.toString(precio));
                empleadoTextField.setText(persona);
                barrioTextField.setText(barrio);

                if (resultado.getString(7) == null) {

                    HiloTimer th = new HiloTimer();
                    th.start();

                } else {
                    editButton.setEnabled(false);
                    setTimeLabel(resultado.getString(7));
                    actualizarTimeLabel();
                }

            }

        } catch (SQLException ex) {
            Logger.getLogger(VerDomicilio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void confirmarExistencia() {
        String consulta = "select * from domicilio"
                + " where Venta_ven_id = ?;";
        PreparedStatement s;

        try {
            s = conexion.prepareStatement(consulta);
            s.setInt(1, idVenta);
            ResultSet resultado = s.executeQuery();
            if (resultado.next() == false) {
                editButton.setVisible(false);
            } else {
                addButton.setVisible(false);
            }

        } catch (SQLException ex) {
            Logger.getLogger(VerDomicilio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void startTimer() {
        String tiempo;
        String consulta = "select get_delivery_time(?);";
        PreparedStatement s;
        try {
            s = conexion.prepareStatement(consulta);
            s.setInt(1, idVenta);
            ResultSet resultado = s.executeQuery();
            resultado.next();
            tiempo = resultado.getString(1);
            setTimeLabel(tiempo);
        } catch (SQLException ex) {
            Logger.getLogger(VerDomicilio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void setTimeLabel(String tiempo) {
        List<String> domTime = Arrays.asList(tiempo.split(":"));
        h = Integer.parseInt(domTime.get(0));
        m = Integer.parseInt(domTime.get(1));
        s = Integer.parseInt(domTime.get(2));

    }

    private void actualizarTimeLabel() {
        String time = (h <= 9 ? "0" : "") + h + ":" + (m <= 9 ? "0" : "") + m + ":" + (s <= 9 ? "0" : "") + s;
        timeLabel.setText(time);
    }

    public class HiloTimer extends Thread {

        @Override
        public void run() {
            startTimer();
            while (test) {
                try {
                    this.sleep(1000);
                    ++s;
                    if (s == 60) {
                        s = 0;
                        ++m;
                    }
                    if (m == 60) {
                        m = 0;
                        ++h;
                    }
                    actualizarTimeLabel();
                } catch (InterruptedException ex) {
                    Logger.getLogger(VerDomicilio.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }
}
