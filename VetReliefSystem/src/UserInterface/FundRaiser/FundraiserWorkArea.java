/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.FundRaiser;

import ReliefSystem.Ecosystem;
import ReliefSystem.FundRaising.FundRaising;
import ReliefSystem.Sponsor.Sponsor;
import ReliefSystem.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 18578
 */
public class FundraiserWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form FundraiserWorkArea
     */
    JPanel userProcessContainer;
    Ecosystem system;
    private UserAccount account;
    public FundraiserWorkArea(JPanel userProcessContainer, UserAccount account, Ecosystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.account = account;
        populateFundRaisingTable();
    }

    
    public void populateFundRaisingTable() {
        DefaultTableModel tablemodel = (DefaultTableModel) tblfundraiser.getModel();

        tablemodel.setRowCount(0);
        for (UserAccount user : system.getUserAccountDirectory().getUserAccountList()) {

//            if (user.getRole().getClass().getName().equals("ReliefSystem.Role.HealthCampRole")) {
               
            
        }
        for(FundRaising fundRaising: system.getFundRaisingDirectory().getFundRaisingDirectory()){
             Object[] row = new Object[5];
                row[0] = fundRaising;
                row[1] = fundRaising.getPetOwner();
                row[2] = fundRaising.getPetType();
                row[3] = fundRaising.getHealthCamp();
                row[4] = fundRaising.getSponsorStatus() == null ? "N/A" : fundRaising.getSponsorStatus();
                tablemodel.addRow(row);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblfundraiser = new javax.swing.JTable();
        btnAddSponsor = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblfundraiser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Fundraiser Name", "Pet Owner", "Pet Type", "Health Camp", "Sponsor Status"
            }
        ));
        jScrollPane1.setViewportView(tblfundraiser);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 560, 90));

        btnAddSponsor.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnAddSponsor.setForeground(new java.awt.Color(0, 102, 102));
        btnAddSponsor.setText("ADD SPONSOR");
        btnAddSponsor.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        btnAddSponsor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSponsorActionPerformed(evt);
            }
        });
        add(btnAddSponsor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 130, 30));

        btnRefresh.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(0, 102, 102));
        btnRefresh.setText("REFRESH");
        btnRefresh.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 100, 30));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGE FUND REQUESTS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 350, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manage_fund_requests.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 830, 500));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddSponsorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSponsorActionPerformed
        // TODO add your handling code here:

        int selectedRow = tblfundraiser.getSelectedRow();
        FundRaising fundRaiserSelected = (FundRaising) tblfundraiser.getValueAt(selectedRow, 0);
        for(Sponsor sponsor: system.getSponsorDirectory().getSponsorDirectory()) {
            system.getSponsorDirectory().updateSponsorPetOwnerInfo(sponsor, fundRaiserSelected.getPetOwner(), fundRaiserSelected.getPetType(), fundRaiserSelected.getHealthCamp(), fundRaiserSelected.getHospitalName());
            System.out.println("Sponsor successfully added");
        }
        JOptionPane.showMessageDialog(this, "Request sent to sponsor");

    }//GEN-LAST:event_btnAddSponsorActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populateFundRaisingTable();
    }//GEN-LAST:event_btnRefreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddSponsor;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblfundraiser;
    // End of variables declaration//GEN-END:variables
}
