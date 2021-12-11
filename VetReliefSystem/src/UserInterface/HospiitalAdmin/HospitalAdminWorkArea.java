/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.HospiitalAdmin;

import ReliefSystem.Ecosystem;
import ReliefSystem.UserAccount.UserAccount;
import UserInterface.SystemAdminWorkArea.ManagePetVolunteer;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author 18578
 */
public class HospitalAdminWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form HospitalAdminWorkArea
     */
    JPanel userProcessContainer;
    Ecosystem system;
    private UserAccount account;
    public HospitalAdminWorkArea(JPanel userProcessContainer,UserAccount account, Ecosystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.account = account;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        sidepane = new javax.swing.JPanel();
        ManageVet = new javax.swing.JPanel();
        lblManageVet = new javax.swing.JLabel();
        ManageLabAssitant = new javax.swing.JPanel();
        lblManageLabAssistant = new javax.swing.JLabel();
        ManageDriver = new javax.swing.JPanel();
        lblManageDriver = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblManagePharmacy = new javax.swing.JLabel();
        ManageHospitalInfo = new javax.swing.JPanel();
        lblmanagehospitalinfo = new javax.swing.JLabel();
        ManagePet = new javax.swing.JPanel();
        lblmanagepet = new javax.swing.JLabel();

        sidepane.setBackground(new java.awt.Color(0, 153, 153));
        sidepane.setForeground(new java.awt.Color(0, 153, 153));
        sidepane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ManageVet.setBackground(new java.awt.Color(0, 255, 255));
        ManageVet.setForeground(new java.awt.Color(0, 153, 153));

        lblManageVet.setText("Manage Vet");
        lblManageVet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblManageVetMousePressed(evt);
            }
        });

        javax.swing.GroupLayout ManageVetLayout = new javax.swing.GroupLayout(ManageVet);
        ManageVet.setLayout(ManageVetLayout);
        ManageVetLayout.setHorizontalGroup(
            ManageVetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageVetLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(lblManageVet, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
        );
        ManageVetLayout.setVerticalGroup(
            ManageVetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ManageVetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblManageVet, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        sidepane.add(ManageVet, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 290, 50));

        ManageLabAssitant.setBackground(new java.awt.Color(0, 255, 255));

        lblManageLabAssistant.setText("Manage LabAssitant");
        lblManageLabAssistant.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblManageLabAssistantMousePressed(evt);
            }
        });

        javax.swing.GroupLayout ManageLabAssitantLayout = new javax.swing.GroupLayout(ManageLabAssitant);
        ManageLabAssitant.setLayout(ManageLabAssitantLayout);
        ManageLabAssitantLayout.setHorizontalGroup(
            ManageLabAssitantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageLabAssitantLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(lblManageLabAssistant, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );
        ManageLabAssitantLayout.setVerticalGroup(
            ManageLabAssitantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ManageLabAssitantLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblManageLabAssistant, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        sidepane.add(ManageLabAssitant, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 290, 50));

        ManageDriver.setBackground(new java.awt.Color(0, 255, 255));

        lblManageDriver.setText("Manage Driver");
        lblManageDriver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblManageDriverMousePressed(evt);
            }
        });

        javax.swing.GroupLayout ManageDriverLayout = new javax.swing.GroupLayout(ManageDriver);
        ManageDriver.setLayout(ManageDriverLayout);
        ManageDriverLayout.setHorizontalGroup(
            ManageDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageDriverLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(lblManageDriver, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );
        ManageDriverLayout.setVerticalGroup(
            ManageDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageDriverLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblManageDriver, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        sidepane.add(ManageDriver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 290, 50));

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        lblManagePharmacy.setText("Manage Pharmacy");
        lblManagePharmacy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblManagePharmacyMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(lblManagePharmacy)
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblManagePharmacy, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        sidepane.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 290, 50));

        ManageHospitalInfo.setBackground(new java.awt.Color(0, 255, 255));

        lblmanagehospitalinfo.setBackground(new java.awt.Color(0, 255, 255));
        lblmanagehospitalinfo.setText("Manage Hospital Info");
        lblmanagehospitalinfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblmanagehospitalinfoMousePressed(evt);
            }
        });

        javax.swing.GroupLayout ManageHospitalInfoLayout = new javax.swing.GroupLayout(ManageHospitalInfo);
        ManageHospitalInfo.setLayout(ManageHospitalInfoLayout);
        ManageHospitalInfoLayout.setHorizontalGroup(
            ManageHospitalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageHospitalInfoLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(lblmanagehospitalinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );
        ManageHospitalInfoLayout.setVerticalGroup(
            ManageHospitalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageHospitalInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblmanagehospitalinfo, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        sidepane.add(ManageHospitalInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 290, 50));

        ManagePet.setBackground(new java.awt.Color(0, 255, 255));

        lblmanagepet.setText("Manage Pet ");
        lblmanagepet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblmanagepetMousePressed(evt);
            }
        });

        javax.swing.GroupLayout ManagePetLayout = new javax.swing.GroupLayout(ManagePet);
        ManagePet.setLayout(ManagePetLayout);
        ManagePetLayout.setHorizontalGroup(
            ManagePetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManagePetLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(lblmanagepet, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        ManagePetLayout.setVerticalGroup(
            ManagePetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManagePetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblmanagepet, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        sidepane.add(ManagePet, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 290, 50));

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addComponent(sidepane, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 540, Short.MAX_VALUE))
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidepane, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblManageVetMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManageVetMousePressed
        // TODO add your handling code here:
        ManageVet manageVetJPanel = new ManageVet(userProcessContainer, system);
        userProcessContainer.add("ManageVet", manageVetJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_lblManageVetMousePressed

    private void lblManageLabAssistantMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManageLabAssistantMousePressed
        // TODO add your handling code here:
        ManageLabAssistant manageLabAssistantJPanel = new ManageLabAssistant(userProcessContainer, system);
        userProcessContainer.add("ManageLabAssistant", manageLabAssistantJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_lblManageLabAssistantMousePressed

    private void lblManageDriverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManageDriverMousePressed
        // TODO add your handling code here:
        ManageDriver manageDriverJPanel = new ManageDriver(userProcessContainer, system);
        userProcessContainer.add("ManageDriver", manageDriverJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_lblManageDriverMousePressed

    private void lblManagePharmacyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManagePharmacyMousePressed
        // TODO add your handling code here:
        ManagePharmacy managePharmacyJPanel = new ManagePharmacy(userProcessContainer, system);
        userProcessContainer.add("ManageDriver", managePharmacyJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_lblManagePharmacyMousePressed

    private void lblmanagehospitalinfoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblmanagehospitalinfoMousePressed
        // TODO add your handling code here:
        ManageHospitalInfo manageHospitalInfoJPanel = new ManageHospitalInfo(userProcessContainer,account, system);
        userProcessContainer.add("ManageHospitalInfo", manageHospitalInfoJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_lblmanagehospitalinfoMousePressed

    private void lblmanagepetMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblmanagepetMousePressed
        // TODO add your handling code here:
        
        ManagePetInfo managePetInfoJPanel = new ManagePetInfo(userProcessContainer,account, system);
        userProcessContainer.add("ManagePetInfo", managePetInfoJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_lblmanagepetMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ManageDriver;
    private javax.swing.JPanel ManageHospitalInfo;
    private javax.swing.JPanel ManageLabAssitant;
    private javax.swing.JPanel ManagePet;
    private javax.swing.JPanel ManageVet;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblManageDriver;
    private javax.swing.JLabel lblManageLabAssistant;
    private javax.swing.JLabel lblManagePharmacy;
    private javax.swing.JLabel lblManageVet;
    private javax.swing.JLabel lblmanagehospitalinfo;
    private javax.swing.JLabel lblmanagepet;
    private javax.swing.JPanel sidepane;
    // End of variables declaration//GEN-END:variables
}
