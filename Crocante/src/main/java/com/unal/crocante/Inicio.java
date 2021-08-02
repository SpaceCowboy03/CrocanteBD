package com.unal.crocante;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Manuel Martinez
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
    }

    MysqlConexion conexion = new MysqlConexion();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Texto_Usuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        registrarButton = new javax.swing.JButton();
        jButton_Aceptar = crearBoton();
        Texto_Apellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textoContrasena = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Texto_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Texto_UsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(Texto_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 220, 41));

        jLabel1.setText("Contraseña");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 70, 38));

        jLabel2.setText("Apellido");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 60, 38));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Inicio Crocante");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        registrarButton.setText("Registrar");
        registrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(registrarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 150, 70));

        jButton_Aceptar.setText("Aceptar");
        jButton_Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AceptarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 100, 50));

        Texto_Apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Texto_ApellidoActionPerformed(evt);
            }
        });
        getContentPane().add(Texto_Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 220, 41));

        jLabel4.setText("Usuario");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 60, 38));
        getContentPane().add(textoContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 220, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\JFCowboy\\Desktop\\hamburger.png")); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 240, 180));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\JFCowboy\\Desktop\\hamburger.png")); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 250, 240, 180));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Texto_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Texto_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Texto_UsuarioActionPerformed

    private void jButton_AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AceptarActionPerformed

// Se llaman todos los string necdesarios de los cuadros de texto
        String usuario = Texto_Usuario.getText();
        String apellido = Texto_Apellido.getText();
        String contrasena = String.valueOf(textoContrasena.getPassword());

// Se envia al objeto conexion el usuario y la contrasena
        conexion.setPassword(contrasena);
        conexion.setUser(usuario);

// Se llama la funcion iniciarConexion() y se crea la variable conectar que va a servir para todo lo de mysql
        Connection conectar = conexion.iniciarConexion();

// Se comprueba si la conexion fue exitosa
        if (conectar != null) {
            try {
// Preparamos la consulta para buscar el cargo de la persona y que pueda acceder a su vista correspondiente

                String consulta = "select Mostrar_Cargo('" + usuario + "')";

                PreparedStatement s = conectar.prepareStatement(consulta);
                ResultSet resultado = s.executeQuery();
                resultado.next();

                String cargo = resultado.getString(1);

                if (GERENTE.equals(cargo)) {

                    JOptionPane.showMessageDialog(null, "Bienvenido Gerente : " + usuario + " " + apellido);
                    new Menu().setVisible(true);
                    dispose();

                } else if (CAJERO.equals(cargo)) {

                    JOptionPane.showMessageDialog(null, "Bienvenido Cajero : " + usuario + " " + apellido);

                } else {

                    JOptionPane.showMessageDialog(null, "Su cargo no tiene permitido entrar a la base de datos");

                }

                System.out.println(cargo);

// Recorremos el resultado, mientras haya registros para leer, y escribimos el resultado en pantalla.
            } catch (SQLException sqle) {
                System.out.println("Imposible realizar consulta ... FAIL");
                sqle.printStackTrace();
            }

        } else {

            JOptionPane.showMessageDialog(null, "No se ha podido conectar correctamente a la base de datos\nVuelva a ingresar su usuario y contraseña");

        }

// Recorremos el resultado, mientras haya registros para leer, y escribimos el resultado en pantalla.
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_AceptarActionPerformed
    private static final String CAJERO = "Cajero";
    private static final String GERENTE = "Gerente";

    private void registrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarButtonActionPerformed

        new Registro().setVisible(true);

    }//GEN-LAST:event_registrarButtonActionPerformed

    private void Texto_ApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Texto_ApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Texto_ApellidoActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField Texto_Apellido;
    public javax.swing.JTextField Texto_Usuario;
    public javax.swing.JButton jButton_Aceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JButton registrarButton;
    private javax.swing.JPasswordField textoContrasena;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JButton crearBoton() {

        ImageIcon imageIcon = new ImageIcon("resources\\accessKey.jpeg");
        return new javax.swing.JButton(imageIcon);

    }
}
