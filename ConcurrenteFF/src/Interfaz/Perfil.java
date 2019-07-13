/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;


import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author asus
 */
public class Perfil extends javax.swing.JFrame {

    /**
     * Creates new form Perfil
     */
  
    Registro re = new Registro();

    
    
    public Perfil() {
        initComponents();
        this.setLocationRelativeTo(this);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Miperfil = new javax.swing.JLabel();
        LFoto = new javax.swing.JLabel();
        JBcarga = new javax.swing.JButton();
        Informacion = new javax.swing.JLabel();
        U = new javax.swing.JComboBox<>();
        edit = new javax.swing.JButton();
        Volver = new javax.swing.JButton();
        mostrarInfo = new javax.swing.JButton();
        Imagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Miperfil.setBackground(new java.awt.Color(0, 0, 0));
        Miperfil.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        Miperfil.setText("Mi perfil");
        getContentPane().add(Miperfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        LFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(LFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 170, 170));

        JBcarga.setText("Elegir foto ");
        JBcarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBcargaActionPerformed(evt);
            }
        });
        getContentPane().add(JBcarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 150, -1));

        Informacion.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        getContentPane().add(Informacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 440, 270));

        getContentPane().add(U, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 570, 180, -1));

        edit.setText("Editar perfil");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        getContentPane().add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, -1, -1));

        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        getContentPane().add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 660, -1, -1));

        mostrarInfo.setText("Mostrar su informacion");
        mostrarInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarInfoActionPerformed(evt);
            }
        });
        getContentPane().add(mostrarInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 590, -1, -1));

        Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Principañ.png"))); // NOI18N
        getContentPane().add(Imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBcargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBcargaActionPerformed
       
//Declaramos el JFfile chose a nuestro boton
        JFileChooser fc = new JFileChooser();
        //Asignamos el titulo para la ventana que se abrira
        fc.setDialogTitle("Buscar foto");
        //Aqui se abre la ventana
        if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) { //Cuando se apreta el boton de aceptar entre en la condicion
            //libreria RSScabeLabel nueva
            //File archivo = new File(fc.getSelectedFile().toString());No la utilizaremos, pero gracia a esto la imagen se ajusta al tamano del label
            rsscalelabel.RSScaleLabel.setScaleLabel(LFoto, fc.getSelectedFile().toString());//Primer parametro mandamos el jlabel de la ventana
            //Segundo parametro la imagen obtenida

        }

    }//GEN-LAST:event_JBcargaActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
       new Conti().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_editActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        new Conti().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VolverActionPerformed

    private void mostrarInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarInfoActionPerformed

    }//GEN-LAST:event_mostrarInfoActionPerformed

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
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Perfil().setVisible(true);
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Perfil.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(Perfil.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(Perfil.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Perfil.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Imagen;
    private javax.swing.JLabel Informacion;
    private javax.swing.JButton JBcarga;
    private javax.swing.JLabel LFoto;
    private javax.swing.JLabel Miperfil;
    private javax.swing.JComboBox<String> U;
    private javax.swing.JButton Volver;
    private javax.swing.JButton edit;
    private javax.swing.JButton mostrarInfo;
    // End of variables declaration//GEN-END:variables
}
