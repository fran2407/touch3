/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author ale
 */
public class Isesion extends javax.swing.JFrame {



    public Isesion() {
       
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

        error = new javax.swing.JLabel();
        Correo = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        iniciar = new javax.swing.JButton();
        Registro = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setPreferredSize(new java.awt.Dimension(1100, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 180, 20));

        Correo.setBackground(new java.awt.Color(102, 0, 102));
        Correo.setForeground(new java.awt.Color(255, 255, 255));
        Correo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorreoActionPerformed(evt);
            }
        });
        Correo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CorreoKeyTyped(evt);
            }
        });
        getContentPane().add(Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 370, -1));

        password.setBackground(new java.awt.Color(102, 0, 102));
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setBorder(javax.swing.BorderFactory.createEtchedBorder());
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
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 370, -1));

        iniciar.setText("Inicio");
        iniciar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarActionPerformed(evt);
            }
        });
        getContentPane().add(iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, 180, 90));

        Registro.setText("Registro");
        Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroActionPerformed(evt);
            }
        });
        getContentPane().add(Registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 180, 90));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 102));
        jLabel4.setText("Contraseña");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 102));
        jLabel3.setText("ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        jLabel2.setText("Iniciar Sesion:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, -1, -1));

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 700, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Principañ.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CorreoActionPerformed

    private void RegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroActionPerformed
         new Registro().setVisible(true);
            this.dispose();
        
    }//GEN-LAST:event_RegistroActionPerformed

    private void iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarActionPerformed
        
        if(Correo.getText().isEmpty()||password.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "HAY UN CAMPO VACIO, POR FAVOR VERIFIQUE", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
     
    }else{
      int id = Integer.parseInt(Correo.getText());
            int pssword = Integer.parseInt(password.getText());

            for (int i = 0; i < admin.listaUsSb.size(); i++) {//For para que recorra la lista 
                System.out.println("Entra en el for para verificar");
                if (J.getText().equals(newsp.id)) {
                    System.out.println("El id ya existe");
                    valid = true;
                    System.out.println(valid);
                }
            
          Conti menu = new Conti();
          this.dispose();
          menu.show();
        
       } else{
            JOptionPane.showMessageDialog(null, "El ID o la contraseña son incorrectos", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        
       }
        }

    }//GEN-LAST:event_iniciarActionPerformed

    private void passwordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyTyped
        char c = evt.getKeyChar();

        // Validaciones para solo permitir numeros como contr
        if (Character.isLetter(c)) {
            getToolkit().beep();

            evt.consume();

              JOptionPane.showMessageDialog(null,"La contraseña solo se permiten numeros", "ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
           
        } else if ((int) evt.getKeyChar() > 32 && (int) evt.getKeyChar() <= 47
            || (int) evt.getKeyChar() >= 58 && (int) evt.getKeyChar() <= 64
            || (int) evt.getKeyChar() >= 91 && (int) evt.getKeyChar() <= 96
            || (int) evt.getKeyChar() >= 123 && (int) evt.getKeyChar() <= 255) {
            getToolkit().beep();
            evt.consume();
             JOptionPane.showMessageDialog(null," La contraseña solo se permiten numeros ", "ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
           

        }
    }//GEN-LAST:event_passwordKeyTyped

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void CorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CorreoKeyTyped
            char c = evt.getKeyChar();

        // Validaciones para solo permitir numeros como contr
        if (Character.isLetter(c)) {
            getToolkit().beep();

            evt.consume();

              JOptionPane.showMessageDialog(null,"En ID solo se permiten numeros", "ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
           
        } else if ((int) evt.getKeyChar() > 32 && (int) evt.getKeyChar() <= 47
            || (int) evt.getKeyChar() >= 58 && (int) evt.getKeyChar() <= 64
            || (int) evt.getKeyChar() >= 91 && (int) evt.getKeyChar() <= 96
            || (int) evt.getKeyChar() >= 123 && (int) evt.getKeyChar() <= 255) {
            getToolkit().beep();
            evt.consume();
             JOptionPane.showMessageDialog(null,"En ID solo se permiten numeros ", "ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
           

        }
    }//GEN-LAST:event_CorreoKeyTyped

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
            java.util.logging.Logger.getLogger(Isesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Isesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Isesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Isesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Isesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Correo;
    private javax.swing.JButton Registro;
    private javax.swing.JLabel error;
    private javax.swing.JButton iniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}
