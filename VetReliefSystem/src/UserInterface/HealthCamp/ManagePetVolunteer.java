/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.HealthCamp;

import ReliefSystem.Driver.Driver;
import ReliefSystem.Ecosystem;
import ReliefSystem.HealthCamp.HealthCamp;
import ReliefSystem.HealthCamp.HealthCampDirectory;
import ReliefSystem.Hospital.Hospital;
import ReliefSystem.PetVolunteer.PetVolunteer;
import ReliefSystem.PetVolunteer.PetVolunteerDirectory;
import ReliefSystem.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
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
        populateHospitalTable();
        populateDriverTable();

//        String driverNames[] = {};
//        List driverList = new ArrayList(Arrays.asList(driverNames));
//        for(Driver driver:system.getDriverDirectory().getDriverDirectory()) {
//            driverList.add(driver.getUsername());
//        }
//        driverNames = (String[]) driverList.toArray(driverNames);
//        System.out.println("Driver names: " + driverNames);
//        JComboBox<String> jComboDrivers = new JComboBox<>(driverNames);
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
        jComboBoxHealth = new javax.swing.JComboBox<>();
        lblhealthstatus = new javax.swing.JLabel();
        btnRegisterForHospital = new javax.swing.JButton();
        lblhospitalname = new javax.swing.JLabel();
        txthospitalname = new javax.swing.JTextField();
        lbldriver = new javax.swing.JLabel();
        txtdriver = new javax.swing.JTextField();
        btnView = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtPetUsername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHospitals = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDrivers = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 570, 113));

        lblpetowner.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lblpetowner.setForeground(new java.awt.Color(0, 102, 102));
        lblpetowner.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblpetowner.setText("PET OWNER");
        add(lblpetowner, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 120, 20));

        txtpetowner.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        add(txtpetowner, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 130, 20));

        lblpettype.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lblpettype.setForeground(new java.awt.Color(0, 102, 102));
        lblpettype.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblpettype.setText("PET TYPE");
        add(lblpettype, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 150, 20));

        txtpettype.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        add(txtpettype, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 130, 20));

        lblorgname.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lblorgname.setForeground(new java.awt.Color(0, 102, 102));
        lblorgname.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblorgname.setText("ORG NAME");
        add(lblorgname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 140, 20));

        txtorgname.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        add(txtorgname, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 130, 20));

        jComboBoxHealth.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jComboBoxHealth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Good", "Bad" }));
        jComboBoxHealth.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        
        
        add(jComboBoxHealth, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 130, 20));

        lblhealthstatus.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lblhealthstatus.setForeground(new java.awt.Color(0, 102, 102));
        lblhealthstatus.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblhealthstatus.setText("HEALTH STATUS");
        add(lblhealthstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 150, 20));

        btnRegisterForHospital.setBackground(new java.awt.Color(255, 255, 255));
        btnRegisterForHospital.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnRegisterForHospital.setForeground(new java.awt.Color(0, 102, 102));
        btnRegisterForHospital.setText("Register For Hospital ");
        btnRegisterForHospital.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        btnRegisterForHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterForHospitalActionPerformed(evt);
            }
        });
        add(btnRegisterForHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 550, 180, 30));

        lblhospitalname.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lblhospitalname.setForeground(new java.awt.Color(0, 102, 102));
        lblhospitalname.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblhospitalname.setText("HOSPITAL NAME");
        add(lblhospitalname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 150, 20));

        txthospitalname.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        add(txthospitalname, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 130, 20));

        lbldriver.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lbldriver.setForeground(new java.awt.Color(0, 102, 102));
        lbldriver.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbldriver.setText("DRIVER");
        add(lbldriver, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 130, 20));

        txtdriver.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        txtdriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdriverActionPerformed(evt);
            }
        });
        add(txtdriver, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, 130, 20));

        btnView.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnView.setForeground(new java.awt.Color(0, 102, 102));
        btnView.setText("VIEW");
        btnView.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 210, 90, 30));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("PET USERNAME");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 500, 130, 20));

        txtPetUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        add(txtPetUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 500, 130, 20));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MANAGE PET VOLUNTEER");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 430, 50));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backbutton.png"))); // NOI18N
        btnBack.setBorder(null);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, 50));

        tblHospitals.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Hospital Name"
            }
        ));
        jScrollPane2.setViewportView(tblHospitals);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 160, 110));

        tblDrivers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Driver name"
            }
        ));
        jScrollPane3.setViewportView(tblDrivers);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 440, 150, 110));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/voluneteer_needed (3).jpg"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 930, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterForHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterForHospitalActionPerformed
        // TODO add your handling code here:
