/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.HealthCamp;

import ReliefSystem.Ecosystem;
import ReliefSystem.HealthCamp.HealthCamp;
import ReliefSystem.HealthCamp.HealthCampDirectory;
import ReliefSystem.PetVolunteer.PetVolunteer;
import ReliefSystem.PetVolunteer.PetVolunteerDirectory;
import ReliefSystem.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 18578
 */
public class ManagePetVolunteer extends javax.swing.JPanel {

    /**
     * Creates new form ManagePetVolunteer
     */
    JPanel userProcessContainer;
    Ecosystem system;
    UserAccount account;
//    private ReliefSystem.PetVolunteer.PetVolunteerDirectory petVolunteerDirectory;

    public ManagePetVolunteer(JPanel userProcessContainer, UserAccount account, Ecosystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.account = account;
//        this.petVolunteerDirectory = petVolunteerDirectory;
        populatePetVolunteerTable();
    }

    public void populatePetVolunteerTable() {
        String healthCampName = null;
        for (HealthCamp healthCamp : system.getHealthCampDirectory().getHealthCampDirectory()) {
            if (healthCamp.getUsername().equals(account.getUsername())) {
                healthCampName = healthCamp.getHealthCampName();
//                for(PetVolunteer petVolunteer : healthCamp.getPetVolunteerList()) {
//                    Object[] row = new Object[2];
//                    row[0] = petVolunteer;
//                    row[1] = petVolunteer.getPetType();
//                }
            }
        }
//        System.out.println("health camp name: " + healthCampName);

        DefaultTableModel tablemodel = (DefaultTableModel) tblPetVolunteerHealthCamp.getModel();
        tablemodel.setRowCount(0);

        for (PetVolunteer petVolunteer : system.getPetVolunteerDirectory().getPetVolunteerDirectory()) {
            if (petVolunteer.getHealthCamp().equals(healthCampName)) {
                Object[] row = new Object[4];
                row[0] = petVolunteer;
                row[2] = petVolunteer.getUsername();
                row[1] = petVolunteer.getPetType();
                row[3] = petVolunteer.getHealthCamp();
                
                tablemodel.addRow(row);
            }
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
        tblPetVolunteerHealthCamp = new javax.swing.JTable();
        lblpetowner = new javax.swing.JLabel();
        txtpetowner = new javax.swing.JTextField();
        lblpettype = new javax.swing.JLabel();
        txtpettype = new javax.swing.JTextField();
        lblorgname = new javax.swing.JLabel();
        txtorgname = new javax.swing.JTextField();
        comboxhealth = new javax.swing.JComboBox<>();
        lblhealthstatus = new javax.swing.JLabel();
        btnRegisterForHospital = new javax.swing.JButton();
        lblhospitalname = new javax.swing.JLabel();
        txthospitalname = new javax.swing.JTextField();
        lbldriver = new javax.swing.JLabel();
        txtdriver = new javax.swing.JTextField();
        btnView = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtPetUsername = new javax.swing.JTextField();

        tblPetVolunteerHealthCamp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Pet Owner", "Pet Type", "Pet username", "Org name"
            }
        ));
        jScrollPane1.setViewportView(tblPetVolunteerHealthCamp);

        lblpetowner.setText("Pet Owner");

        lblpettype.setText("Pet Type");

        lblorgname.setText("Org Name");

        comboxhealth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Good", "Bad" }));

        lblhealthstatus.setText("Health Status");

        btnRegisterForHospital.setText("Register For Hospital ");
        btnRegisterForHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterForHospitalActionPerformed(evt);
            }
        });

        lblhospitalname.setText("Hospital Name");

        lbldriver.setText("Driver");

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        jLabel1.setText("Pet username");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnView)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(167, 167, 167)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblpettype)
                                    .addComponent(lblorgname)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblpetowner)
                                            .addComponent(lblhealthstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblhospitalname)
                                            .addComponent(lbldriver, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1))
                                        .addGap(100, 100, 100)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(comboxhealth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtpettype, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                            .addComponent(txtpetowner, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                            .addComponent(txtorgname, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                            .addComponent(txthospitalname)
                                            .addComponent(txtdriver)
                                            .addComponent(txtPetUsername)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(btnRegisterForHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(171, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnView)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblpetowner)
                    .addComponent(txtpetowner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblpettype))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtpettype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblorgname)
                    .addComponent(txtorgname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblhealthstatus)
                    .addComponent(comboxhealth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblhospitalname)
                    .addComponent(txthospitalname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldriver)
                    .addComponent(txtdriver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPetUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(50, 50, 50)
                .addComponent(btnRegisterForHospital)
                .addContainerGap(104, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterForHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterForHospitalActionPerformed
        // TODO add your handling code here:
//        ManageHealthCampHospital manageHealthCampHospitalJPanel = new ManageHealthCampHospital(userProcessContainer, system);
//        userProcessContainer.add("ManagePetVolunteers", manageHealthCampHospitalJPanel);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);

          for(PetVolunteer petVolunteer: system.getPetVolunteerDirectory().getPetVolunteerDirectory()) {
              if(petVolunteer.getUsername().equals(txtPetUsername.getText())) {
                  system.getPetVolunteerDirectory().updatePetVolunteerHospitalInfo(petVolunteer, txthospitalname.getText(), txtdriver.getText());
              }
          }
    }//GEN-LAST:event_btnRegisterForHospitalActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblPetVolunteerHealthCamp.getSelectedRow();
        PetVolunteer petVolunterSelected = (PetVolunteer) tblPetVolunteerHealthCamp.getValueAt(selectedRow, 0);
        txtpetowner.setText(petVolunterSelected.getName());
        txtorgname.setText(petVolunterSelected.getHealthCamp());
        txtpettype.setText(petVolunterSelected.getPetType());
        txtPetUsername.setText(petVolunterSelected.getUsername());
    }//GEN-LAST:event_btnViewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegisterForHospital;
    private javax.swing.JButton btnView;
    private javax.swing.JComboBox<String> comboxhealth;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbldriver;
    private javax.swing.JLabel lblhealthstatus;
    private javax.swing.JLabel lblhospitalname;
    private javax.swing.JLabel lblorgname;
    private javax.swing.JLabel lblpetowner;
    private javax.swing.JLabel lblpettype;
    private javax.swing.JTable tblPetVolunteerHealthCamp;
    private javax.swing.JTextField txtPetUsername;
    private javax.swing.JTextField txtdriver;
    private javax.swing.JTextField txthospitalname;
    private javax.swing.JTextField txtorgname;
    private javax.swing.JTextField txtpetowner;
    private javax.swing.JTextField txtpettype;
    // End of variables declaration//GEN-END:variables
}
