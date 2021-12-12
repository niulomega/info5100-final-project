/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.HealthCamp;

import ReliefSystem.Ecosystem;
import ReliefSystem.Hospital.Hospital;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 18578
 */
public class ManageHealthCampHospital extends javax.swing.JPanel {

    /**
     * Creates new form ManageHealthCampHospital
     */
    JPanel userProcessContainer;
    Ecosystem system;
    public ManageHealthCampHospital(JPanel userProcessContainer,Ecosystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;  
//        populateHospital();
    }
        
    public void populateHospital() {
        
        DefaultTableModel tablemodel = (DefaultTableModel) tblHospital.getModel();
        tablemodel.setRowCount(0);
       
        for(Hospital hospital: system.getHospitalDirectory().getHospitalDirectory()) {
            Object[] row = new Object[2];
            row[0] = hospital;
            row[1] = hospital.getName();
//            row[2] = hospital.();

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
        tblHospital = new javax.swing.JTable();
        btnselect = new javax.swing.JButton();

        tblHospital.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Hospital Name", "Driver"
            }
        ));
        jScrollPane1.setViewportView(tblHospital);

        btnselect.setText("Select Hospital");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(btnselect)))
                .addContainerGap(197, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(btnselect)
                .addContainerGap(122, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnselect;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblHospital;
    // End of variables declaration//GEN-END:variables
}
