/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Hospital;

import ReliefSystem.Ecosystem;
import ReliefSystem.LabAssistant.LabAssistant;
import ReliefSystem.PetVolunteer.PetVolunteer;
import ReliefSystem.Vet.Vet;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 18578
 */
public class VetWorkarea extends javax.swing.JPanel {

    /**
     * Creates new form VetWorkarea
     */
    JPanel userProcessContainer;
    Ecosystem system;

    public VetWorkarea(JPanel userProcessContainer, Ecosystem system) {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblVetPetOwners = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnFurtherExaminationLab = new javax.swing.JButton();
        btnAssignPharmacy = new javax.swing.JButton();

        tblVetPetOwners.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Vet Name", "Pet Owner", "Pet Type", "Health Camp"
            }
        ));
        jScrollPane1.setViewportView(tblVetPetOwners);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome Vet");

        btnFurtherExaminationLab.setText("Assign Lab");
        btnFurtherExaminationLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFurtherExaminationLabActionPerformed(evt);
            }
        });

        btnAssignPharmacy.setText("Assign Pharmacy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(btnFurtherExaminationLab)
                .addGap(54, 54, 54)
                .addComponent(btnAssignPharmacy)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFurtherExaminationLab)
                    .addComponent(btnAssignPharmacy))
                .addContainerGap(200, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnFurtherExaminationLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFurtherExaminationLabActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblVetPetOwners.getSelectedRow();
        Vet vetSelected = (Vet) tblVetPetOwners.getValueAt(selectedRow, 0);
        for(LabAssistant labAssistant: system.getLabAssistantDirectory().getLabAssistantDirectory()) {
            for(Vet vet: system.getVetDirectory().getVetDirectory()) {
                if(vet.getHospitalName().equals(labAssistant.getHospitalName())) {
                    System.out.println("selected vet : " + vetSelected.getUsername() + " " + vetSelected.getHealthCamp());
                    system.getLabAssistantDirectory().updateLabAssistantInfo(labAssistant, vetSelected.getUsername(), vetSelected.getPetOwner(),vetSelected.getPetType(),vetSelected.getHealthCamp());
                    System.out.println("lab assistant assigned here");
                }
            }
        }
        JOptionPane.showMessageDialog(this, "Lab assistant assigned successfully");

    }//GEN-LAST:event_btnFurtherExaminationLabActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignPharmacy;
    private javax.swing.JButton btnFurtherExaminationLab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblVetPetOwners;
    // End of variables declaration//GEN-END:variables

    private void populateVetTable() {
        DefaultTableModel tablemodel = (DefaultTableModel) tblVetPetOwners.getModel();
        for(PetVolunteer petVolunteer : system.getPetVolunteerDirectory().getPetVolunteerDirectory()) {
            for(Vet vet: system.getVetDirectory().getVetDirectory()) {
                System.out.println("pet volunteer hosp name : " + petVolunteer.getHospitalName() );
                System.out.println("vet hosp name : " + vet.getHospitalName() );
                if(vet.getHospitalName().equals(petVolunteer.getHospitalName())){
                    Object[] row = new Object[4];
                    row[0] = vet;
                    row[1] = vet.getPetOwner();
                    row[2] = vet.getPetType();
                    row[3] = vet.getHealthCamp();
                    tablemodel.addRow(row);
                }
            }
        }
    }
}
