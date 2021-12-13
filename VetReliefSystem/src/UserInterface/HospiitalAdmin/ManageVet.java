/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.HospiitalAdmin;

import ReliefSystem.Ecosystem;
import ReliefSystem.Role.VetRole;
import ReliefSystem.UserAccount.UserAccount;
import ReliefSystem.Vet.Vet;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 18578
 */
public class ManageVet extends javax.swing.JPanel {

    /**
     * Creates new form ManageVet
     */
    JPanel userProcessContainer;
    Ecosystem system;
    public ManageVet(JPanel userProcessContainer, Ecosystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populateVetTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVet = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblname = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        lblusername = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        lblpassword = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();
        txtpass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGE VET");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 227, -1));

        tblVet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name ", "Username", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblVet);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 420, 92));

        jButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 102));
        jButton1.setText("VIEW");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 80, 30));

        jButton2.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 102));
        jButton2.setText("UPDATE");
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 90, 30));

        btnDelete.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(0, 102, 102));
        btnDelete.setText("DELETE");
        btnDelete.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 90, 30));

        lblname.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lblname.setForeground(new java.awt.Color(0, 102, 102));
        lblname.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblname.setText("NAME");
        add(lblname, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 110, 30));

        txtname.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 150, 30));

        lblusername.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lblusername.setForeground(new java.awt.Color(0, 102, 102));
        lblusername.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblusername.setText("USERNAME");
        add(lblusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 120, 30));

        txtusername.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 150, 30));

        lblpassword.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lblpassword.setForeground(new java.awt.Color(0, 102, 102));
        lblpassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblpassword.setText("PASSWORD");
        add(lblpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 110, 30));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backbutton.png"))); // NOI18N
        btnBack.setBorder(null);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 11, -1, 40));

        btnadd.setBackground(new java.awt.Color(255, 255, 255));
        btnadd.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnadd.setForeground(new java.awt.Color(0, 102, 102));
        btnadd.setText("ADD VET");
        btnadd.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, 120, 40));

        txtpass.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 150, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/doctor.png"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(820, 580));
        jLabel3.setMinimumSize(new java.awt.Dimension(820, 580));
        jLabel3.setPreferredSize(new java.awt.Dimension(820, 580));
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 840, 550));
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tblVet.getSelectedRow();
        if (selectedRow >= 0) {
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Confirm delete?", "Warning", selectionButton);
            if (selectionResult == JOptionPane.YES_OPTION) {
                String username = (String) tblVet.getValueAt(selectedRow, 1);
                String pwd = (String) tblVet.getValueAt(selectedRow, 2);
                UserAccount user = system.getUserAccountDirectory().authenticateUser(username, pwd);

                system.getUserAccountDirectory().deleteUserAccount(user);
                system.getVetDirectory().deleteVet(user.getUsername());
                populateVetTable();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row to delete the account");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // TODO add your handling code here:
        if (system.getUserAccountDirectory().checkIfUsernameIsUnique(txtusername.getText())) {
            UserAccount userAccount = system.getUserAccountDirectory().createUserAccount(txtname.getText(), txtusername.getText(), txtpass.getText(), null, new VetRole());
            Vet vet = system.getVetDirectory().createUserAccount(txtusername.getText());
            populateVetTable();
            txtname.setText("");
            txtusername.setText(""); 
            txtpass.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Username is not unique");
        }
    }//GEN-LAST:event_btnaddActionPerformed


    public void populateVetTable() {
        DefaultTableModel tablemodel = (DefaultTableModel) tblVet.getModel();

        tablemodel.setRowCount(0);
        for (UserAccount user : system.getUserAccountDirectory().getUserAccountList()) {

            if (user.getRole().getClass().getName().equals("ReliefSystem.Role.VetRole")) {
                Object[] row = new Object[3];
                row[0] = user.getName();
                row[1] = user.getUsername();
                row[2] = user.getPassword();
                tablemodel.addRow(row);
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JLabel lblusername;
    private javax.swing.JTable tblVet;
    private javax.swing.JTextField txtname;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
