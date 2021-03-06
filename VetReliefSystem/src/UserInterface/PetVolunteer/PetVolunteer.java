/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PetVolunteer;

import ReliefSystem.Ecosystem;
import ReliefSystem.HealthCamp.HealthCamp;
import ReliefSystem.UserAccount.UserAccount;
import javax.swing.JPanel;
//import ReliefSystem.PetVolunteer.PetVolunteerDirectory;
//import ReliefSystem.PetVolunteer.PetVolunteer;
import java.awt.CardLayout;
//import ReliefSystem.PetVolunteer.PetVolunteer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 18578
 */
public class PetVolunteer extends javax.swing.JPanel {

    /**
     * Creates new form PetVolunteer
     */
    JPanel userProcessContainer;
    Ecosystem system;
    private UserAccount account;
    private PetVolunteer petVolunteer;

    public PetVolunteer(JPanel userProcessContainer, UserAccount account, Ecosystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.account = account;
        txtpetowner.setText(account.getUsername());
        populateHealthCamptable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblpetowner = new javax.swing.JLabel();
        txtpetowner = new javax.swing.JTextField();
        lblpettype = new javax.swing.JLabel();
        txtpettype = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtHealthCamp = new javax.swing.JTextField();
        btnSavePetVolunteer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHealthCamps = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblpetowner.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lblpetowner.setForeground(new java.awt.Color(0, 102, 102));
        lblpetowner.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblpetowner.setText("PET OWNER");
        add(lblpetowner, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 100, 30));

        txtpetowner.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        txtpetowner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpetownerActionPerformed(evt);
            }
        });
        add(txtpetowner, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 130, 30));

        lblpettype.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lblpettype.setForeground(new java.awt.Color(0, 102, 102));
        lblpettype.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblpettype.setText("PET TYPE");
        add(lblpettype, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 80, 30));

        txtpettype.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        add(txtpettype, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 130, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WELCOME PET VOLUNTEER");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 340, 50));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("HEALTH CAMP");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 140, 30));

        txtHealthCamp.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        add(txtHealthCamp, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 130, 30));

        btnSavePetVolunteer.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnSavePetVolunteer.setForeground(new java.awt.Color(0, 102, 102));
        btnSavePetVolunteer.setText("SAVE");
        btnSavePetVolunteer.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        btnSavePetVolunteer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSavePetVolunteerActionPerformed(evt);
            }
        });
        add(btnSavePetVolunteer, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 90, 40));

        tblHealthCamps.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        tblHealthCamps.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Health Camp Name"
            }
        ));
        jScrollPane1.setViewportView(tblHealthCamps);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, 150, 90));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/welcome_volunteer.jpg"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 550));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSavePetVolunteerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavePetVolunteerActionPerformed
        // TODO add your handling code here:
        for (ReliefSystem.PetVolunteer.PetVolunteer petVolunteer : system.getPetVolunteerDirectory().getPetVolunteerDirectory()) {
            if (petVolunteer.getUsername().equals(account.getUsername())) {
                system.getPetVolunteerDirectory().updatePetVolunteerInfo(petVolunteer, txtpetowner.getText(), txtpettype.getText(), txtHealthCamp.getText());
            }
        }
        JOptionPane.showMessageDialog(this, "VOlunteer added successfully");

    }//GEN-LAST:event_btnSavePetVolunteerActionPerformed

    private void txtpetownerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpetownerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpetownerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSavePetVolunteer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblpetowner;
    private javax.swing.JLabel lblpettype;
    private javax.swing.JTable tblHealthCamps;
    private javax.swing.JTextField txtHealthCamp;
    private javax.swing.JTextField txtpetowner;
    private javax.swing.JTextField txtpettype;
    // End of variables declaration//GEN-END:variables

    private void populateHealthCamptable() {

        DefaultTableModel tablemodel = (DefaultTableModel) tblHealthCamps.getModel();

        tablemodel.setRowCount(0);
        
        for(HealthCamp healthCamp: system.getHealthCampDirectory().getHealthCampDirectory()) {
        
            Object[] row = new Object[1];
            row[0] = healthCamp.getHealthCampName();
            tablemodel.addRow(row);
            
        } 
    }
}