//        ManageHealthCampHospital manageHealthCampHospitalJPanel = new ManageHealthCampHospital(userProcessContainer, system);
//        userProcessContainer.add("ManagePetVolunteers", manageHealthCampHospitalJPanel);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
if(validateInputFields()){

        for (PetVolunteer petVolunteer : system.getPetVolunteerDirectory().getPetVolunteerDirectory()) {
            if (petVolunteer.getUsername().equals(txtPetUsername.getText())) {
                system.getPetVolunteerDirectory().updatePetVolunteerHospitalInfo(petVolunteer, txthospitalname.getText(), txtdriver.getText());
            }
        }

        for (Driver driver : system.getDriverDirectory().getDriverDirectory()) {
            if (driver.getUsername().equals(txtdriver.getText())) {
                system.getDriverDirectory().updateDriverHealthCampInfo(driver, txtPetUsername.getText(), txtpettype.getText(), txtorgname.getText(), txthospitalname.getText());
            }
        }

        JOptionPane.showMessageDialog(this, "Registerd for hospital successfully");
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

    private void txtdriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdriverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdriverActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRegisterForHospital;
    private javax.swing.JButton btnView;
    private javax.swing.JComboBox<String> jComboBoxHealth;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbldriver;
    private javax.swing.JLabel lblhealthstatus;
    private javax.swing.JLabel lblhospitalname;
    private javax.swing.JLabel lblorgname;
    private javax.swing.JLabel lblpetowner;
    private javax.swing.JLabel lblpettype;
    private javax.swing.JTable tblDrivers;
    private javax.swing.JTable tblHospitals;
    private javax.swing.JTable tblPetVolunteerHealthCamp;
    private javax.swing.JTextField txtPetUsername;
    private javax.swing.JTextField txtdriver;
    private javax.swing.JTextField txthospitalname;
    private javax.swing.JTextField txtorgname;
    private javax.swing.JTextField txtpetowner;
    private javax.swing.JTextField txtpettype;
    // End of variables declaration//GEN-END:variables

    private void populateHospitalTable() {
        DefaultTableModel tablemodel = (DefaultTableModel) tblHospitals.getModel();
        tablemodel.setRowCount(0);

        for (Hospital hospital : system.getHospitalDirectory().getHospitalDirectory()) {
            Object[] row = new Object[1];
            row[0] = hospital;
            tablemodel.addRow(row);
        }
    }

    private void populateDriverTable() {
        DefaultTableModel tablemodel = (DefaultTableModel) tblDrivers.getModel();
        tablemodel.setRowCount(0);

        for (Driver driver : system.getDriverDirectory().getDriverDirectory()) {
            Object[] row = new Object[1];
            row[0] = driver;
            tablemodel.addRow(row);
        }
    }

    private boolean validateInputFields() {

        Pattern p = Pattern.compile("^[A-Za-z0-9 ]+$");
        Matcher m = p.matcher(txthospitalname.getText());
        Pattern p7 = Pattern.compile("^[A-Za-z0-9]{3,14}+$");
        Matcher m7 = p7.matcher(txtdriver.getText());
//        Pattern p1 = Pattern.compile("^[A-Za-z0-9]{5,20}+$");
//        Matcher m1 = p1.matcher(txtPassword.getText());

// Matcher m1 = p1.matcher(manuyeartxt.getText());
// Pattern p2 = Pattern.compile("[0-9]");
// Matcher m2 = p2.matcher(serialnumtxt.getText());
// Pattern p3 = Pattern.compile("[0-9]");
// Matcher m3 = p4.matcher(citytxt.getText());
        if (!m.matches()) {

            JOptionPane.showMessageDialog(this, "Please enter correct input format for hospital");
            return false;
        } else if (!m7.matches()) {

            JOptionPane.showMessageDialog(this, "Please enter correct input format for driver ");
            return false;
        }
//        } else if (!m1.matches()) {
//
//            JOptionPane.showMessageDialog(this, "Please enter correct input format for password");
//            return false;
//        
        else {
            return true;
        }
    }
}       

