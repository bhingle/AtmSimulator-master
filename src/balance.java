

import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sql1.db;
//import java.io.*;
import java.applet.*;
import java.io.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author My
 */
public class balance extends javax.swing.JFrame {
     File wavFile = new File("src\\beep-3.wav");
    AudioClip sound;

   public String cp[]=new String[20];
  // public String cp_bal[]=new String[20];
    //  String out; 
       int p;
       
      static double bal[]=new double[20];
     String name[]=new String[20];
    
      //   cpin c1=new cpin();
         
     
   // public double  bal[]=new double[20];
    

    /**
     * Creates new form balance
     */
    public balance() {
     //   get();
        this.setUndecorated(true);
        
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        double width = toolkit.getScreenSize().getWidth();
        
        double height = toolkit.getScreenSize().getHeight();
        
        this.setSize((int)width, (int)height);
        initComponents();
       
      /*  p=c1.disp();
         System.out.println(p); */
    }
    public  void get() throws SQLException
    {
        cpin c1 = new cpin();
        p=c1.disp();
       
        db db1=new db();
         bal=db1.db_bal();
         name = db1.db_name();
       //  System.out.println(p);
       //  System.out.println(bal[p]);
         String out = String.valueOf(bal[p]);
      //  String out=Double.toString(bal[p]);
        //  out=new String(c);
        
     disp_bal.setText(out); 
     // p =c1.disp_n();
        
        disp_name.setText(name[p]);
    // jLabel1.setText(out);
    }
    //disp_bal.setText(bal[p]);
    
    

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        disp_name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        exit_text = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        disp_bal = new javax.swing.JTextField();
        text = new javax.swing.JLabel();
        atm_white_bg = new javax.swing.JLabel();
        atm_bg = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        disp_name.setEditable(false);
        disp_name.setBackground(new java.awt.Color(255, 255, 255));
        disp_name.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        disp_name.setBorder(null);
        disp_name.setHighlighter(null);
        disp_name.setMargin(new java.awt.Insets(0, 0, 0, 0));
        disp_name.setOpaque(false);
        disp_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disp_nameActionPerformed(evt);
            }
        });
        jPanel1.add(disp_name);
        disp_name.setBounds(700, 190, 200, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("HELLO");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(600, 200, 100, 30);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(690, 330, 140, 40);

        exit_text.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        exit_text.setForeground(new java.awt.Color(255, 255, 255));
        exit_text.setText("EXIT");
        jPanel1.add(exit_text);
        exit_text.setBounds(850, 340, 50, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arrow2.jpg"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(830, 340, 120, 30);

        disp_bal.setEditable(false);
        disp_bal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        disp_bal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disp_balActionPerformed(evt);
            }
        });
        jPanel1.add(disp_bal);
        disp_bal.setBounds(630, 290, 190, 50);

        text.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        text.setText("YOUR BALANCE IS :");
        jPanel1.add(text);
        text.setBounds(590, 240, 250, 50);

        atm_white_bg.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        atm_white_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atmbg2.jpg"))); // NOI18N
        jPanel1.add(atm_white_bg);
        atm_white_bg.setBounds(540, 185, 380, 240);

        atm_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atmgif0.jpg"))); // NOI18N
        jPanel1.add(atm_bg);
        atm_bg.setBounds(370, 0, 720, 780);

        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit);
        exit.setBounds(940, 330, 80, 30);

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/w1.jpg"))); // NOI18N
        jPanel1.add(BG);
        BG.setBounds(0, 0, 1370, 780);

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

    private void disp_balActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disp_balActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_disp_balActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        //  get();
        try{sound = Applet.newAudioClip(wavFile.toURL());}
    catch(Exception e){e.printStackTrace();}
     sound.play();

        card c1=new card();
        c1.setVisible(true);
        dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void disp_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disp_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_disp_nameActionPerformed

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
            java.util.logging.Logger.getLogger(balance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(balance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(balance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(balance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
         

        //System.out.println(c1.disp());
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new balance().setVisible(true);
                    //     get();
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel atm_bg;
    private javax.swing.JLabel atm_white_bg;
    private javax.swing.JTextField disp_bal;
    private javax.swing.JTextField disp_name;
    private javax.swing.JButton exit;
    private javax.swing.JLabel exit_text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel text;
    // End of variables declaration//GEN-END:variables
}
