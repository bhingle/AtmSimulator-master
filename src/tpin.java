
//import static balance.p;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sql1.db;
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
public class tpin extends javax.swing.JFrame {
     File wavFile = new File("src\\beep-3.wav");
    AudioClip sound;
     int i=-1;
      int p;
     static String tp[]=new String[20];
     String out;
    int j;
    char inpass[];
    char pin[]=new char[4];
     static String name[]=new String[20];


    /**
     * Creates new form tpin
     */
    public tpin() {
         this.setUndecorated(true);
        
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        double width = toolkit.getScreenSize().getWidth();
        
        double height = toolkit.getScreenSize().getHeight();
        
        this.setSize((int)width, (int)height);
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

        jPanel1 = new javax.swing.JPanel();
        pin_text = new javax.swing.JLabel();
        hello_text = new javax.swing.JLabel();
        disp_name = new javax.swing.JTextField();
        passfield = new javax.swing.JPasswordField();
        atm_bg = new javax.swing.JLabel();
        main_bg = new javax.swing.JLabel();
        bCancel = new javax.swing.JButton();
        b_clear = new javax.swing.JButton();
        b_enter = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        pin2 = new javax.swing.JTextField();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        pin_text.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        pin_text.setText("ENTER YOUR PIN");
        jPanel1.add(pin_text);
        pin_text.setBounds(570, 260, 330, 50);

        hello_text.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        hello_text.setText("HELLO ");
        jPanel1.add(hello_text);
        hello_text.setBounds(600, 209, 100, 40);

        disp_name.setEditable(false);
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
        disp_name.setBounds(700, 209, 210, 40);

        passfield.setEditable(false);
        passfield.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(passfield);
        passfield.setBounds(640, 330, 180, 50);

        atm_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atmbg2.jpg"))); // NOI18N
        jPanel1.add(atm_bg);
        atm_bg.setBounds(540, 185, 380, 240);

        main_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atmgif0.jpg"))); // NOI18N
        jPanel1.add(main_bg);
        main_bg.setBounds(370, 0, 720, 780);

        bCancel.setText("cancel");
        bCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelActionPerformed(evt);
            }
        });
        jPanel1.add(bCancel);
        bCancel.setBounds(810, 690, 70, 30);

        b_clear.setText("clear");
        b_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_clearActionPerformed(evt);
            }
        });
        jPanel1.add(b_clear);
        b_clear.setBounds(810, 640, 70, 30);

        b_enter.setText("enter");
        b_enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_enterActionPerformed(evt);
            }
        });
        jPanel1.add(b_enter);
        b_enter.setBounds(810, 590, 60, 30);

        b9.setText("9");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        jPanel1.add(b9);
        b9.setBounds(740, 690, 60, 30);

        b8.setText("8");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        jPanel1.add(b8);
        b8.setBounds(670, 690, 60, 30);

        b7.setText("7");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        jPanel1.add(b7);
        b7.setBounds(590, 690, 60, 30);

        b6.setText("6");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        jPanel1.add(b6);
        b6.setBounds(740, 640, 60, 30);

        b5.setText("5");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        jPanel1.add(b5);
        b5.setBounds(670, 640, 60, 30);

        b4.setText("4");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        jPanel1.add(b4);
        b4.setBounds(590, 640, 60, 30);

        b2.setText("2");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        jPanel1.add(b2);
        b2.setBounds(670, 590, 60, 30);

        b1.setText("1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        jPanel1.add(b1);
        b1.setBounds(590, 590, 60, 30);

        jButton1.setText("0");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(670, 730, 60, 30);

        b3.setText("3");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        jPanel1.add(b3);
        b3.setBounds(740, 590, 60, 30);
        jPanel1.add(pin2);
        pin2.setBounds(640, 380, 130, 40);

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/w1.jpg"))); // NOI18N
        jPanel1.add(BG);
        BG.setBounds(0, 0, 1370, 780);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1370, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
         try{sound = Applet.newAudioClip(wavFile.toURL());}
    catch(Exception e){e.printStackTrace();}
     sound.play();
         i++;
        j=i+1;
        if(j<7)
        {
        inpass=new char[j];
        }
        pin[i]='2';
        String string=new String(inpass);
        passfield.setText(string);
        display();
    }//GEN-LAST:event_b2ActionPerformed

    private void b_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_clearActionPerformed
        // TODO add your handling code here:
         try{sound = Applet.newAudioClip(wavFile.toURL());}
    catch(Exception e){e.printStackTrace();}
     sound.play();
         i--;
        j=i+1;
        if(j<7)
        {
        inpass=new char[j];
        }
        pin[i+1]='\0';
        String string=new String(inpass);
        passfield.setText(string);
        displayc();
    }//GEN-LAST:event_b_clearActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
         try{sound = Applet.newAudioClip(wavFile.toURL());}
    catch(Exception e){e.printStackTrace();}
     sound.play();
        i++;
        j=i+1;
        if(j<7)
        {
        inpass=new char[j];
        }
      // }
        pin[i]='1';
        String string=new String(inpass);
        passfield.setText(string);
        display();
    }//GEN-LAST:event_b1ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
         try{sound = Applet.newAudioClip(wavFile.toURL());}
    catch(Exception e){e.printStackTrace();}
     sound.play();
         i++;
        j=i+1;
        if(j<7)
        {
        inpass=new char[j];
        }
        pin[i]='3';
        String string=new String(inpass);
        passfield.setText(string);
        display();
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        // TODO add your handling code here:
         try{sound = Applet.newAudioClip(wavFile.toURL());}
    catch(Exception e){e.printStackTrace();}
     sound.play();
         i++;
        j=i+1;
        if(j<7)
        {
        inpass=new char[j];
        }
        pin[i]='4';
        String string=new String(inpass);
        passfield.setText(string);
        display();
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        // TODO add your handling code here:
         try{sound = Applet.newAudioClip(wavFile.toURL());}
    catch(Exception e){e.printStackTrace();}
     sound.play();
         i++;
        j=i+1;
        if(j<7)
        {
        inpass=new char[j];
        }
        pin[i]='5';
        String string=new String(inpass);
        passfield.setText(string);
        display();
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        // TODO add your handling code here:
         try{sound = Applet.newAudioClip(wavFile.toURL());}
    catch(Exception e){e.printStackTrace();}
     sound.play();
         i++;
        j=i+1;
        if(j<7)
        {
        inpass=new char[j];
        }
        pin[i]='6';
        String string=new String(inpass);
        passfield.setText(string);
        display();
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        // TODO add your handling code here:
         try{sound = Applet.newAudioClip(wavFile.toURL());}
    catch(Exception e){e.printStackTrace();}
     sound.play();
         i++;
        j=i+1;
        if(j<7)
        {
        inpass=new char[j];
        }
        pin[i]='7';
        String string=new String(inpass);
        passfield.setText(string);
        display();
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        // TODO add your handling code here:
         try{sound = Applet.newAudioClip(wavFile.toURL());}
    catch(Exception e){e.printStackTrace();}
     sound.play();
         i++;
        j=i+1;
        if(j<7)
        {
        inpass=new char[j];
        }
        pin[i]='8';
        String string=new String(inpass);
        passfield.setText(string);
        display();
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        // TODO add your handling code here:
         try{sound = Applet.newAudioClip(wavFile.toURL());}
    catch(Exception e){e.printStackTrace();}
     sound.play();
         i++;
        j=i+1;
        if(j<7)
        {
        inpass=new char[j];
        }
        pin[i]='9';
        String string=new String(inpass);
        passfield.setText(string);
        display();
    }//GEN-LAST:event_b9ActionPerformed

    private void b_enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_enterActionPerformed
        // TODO add your handling code here:
         try{sound = Applet.newAudioClip(wavFile.toURL());}
    catch(Exception e){e.printStackTrace();}
     sound.play();
       
        int a;
        
        try {
            // TODO add your handling code here:
       
            get();
          a=compare();
          

            if(a==1)
            {
            trans_processed t1=new trans_processed();
            t1.get();
            t1.setVisible(true);
            dispose();
            
            }
            else
            {
                wrongtpin tp1=new wrongtpin();
                 tp1.setVisible(true);
                 dispose();

            }
        } catch (SQLException ex) {
            Logger.getLogger(cpin.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_b_enterActionPerformed
public int compare() throws SQLException
    {
        
        
       if(out.equals(tp[p])==true)
        {
            
            return 1;
            
          //  System.out.println("dhfjhfj");
        }
       return 0;
    }
      // return 0;
       /*
       else
        {
             System.out.println("dhfjhfj");
              System.out.println(pin.equals(cp));
              System.out.println();
        } */
       // System.out.println(out);
    
    private void bCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelActionPerformed
        // TODO add your handling code here:
         try{sound = Applet.newAudioClip(wavFile.toURL());}
    catch(Exception e){e.printStackTrace();}
     sound.play();
        trans_cancelled t1=new trans_cancelled();
         t1.setVisible(true);
         dispose();
    }//GEN-LAST:event_bCancelActionPerformed

    private void disp_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disp_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_disp_nameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         try{sound = Applet.newAudioClip(wavFile.toURL());}
    catch(Exception e){e.printStackTrace();}
     sound.play();
         i++;
        j=i+1;
        if(j<7)
        {
        inpass=new char[j];
        }
        pin[i]='0';
        String string=new String(inpass);
        passfield.setText(string);
        display();
    }//GEN-LAST:event_jButton1ActionPerformed
     public void display()
    {
           out=new String(pin);
        
     pin2.setText(out);   
    }
     public void displayc()
    {
          out=new String(pin);
        
     pin2.setText(out);   
    }
     public  void get() throws SQLException
    {
        cpin c1=new cpin();
        p=c1.disp();
        db db1=new db();
        name = db1.db_name();
        tp = db1.db_pin();
       
        disp_name.setText(name[p]); 
    
    }
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
            java.util.logging.Logger.getLogger(tpin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tpin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tpin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tpin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tpin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel atm_bg;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton bCancel;
    private javax.swing.JButton b_clear;
    private javax.swing.JButton b_enter;
    private javax.swing.JTextField disp_name;
    private javax.swing.JLabel hello_text;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel main_bg;
    private javax.swing.JPasswordField passfield;
    private javax.swing.JTextField pin2;
    private javax.swing.JLabel pin_text;
    // End of variables declaration//GEN-END:variables
}




