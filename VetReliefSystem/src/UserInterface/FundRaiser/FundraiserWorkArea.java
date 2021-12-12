/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.FundRaiser;

import ReliefSystem.Ecosystem;
import ReliefSystem.FundRaising.FundRaising;
import ReliefSystem.UserAccount.UserAccount;
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
             Object[] row = new Object[4];
                row[0] = fundRaising.getPetOwner();
                row[1] = fundRaising.getPetType();
                row[2] = fundRaising.getHealthCamp();
                row[3] = fundRaising.getSponsor() == null ? "N/A" : fundRaising.getSponsor();
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

        tblfundraiser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "pet owner", "pet type", "HealthCamp", "Sponsor"
            }
        ));
        jScrollPane1.setViewportView(tblfundraiser);

        btnAddSponsor.setText("Add Sponsor");
        btnAddSponsor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSponsorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(btnAddSponsor)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnAddSponsor)
                .addContainerGap(128, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddSponsorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSponsorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddSponsorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddSponsor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblfundraiser;
    // End of variables declaration//GEN-END:variables
}