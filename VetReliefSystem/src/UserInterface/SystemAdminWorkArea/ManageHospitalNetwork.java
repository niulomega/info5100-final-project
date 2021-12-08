/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdminWorkArea;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author 18578
 */
public class ManageHospitalNetwork extends javax.swing.JPanel {

    /**
     * Creates new form ManageHospitalNetwork
     */
    public ManageHospitalNetwork() {
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

        lblHospitalNetwork = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsername = new javax.swing.JTable();
        lblPassword = new javax.swing.JLabel();
        lblName1 = new javax.swing.JLabel();
        lblName2 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        lblUserName1 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnView = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHospitalNetwork.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/hospital_network (4).png"))); // NOI18N
        add(lblHospitalNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, 260, 280));
        lblHospitalNetwork.setOpaque(true);

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("MANAGE HOSPITAL NETWORK");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 370, 87));

        tblUsername.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        tblUsername.setForeground(new java.awt.Color(0, 153, 153));
        tblUsername.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "UserName", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblUsername);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, 91));

        lblPassword.setBackground(new java.awt.Color(0, 153, 153));
        lblPassword.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(0, 153, 153));
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPassword.setText("Password");
        add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, 210, 24));

        lblName1.setBackground(new java.awt.Color(0, 153, 153));
        lblName1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblName1.setForeground(new java.awt.Color(0, 153, 153));
        lblName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName1.setText("Name");
        add(lblName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 210, 24));

        lblName2.setBackground(new java.awt.Color(0, 153, 153));
        lblName2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblName2.setForeground(new java.awt.Color(0, 153, 153));
        lblName2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName2.setText("Name");
        add(lblName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 210, 24));

        txtUserName.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtUserName.setForeground(new java.awt.Color(0, 153, 153));
        add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, 180, 20));

        lblUserName1.setBackground(new java.awt.Color(0, 153, 153));
        lblUserName1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblUserName1.setForeground(new java.awt.Color(0, 153, 153));
        lblUserName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUserName1.setText("UserName");
        add(lblUserName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 210, 24));

        txtUsername.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(0, 153, 153));
        add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, 180, 20));

        txtPassword.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(0, 153, 153));
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, 180, 30));

        btnView.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnView.setForeground(new java.awt.Color(0, 153, 153));
        btnView.setText("VIEW");
        btnView.setBorder(new javax.swing.border.MatteBorder(null));
        add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 70, -1));

        jButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 153));
        jButton1.setText("UPDATE");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, -1, -1));

        jButton2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 153, 153));
        jButton2.setText("DELETE");
        jButton2.setBorder(new javax.swing.border.MatteBorder(null));
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, 70, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnView;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHospitalNetwork;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblName2;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUserName1;
    private javax.swing.JTable tblUsername;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
