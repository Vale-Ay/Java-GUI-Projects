
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Valeria Aybar
 */
public class Question2 extends javax.swing.JFrame {

    /**
     * Creates new form Question2
     */
    
    int counter = 50;
    Timer timer = new Timer ();
    
    public Question2() {
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

        jLabelQuest2Title = new javax.swing.JLabel();
        jLabelQuest2Ln = new javax.swing.JLabel();
        jButtonHuman = new javax.swing.JButton();
        jButtonTree = new javax.swing.JButton();
        jButtonSun = new javax.swing.JButton();
        jButtonCandle = new javax.swing.JButton();
        jLabelTimerTitle = new javax.swing.JLabel();
        jLabelTimer = new javax.swing.JLabel();
        jLabelBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(797, 520));
        setPreferredSize(new java.awt.Dimension(797, 520));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabelQuest2Title.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        jLabelQuest2Title.setForeground(new java.awt.Color(255, 255, 255));
        jLabelQuest2Title.setText("Riddle 2:");
        getContentPane().add(jLabelQuest2Title);
        jLabelQuest2Title.setBounds(40, 40, 120, 30);

        jLabelQuest2Ln.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabelQuest2Ln.setForeground(new java.awt.Color(255, 255, 255));
        jLabelQuest2Ln.setText("I am tall when I am young, and I am short when I am old. What am I?");
        getContentPane().add(jLabelQuest2Ln);
        jLabelQuest2Ln.setBounds(50, 75, 650, 20);

        jButtonHuman.setIcon(new javax.swing.ImageIcon("C:\\Users\\Valeria Aybar\\Documents\\NetBeansProjects\\FinalProject\\Human resized.png")); // NOI18N
        jButtonHuman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonHumanMouseClicked(evt);
            }
        });
        getContentPane().add(jButtonHuman);
        jButtonHuman.setBounds(130, 120, 210, 170);

        jButtonTree.setIcon(new javax.swing.ImageIcon("C:\\Users\\Valeria Aybar\\Documents\\NetBeansProjects\\FinalProject\\Tree resized.png")); // NOI18N
        jButtonTree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonTreeMouseClicked(evt);
            }
        });
        getContentPane().add(jButtonTree);
        jButtonTree.setBounds(440, 120, 220, 170);

        jButtonSun.setIcon(new javax.swing.ImageIcon("C:\\Users\\Valeria Aybar\\Documents\\NetBeansProjects\\FinalProject\\Sun Resized.png")); // NOI18N
        jButtonSun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSunMouseClicked(evt);
            }
        });
        getContentPane().add(jButtonSun);
        jButtonSun.setBounds(130, 300, 210, 180);

        jButtonCandle.setIcon(new javax.swing.ImageIcon("C:\\Users\\Valeria Aybar\\Documents\\NetBeansProjects\\FinalProject\\Candle Resized.png")); // NOI18N
        jButtonCandle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCandleMouseClicked(evt);
            }
        });
        jButtonCandle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCandleActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCandle);
        jButtonCandle.setBounds(440, 300, 220, 180);

        jLabelTimerTitle.setFont(new java.awt.Font("OCR A Extended", 0, 13)); // NOI18N
        jLabelTimerTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTimerTitle.setText("Timer:");
        getContentPane().add(jLabelTimerTitle);
        jLabelTimerTitle.setBounds(390, 20, 50, 40);

        jLabelTimer.setFont(new java.awt.Font("OCR A Extended", 0, 13)); // NOI18N
        jLabelTimer.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabelTimer);
        jLabelTimer.setBounds(450, 10, 120, 60);

        jLabelBackground.setIcon(new javax.swing.ImageIcon("C:\\Users\\Valeria Aybar\\Documents\\NetBeansProjects\\FinalProject\\Grey Background.jpg")); // NOI18N
        getContentPane().add(jLabelBackground);
        jLabelBackground.setBounds(0, -10, 840, 550);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCandleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCandleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCandleActionPerformed

    private void jButtonHumanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonHumanMouseClicked
       JOptionPane.showMessageDialog (null,"Wrong, Try Again.");
       counter = (counter - 5);
    }//GEN-LAST:event_jButtonHumanMouseClicked

    private void jButtonTreeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonTreeMouseClicked
       JOptionPane.showMessageDialog (null,"Wrong, Try Again.");
       counter = (counter - 5);
    }//GEN-LAST:event_jButtonTreeMouseClicked

    private void jButtonSunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSunMouseClicked
        JOptionPane.showMessageDialog (null,"Wrong, Try Again.");
        counter = (counter - 5);
    }//GEN-LAST:event_jButtonSunMouseClicked

    private void jButtonCandleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCandleMouseClicked
        JOptionPane.showMessageDialog (null,"Correct!");
        timer.cancel();
              Question3 q3 = new Question3();
                q3.show ();
                dispose();
    }//GEN-LAST:event_jButtonCandleMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      
       counter = 50;
        TimerTask task;
        task = new TimerTask()
        {
            @Override
            public void run()
            {
                jLabelTimer.setText (Integer.toString(counter));
                counter--;
              
                if (counter <= 0)
                {
                    JOptionPane.showMessageDialog (null,"Time is Up!");
                    timer.cancel();
                      YouLose lose = new YouLose();
                       lose.show ();
                       dispose();
                }
             
            }
        };
        timer.scheduleAtFixedRate (task, 1000,1000);
    }//GEN-LAST:event_formWindowOpened
                                 
      
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
            java.util.logging.Logger.getLogger(Question2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Question2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Question2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Question2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Question2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCandle;
    private javax.swing.JButton jButtonHuman;
    private javax.swing.JButton jButtonSun;
    private javax.swing.JButton jButtonTree;
    private javax.swing.JLabel jLabelBackground;
    private javax.swing.JLabel jLabelQuest2Ln;
    private javax.swing.JLabel jLabelQuest2Title;
    private javax.swing.JLabel jLabelTimer;
    private javax.swing.JLabel jLabelTimerTitle;
    // End of variables declaration//GEN-END:variables
}
