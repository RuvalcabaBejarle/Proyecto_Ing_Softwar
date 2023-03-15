/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itp_library;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author edype
 */
public class Registrar_Trabajador extends javax.swing.JFrame {
String user;
    /**
     * Creates new form Registrar_Trabajador
     */
    public Registrar_Trabajador() {
        initComponents();
         
        user = Login.user;
        
        setTitle("Registrar nuevo usuario  ");
        setSize(630,350);
        setResizable(false);
        setLocationRelativeTo(null);
        
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_nombre = new javax.swing.JTextField();
        txt_mail = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_username = new javax.swing.JTextField();
        txt_password = new javax.swing.JTextField();
        cmb_niveles = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 160, -1));
        getContentPane().add(txt_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 160, -1));

        txt_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefonoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 160, -1));
        getContentPane().add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 160, -1));
        getContentPane().add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 170, -1));

        cmb_niveles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Bibliotecario", " " }));
        cmb_niveles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_nivelesActionPerformed(evt);
            }
        });
        getContentPane().add(cmb_niveles, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 120, -1));

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 120, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Registro de trabajadores");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 240, 30));

        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 70, -1));

        jLabel7.setText("Em@il");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel8.setText("Télefono");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel9.setText("Username");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, -1, -1));

        jLabel10.setText("Password");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, -1, -1));
        getContentPane().add(jLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 586, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefonoActionPerformed

    private void cmb_nivelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_nivelesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_nivelesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int permisos_cmb, validacion = 0;
        String nombre, mail, telefono, username, pass, permisos_string = "";
        
         mail = txt_mail.getText().trim();
        username = txt_username.getText().trim();
        pass = txt_password.getText().trim();
        nombre = txt_nombre.getText().trim();
        telefono = txt_telefono.getText().trim();
        permisos_cmb = cmb_niveles.getSelectedIndex() + 1;
        
        if(mail.equals("")){
            txt_mail.setBackground(Color.red);
            validacion++;
        }
        if(username.equals("")){
            txt_username.setBackground(Color.red);
            validacion++;
        }
        if(pass.equals("")){
            txt_password.setBackground(Color.red);
            validacion++;
        }
        if(nombre.equals("")){
            txt_nombre.setBackground(Color.red);
            validacion++;
        }
        if(telefono.equals("")){
            txt_telefono.setBackground(Color.red);
            validacion++;
        }
         if(permisos_cmb == 1){
            permisos_string = "Administrador";
        } else if(permisos_cmb == 2){
            permisos_string = "Bibliotecario";
        } 
        
       
        
        try {
            Connection conn = Connect.getConnection();
            PreparedStatement pst = conn.prepareStatement(
                "select username from trabajador where username = '" + username + "'");
            ResultSet rs = pst.executeQuery();
            
            if (rs.next()) {
                txt_username.setBackground(Color.red);
                JOptionPane.showMessageDialog(null, "Nombre de usuario no disponible.");
                conn.close();
            } else {
                
                conn.close();
                
                if (validacion == 0) {
                    try {
                        
                        Connection conn2 = Connect.getConnection();
                        PreparedStatement pst2 = conn2.prepareStatement(
                            "insert into trabajador values (?,?,?,?,?,?,?,?)");
                        
                        pst2.setInt(1, 0);
                        pst2.setString(2, nombre);
                        pst2.setString(3, mail);
                        pst2.setString(4, telefono);
                        pst2.setString(5, username);
                        pst2.setString(6, pass);
                        pst2.setString(7, permisos_string);
                        pst2.setString(8, "Activo");
                        
                        
                        pst2.executeUpdate();
                        conn2.close();
                        
                        Limpiar();
                        
                        txt_mail.setBackground(Color.green);
                        txt_username.setBackground(Color.green);
                        txt_password.setBackground(Color.green);
                        txt_nombre.setBackground(Color.green);
                        txt_telefono.setBackground(Color.green);
                      
                        JOptionPane.showMessageDialog(null, "Registro exitoso.");
                       
                        
                    } catch (SQLException e) {
                        
                        JOptionPane.showMessageDialog(null, "¡¡ERROR al registrar!!, contacte al administrador.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Debes de llenar todos los campos.");
                }
                
            }
            
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "¡¡ERROR al comparar usuario!!, contacte al administrador.");
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
            java.util.logging.Logger.getLogger(Registrar_Trabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar_Trabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar_Trabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar_Trabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar_Trabajador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_niveles;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_mail;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
public void Limpiar(){
        txt_mail.setText("");
        txt_nombre.setText("");
        txt_password.setText("");
        txt_telefono.setText("");
        txt_username.setText("");
        cmb_niveles.setSelectedIndex(0);
    }
}
