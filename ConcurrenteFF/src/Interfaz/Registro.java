/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Registro extends javax.swing.JFrame {

    public Registro() {
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

        jPanel3 = new javax.swing.JPanel();
        jLblinicio = new javax.swing.JLabel();
        Intruccion = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        JLBcontrasena = new javax.swing.JLabel();
        JLBId = new javax.swing.JLabel();
        JTXFnombre = new javax.swing.JTextField();
        JTXFapellidos = new javax.swing.JTextField();
        JTXFedad = new javax.swing.JTextField();
        JLBsexo = new javax.swing.JLabel();
        JLBapellidos = new javax.swing.JLabel();
        JTXFid = new javax.swing.JTextField();
        JPFconfcontrasena = new javax.swing.JPasswordField();
        password = new javax.swing.JPasswordField();
        JLBcnfcontrasena = new javax.swing.JLabel();
        JLBedad = new javax.swing.JLabel();
        JCBXsexo = new javax.swing.JComboBox<>();
        JBLCorreo = new javax.swing.JLabel();
        JTXFcorreo = new javax.swing.JTextField();
        JBLnombre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLblinicio.setText("Inicio");
        jLblinicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLblinicioMouseClicked(evt);
            }
        });
        jPanel3.add(jLblinicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(875, 34, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro");
        setBackground(new java.awt.Color(102, 102, 102));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Intruccion.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        Intruccion.setForeground(new java.awt.Color(102, 0, 102));
        Intruccion.setText("Llene los siguientes espacios");
        getContentPane().add(Intruccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, -1, -1));

        jButton1.setText("Registrarse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 490, 180, 90));

        JLBcontrasena.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        JLBcontrasena.setForeground(new java.awt.Color(102, 0, 102));
        JLBcontrasena.setText("Contraseña");
        getContentPane().add(JLBcontrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, -1, -1));

        JLBId.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        JLBId.setForeground(new java.awt.Color(102, 0, 102));
        JLBId.setText("ID");
        getContentPane().add(JLBId, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, -1, -1));
        getContentPane().add(JTXFnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 110, -1));
        getContentPane().add(JTXFapellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 110, -1));
        getContentPane().add(JTXFedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 110, -1));

        JLBsexo.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        JLBsexo.setForeground(new java.awt.Color(102, 0, 102));
        JLBsexo.setText("Sexo");
        getContentPane().add(JLBsexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, -1, 20));

        JLBapellidos.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        JLBapellidos.setForeground(new java.awt.Color(102, 0, 102));
        JLBapellidos.setText("Apellidos");
        getContentPane().add(JLBapellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, -1, -1));

        JTXFid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTXFidActionPerformed(evt);
            }
        });
        JTXFid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTXFidKeyTyped(evt);
            }
        });
        getContentPane().add(JTXFid, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 110, -1));

        JPFconfcontrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JPFconfcontrasenaKeyTyped(evt);
            }
        });
        getContentPane().add(JPFconfcontrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, 110, 20));

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passwordKeyTyped(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 110, -1));

        JLBcnfcontrasena.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        JLBcnfcontrasena.setForeground(new java.awt.Color(102, 0, 102));
        JLBcnfcontrasena.setText("Confirma Contrsaseña");
        getContentPane().add(JLBcnfcontrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, -1, -1));

        JLBedad.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        JLBedad.setForeground(new java.awt.Color(102, 0, 102));
        JLBedad.setText("Edad");
        getContentPane().add(JLBedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, -1, -1));

        JCBXsexo.setForeground(new java.awt.Color(102, 0, 102));
        JCBXsexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar:", "Masculino", "Femenino", "Otro" }));
        JCBXsexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBXsexoActionPerformed(evt);
            }
        });
        getContentPane().add(JCBXsexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 110, -1));

        JBLCorreo.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        JBLCorreo.setForeground(new java.awt.Color(102, 0, 102));
        JBLCorreo.setText("Correo");
        getContentPane().add(JBLCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, -1, -1));
        getContentPane().add(JTXFcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 140, -1));

        JBLnombre.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        JBLnombre.setForeground(new java.awt.Color(102, 0, 102));
        JBLnombre.setText("Nombre");
        getContentPane().add(JBLnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, -1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Principañ.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed

    }//GEN-LAST:event_passwordActionPerformed


    private void jLblinicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblinicioMouseClicked
        // TODO add your handling code here:
        new Isesion().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jLblinicioMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (JTXFnombre.getText().isEmpty() || JTXFapellidos.getText().isEmpty() || JCBXsexo.getSelectedItem().toString().isEmpty()
                || JTXFedad.getText().isEmpty() || JTXFcorreo.getText().isEmpty() || Integer.parseInt(JTXFid.getText()) == 0 || Integer.parseInt(password.getText()) == 0) {
            //Si algun espacio esta vacio     
            JOptionPane.showMessageDialog(null, "HAY UN CAMPO VACIO, POR FAVOR VERIFIQUE", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);

        } else {
            // aqui se guarda todo lo ingresado por el textfield
            String nombre = JTXFnombre.getText();
            String apellido = JTXFapellidos.getText();
            String edad = JTXFedad.getText();
            String email = JTXFcorreo.getText();
            String id = JTXFid.getText();
            String pass = password.getText();
            String confpass = JPFconfcontrasena.getText();
            String sexo = JCBXsexo.getSelectedItem().toString();
            boolean valid = false;
            admin a = new admin();

            Sp newsp = new Sp(nombre, apellido, sexo, email, confpass, id, edad);

            for (int i = 0; i < admin.listaUsSb.size(); i++) {//For para que recorra la lista 
                System.out.println("Entra en el for para verificar");
                if (JTXFid.getText().equals(newsp.id)) {
                    System.out.println("El id ya existe");
                    valid = true;
                    System.out.println(valid);
                }
            }

            if (pass.equals(confpass) && valid == false) {

                admin admin = new admin();
                admin.agregarU(newsp);
                admin.imprimirArray();

                JOptionPane.showMessageDialog(null, "Su usuario se guardó exitosamente \nBienvendio", "Registro Exitoso", JOptionPane.INFORMATION_MESSAGE);

            } else if (pass.equals(confpass) && valid == true) {

                JOptionPane.showMessageDialog(null, "El ID ya esta en uso ", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);

            } else {

                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden ", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            }
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void JCBXsexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBXsexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCBXsexoActionPerformed

    private void JTXFidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTXFidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTXFidActionPerformed

    private void JPFconfcontrasenaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JPFconfcontrasenaKeyTyped

        char c = evt.getKeyChar();

        // Validaciones para solo permitir numeros como contraseña
        if (Character.isLetter(c)) {
            getToolkit().beep();

            evt.consume();

            JOptionPane.showMessageDialog(null, "La contraseña solo se permiten numeros", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);

        } else if ((int) evt.getKeyChar() > 32 && (int) evt.getKeyChar() <= 47
                || (int) evt.getKeyChar() >= 58 && (int) evt.getKeyChar() <= 64
                || (int) evt.getKeyChar() >= 91 && (int) evt.getKeyChar() <= 96
                || (int) evt.getKeyChar() >= 123 && (int) evt.getKeyChar() <= 255) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, " La contraseña solo se permiten numeros ", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);

        }


    }//GEN-LAST:event_JPFconfcontrasenaKeyTyped

    private void passwordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyTyped

        char c = evt.getKeyChar();

        // Validaciones para solo permitir numeros como contraseña
        if (Character.isLetter(c)) {
            getToolkit().beep();

            evt.consume();

            JOptionPane.showMessageDialog(null, "La contraseña solo se permiten numeros", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);

        } else if ((int) evt.getKeyChar() > 32 && (int) evt.getKeyChar() <= 47
                || (int) evt.getKeyChar() >= 58 && (int) evt.getKeyChar() <= 64
                || (int) evt.getKeyChar() >= 91 && (int) evt.getKeyChar() <= 96
                || (int) evt.getKeyChar() >= 123 && (int) evt.getKeyChar() <= 255) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, " La contraseña solo se permiten numeros ", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);

        }

    }//GEN-LAST:event_passwordKeyTyped

    private void JTXFidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTXFidKeyTyped

        char c = evt.getKeyChar();

        // Validaciones para solo permitir numeros como contraseña
        if (Character.isLetter(c)) {
            getToolkit().beep();

            evt.consume();

            JOptionPane.showMessageDialog(null, "En ID solo se permiten numeros", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);

        } else if ((int) evt.getKeyChar() > 32 && (int) evt.getKeyChar() <= 47
                || (int) evt.getKeyChar() >= 58 && (int) evt.getKeyChar() <= 64
                || (int) evt.getKeyChar() >= 91 && (int) evt.getKeyChar() <= 96
                || (int) evt.getKeyChar() >= 123 && (int) evt.getKeyChar() <= 255) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "En ID solo se permiten numeros ", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);

        }

    }//GEN-LAST:event_JTXFidKeyTyped

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Intruccion;
    private javax.swing.JLabel JBLCorreo;
    private javax.swing.JLabel JBLnombre;
    private javax.swing.JComboBox<String> JCBXsexo;
    private javax.swing.JLabel JLBId;
    private javax.swing.JLabel JLBapellidos;
    private javax.swing.JLabel JLBcnfcontrasena;
    private javax.swing.JLabel JLBcontrasena;
    private javax.swing.JLabel JLBedad;
    private javax.swing.JLabel JLBsexo;
    private javax.swing.JPasswordField JPFconfcontrasena;
    private javax.swing.JTextField JTXFapellidos;
    private javax.swing.JTextField JTXFcorreo;
    private javax.swing.JTextField JTXFedad;
    private javax.swing.JTextField JTXFid;
    private javax.swing.JTextField JTXFnombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLblinicio;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}
