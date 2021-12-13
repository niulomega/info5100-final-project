/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Sponsor;

import ReliefSystem.Ecosystem;
import ReliefSystem.FundRaising.FundRaising;
import ReliefSystem.Sponsor.Sponsor;
import ReliefSystem.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author niulp
 */
public class SponsorWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form SponsorWorkArea
     */
    JPanel userProcessContainer;
    Ecosystem system;
    private UserAccount account;
    public SponsorWorkArea(JPanel userProcessContainer, UserAccount account, Ecosystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.account = account;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    public void populateTable() {
        DefaultTableModel tablemodel = (DefaultTableModel) tblSponsorPetOwnerInfo.getModel();

        tablemodel.setRowCount(0);
        for(Sponsor sponsor : system.getSponsorDirectory().getSponsorDirectory()) {
            Object[] row= new Object[4];
            row[0] = sponsor;
            row[1] = sponsor.getPetOwner();
            row[2] = sponsor.getPetType();
            row[3] = sponsor.getHospitalName();
            tablemodel.addRow(row);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblSponsorPetOwnerInfo = new javax.swing.JTable();
        btnApproveFunds = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblSponsorPetOwnerInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Sponsor", "Pet owner", "Pet type", "Hospital name"
            }
        ));
        jScrollPane1.setViewportView(tblSponsorPetOwnerInfo);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, 119));

        btnApproveFunds.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnApproveFunds.setForeground(new java.awt.Color(0, 102, 102));
        btnApproveFunds.setText("APPROVE SPONSOR");
        btnApproveFunds.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        btnApproveFunds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveFundsActionPerformed(evt);
            }
        });
        add(btnApproveFunds, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 169, 34));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SPONSOR APPROVAL");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 399, 42));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sponsor_approval.PNG"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 830, 590));
    }// </editor-fold>//GEN-END:initComponents

    private void btnApproveFundsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveFundsActionPerformed
        // TODO add your handling code here:

        int selectedRow = tblSponsorPetOwnerInfo.getSelectedRow();
        Sponsor sponsorRowSelected = (Sponsor) tblSponsorPetOwnerInfo.getValueAt(selectedRow, 0);
//        for(Sponsor sponsor: system.getSponsorDirectory().getSponsorDirectory()){
//            for(FundRaising fundRaising: system.getFundRaisingDirectory().getFundRaisingDirectory()){
//                if(sponsor.getPetOwner().equals(fundRaising.getPetOwner())) {
//                    system.getFundRaisingDirectory().updateFundRaisingSponsorStatus(fundRaising, "Approved");
//                }
//            }
//        }
          for(FundRaising fundRaising: system.getFundRaisingDirectory().getFundRaisingDirectory()) {
              if(sponsorRowSelected.getPetOwner().equals(fundRaising.getPetOwner())) {
                  system.getFundRaisingDirectory().updateFundRaisingSponsorStatus(fundRaising, "Approved");
              }
          }
          
          JOptionPane.showMessageDialog(this,"Approved funds successfully");

    }//GEN-LAST:event_btnApproveFundsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApproveFunds;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSponsorPetOwnerInfo;
    // End of variables declaration//GEN-END:variables
}
