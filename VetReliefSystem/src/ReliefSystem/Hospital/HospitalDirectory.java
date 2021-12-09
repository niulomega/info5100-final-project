/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReliefSystem.Hospital;

import java.util.ArrayList;

/**
 *
 * @author niulp
 */
public class HospitalDirectory {

    private ArrayList<Hospital> hospitalDirectory;
    private Hospital hospital;

    public HospitalDirectory() {
        hospitalDirectory = new ArrayList<Hospital>();
    }
    
    public ArrayList<Hospital> getHospitalDirectory() {
        return hospitalDirectory;
    }

    public void setHospitalDirectory(ArrayList<Hospital> hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }


    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public Hospital createUserAccount(String username) {
        hospital = new Hospital(username);
        hospitalDirectory.add(hospital);
        return hospital;
    }

    public void updateHospitalInfo(Hospital hospital, String name, String phoneNumber, String address) {
        hospital.setName(name);
        hospital.setAddress(address);
        hospital.setNumber(phoneNumber);
    }

    public void deleteHospital(String username) {
        for (int i = 0; i < hospitalDirectory.size(); i++) {
            if (hospitalDirectory.get(i).getUsername() == username) {
                hospitalDirectory.remove(i);
            }
        }

    }
}
