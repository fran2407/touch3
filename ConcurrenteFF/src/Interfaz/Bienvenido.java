
package Interfaz;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Bienvenido extends javax.swing.JFrame {

    private int carga = 0;
    private boolean progeso = false;
    barra ejecutar = new barra();

   
    public Bienvenido() {
 
        
        initComponents();
       
        Bienvenido.this.getRootPane().setOpaque(false);
        Bienvenido.this.getContentPane().setBackground(new Color(0, 0, 0, 0));
        Bienvenido.this.setBackground(new Color(0, 0, 0, 0));
        this.setResizable(false);//La pantalla aparecera en el centro
        this.setLocationRelativeTo(this);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        text = new javax.swing.JLabel();
        Barra = new javax.swing.JProgressBar();
        Imagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        text.setText("jLabel2");
        getContentPane().add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 180, 30));
        getContentPane().add(Barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 330, 50));

        Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Bienvenido.png"))); // NOI18N
        getContentPane().add(Imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if (progeso == false) {
            progeso = true;
            Barra.setMaximum(50);//Para calcular el progreso de la barra
            Barra.setMinimum(0);
            Barra.setStringPainted(true);//Muestra el avance de la barra
            ejecutar.start();//Ejecuta el hilo creado
        }
    }//GEN-LAST:event_formWindowActivated

        public static void main(String args[]) {
            
            new Principal();
       

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bienvenido().setVisible(true);
            }
        });
    }

    private class barra extends Thread {

        @Override
        public void run() {
            try {
                while (true) { //Siempre va a estar en ejecucion
                    carga++;//Va a aumentar cada vez que se ejecute
                    Barra.setValue(carga);//El valor que le va a mandar a toda la barra
                    repaint();//noten los cambios
                    switch (carga) {
                        case 3: //Estos mensjaes solo los que salgran hasta que termine de contar las milesimas
                            text.setText("Bienvenido");
                            break;
                        case 20:
                            text.setText("Cargando datos");
                            break;
                        case 50:
                            text.setText("Carga completa");
                            break;
                        case 60:
                            Principal objeto = new Principal();//Clase elegida para ser la siguiente
                            objeto.setVisible(true);
                            objeto.setLocationRelativeTo(Bienvenido.this);//Ya que estamos dentro del hilo creado
                            Bienvenido.this.dispose();
                            break;
                    }
                    Thread.sleep(100);
                } //Esto hace que el programa se ejecute milesimas por segundo
            } catch (InterruptedException ex) {
                Logger.getLogger(Bienvenido.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Barra;
    private javax.swing.JLabel Imagen;
    private javax.swing.JLabel text;
    // End of variables declaration//GEN-END:variables
}
