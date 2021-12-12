/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import ReliefSystem.DB4oUtil.DB4OUtil;
import ReliefSystem.Ecosystem;
import ReliefSystem.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author 18578
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private Ecosystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    public MainJFrame() {
        initComponents();
        system = dB4OUtil.retrieveSystem();
        this.setSize(1680, 1050);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        ControlPanel = new javax.swing.JPanel();
        txtusername = new javax.swing.JTextField();
        btnlogin = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        container = new javax.swing.JPanel();
        lblDogimg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        ControlPanel.setBackground(new java.awt.Color(255, 255, 255));
        ControlPanel.setMinimumSize(new java.awt.Dimension(200, 213));
        ControlPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        ControlPanel.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 130, 30));

        btnlogin.setBackground(new java.awt.Color(255, 255, 255));
        btnlogin.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnlogin.setForeground(new java.awt.Color(0, 153, 153));
        btnlogin.setText("LOGIN");
        btnlogin.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        ControlPanel.add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 80, 30));

        btnlogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png"))); // NOI18N
        btnlogout.setBorder(null);
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });
        ControlPanel.add(btnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user-profile-icon-free-vector.jpg"))); // NOI18N
        ControlPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/key_resized.jpg"))); // NOI18N
        ControlPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Capture_resized.PNG"))); // NOI18N
        ControlPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 100, 120));
        ControlPanel.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 120, 30));

        jSplitPane1.setLeftComponent(ControlPanel);

        container.setBackground(new java.awt.Color(255, 255, 255));
        container.setLayout(new java.awt.CardLayout());

        lblDogimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Sysadmin.png"))); // NOI18N
        container.add(lblDogimg, "card2");

        jSplitPane1.setRightComponent(container);

        getContentPane().add(jSplitPane1, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        // TODO add your handling code here:
        UserAccount useraccount = system.getUserAccountDirectory().authenticateUser(txtusername.getText(), txtpassword.getText());

        CardLayout crdLyt = (CardLayout) container.getLayout();
        container.add("Login", useraccount.getRole().createWorkArea(container, useraccount, system));
        crdLyt.next(container);
        btnlogout.setEnabled(true);
    }//GEN-LAST:event_btnloginActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        // TODO add your handling code here:
        btnlogout.setEnabled(false);
        txtusername.setEnabled(true);
        txtpassword.setEnabled(true);
        btnlogin.setEnabled(true);

        txtusername.setText("");
        txtpassword.setText("");

        container.removeAll();
        JPanel blankJP = new JPanel();
        container.add("blank", blankJP);
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.next(container);
        dB4OUtil.storeSystem(system);
        container.setVisible(true);
    }//GEN-LAST:event_btnlogoutActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        StartScreen start = new StartScreen();
        start.setVisible(true);
        try {
            for (int row = 0; row <= 100; row++) {
                Thread.sleep(10);
                start.loadingNumber.setText(Integer.toString(row) + "%");
                start.loadingprogressBar.setValue(row);
                if (row == 100) {
                    java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                            start.setVisible(false);
                            new MainJFrame().setVisible(true);
                        }
                    });

                }
            }
        } catch (Exception e) {
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ControlPanel;
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton btnlogout;
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblDogimg;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
