
import java.awt.Toolkit;
import java.util.*;
import java.applet.*;
import java.io.File;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author My
 */
public class money extends javax.swing.JFrame {
     File wavFile = new File("src\\CashOut.wav");
    AudioClip sound;


    /**
     * Creates new form money
     */
    public money() {
           this.setUndecorated(true);
        
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        double width = toolkit.getScreenSize().getWidth();
        
        double height = toolkit.getScreenSize().getHeight();
        
        this.setSize((int)width, (int)height);
        initComponents();
          try{sound = Applet.newAudioClip(wavFile.toURL());}
          catch(Exception e){e.printStackTrace();}
          sound.play();

         Timer time=new Timer();
         time.schedule(new TimerTask(){
             
             @Override
             public void run()
                 {
                      card c1 =new card();
                         c1.setVisible(true);
                        dispose();
                 }
         } , 1100);
        // sound.stop();
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        THANK_text = new javax.swing.JLabel();
        you = new javax.swing.JLabel();
        atm_bg = new javax.swing.JLabel();
        gif = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        THANK_text.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        THANK_text.setText("THANK ");
        jPanel1.add(THANK_text);
        THANK_text.setBounds(640, 260, 230, 60);

        you.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        you.setText("YOU !!!");
        jPanel1.add(you);
        you.setBounds(650, 340, 176, 61);

        atm_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atmbg2.jpg"))); // NOI18N
        jPanel1.add(atm_bg);
        atm_bg.setBounds(530, 200, 400, 260);

        gif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/money 2.gif"))); // NOI18N
        jPanel1.add(gif);
        gif.setBounds(370, 0, 720, 780);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/w1.jpg"))); // NOI18N
        jPanel1.add(bg);
        bg.setBounds(0, 0, 1370, 780);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1370, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(money.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(money.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(money.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(money.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new money().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel THANK_text;
    private javax.swing.JLabel atm_bg;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel gif;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel you;
    // End of variables declaration//GEN-END:variables
}
