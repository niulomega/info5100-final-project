/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import ReliefSystem.Ecosystem;
import ReliefSystem.DB4oUtil.DB4OUtil;
import ReliefSystem.Organization;

import ReliefSystem.UserAccount.UserAccount;
import UserInterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JFrame;

/**
 *
 * @author divya
 */
public class SysAdmin extends javax.swing.JFrame {

    /**
     * Creates new form SysAdmin
     */
    private Ecosystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    public SysAdmin() {
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

        loginPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblDog = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        vetReliefLbl = new javax.swing.JLabel();
        lblAdmin = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        lblLogin = new javax.swing.JLabel();
        topLable = new javax.swing.JPanel();
        greetingLbl = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        lblBackBtn = new javax.swing.JLabel();
        container = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Sysadmin.png"))); // NOI18N
        lblDog.setText("jLabel1");
        jPanel1.add(lblDog, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, 440, 577));

        vetReliefLbl.setBackground(new java.awt.Color(0, 153, 153));
        vetReliefLbl.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        vetReliefLbl.setForeground(new java.awt.Color(0, 153, 153));
        vetReliefLbl.setText("VET RELIEF SYSTEM");

        lblAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Capture_resized.PNG"))); // NOI18N

        txtUserName.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        txtPassword.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        lblLogin.setBackground(new java.awt.Color(0, 153, 153));
        lblLogin.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(0, 153, 153));
        lblLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogin.setText("LOGIN");
        lblLogin.setBorder(new javax.swing.border.MatteBorder(null));
        lblLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblLoginMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(lblAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUserName)
                            .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 75, Short.MAX_VALUE)
                .addComponent(vetReliefLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(vetReliefLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(886, 886, 886))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(loginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 580));

        topLable.setBackground(new java.awt.Color(0, 153, 153));
        topLable.setForeground(new java.awt.Color(0, 153, 153));
        topLable.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        greetingLbl.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        topLable.add(greetingLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 430, 30));

        lblLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png"))); // NOI18N
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblLogoutMousePressed(evt);
            }
        });
        topLable.add(lblLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblBackBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\divya\\Pictures\\AED Project\\backbtn.png")); // NOI18N
        topLable.add(lblBackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(topLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 60));

        container.setLayout(new java.awt.CardLayout());
        getContentPane().add(container, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 830, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMousePressed
        // TODO add your handling code here:
        UserAccount useraccount = system.getUserAccountDirectory().authenticateUser(txtUserName.getText(), txtPassword.getText());
        loginPanel.setVisible(false);
        txtPassword.setVisible(false);
        txtUserName.setVisible(false);
        lblLogin.setVisible(false);
        CardLayout crdLyt = (CardLayout) container.getLayout();
        container.add("Login", useraccount.getRole().createWorkArea(container, useraccount, system));
        crdLyt.next(container);
    }//GEN-LAST:event_lblLoginMousePressed

    private void lblLogoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMousePressed
        // TODO add your handling code here:
        container.removeAll();
        JPanel blankJP = new JPanel();
        container.add("blank", blankJP);
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.next(container);
        dB4OUtil.storeSystem(system);
        loginPanel.setVisible(true);
        txtPassword.setVisible(true);
        txtUserName.setVisible(true);
        lblLogin.setVisible(true);
        txtPassword.setText("");
        txtUserName.setText("");
        topLable.setVisible(false);
    }//GEN-LAST:event_lblLogoutMousePressed

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
            java.util.logging.Logger.getLogger(SysAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SysAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SysAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SysAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SysAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel container;
    private javax.swing.JLabel greetingLbl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel lblBackBtn;
    private javax.swing.JLabel lblDog;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPanel topLable;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JLabel vetReliefLbl;
    // End of variables declaration//GEN-END:variables
}
