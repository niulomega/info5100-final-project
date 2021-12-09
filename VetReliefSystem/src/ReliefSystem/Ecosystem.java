/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReliefSystem;

import ReliefSystem.Hospital.HospitalDirectory;
import ReliefSystem.Role.Role;
import ReliefSystem.Role.SystemAdminRole;
import ReliefSystem.Vet.VetDirectory;
import java.util.ArrayList;

/**
 *
 * @author niulp
 */
public class Ecosystem extends Organization{
    private static Ecosystem ReliefSystem;
    private HospitalDirectory hospitalDirectory;
    private VetDirectory vetDirectory;
    
    public Ecosystem(HospitalDirectory hospitalDirectory, VetDirectory vetDirectory) {
        this.hospitalDirectory = hospitalDirectory; 
    }
    public static Ecosystem getInstance() {
        if (ReliefSystem == null) {
            ReliefSystem = new Ecosystem();
        }
        return ReliefSystem;
    }
    
    public static void setInstance(Ecosystem system) {
        ReliefSystem = system;
    }
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    private Ecosystem() {
        super(null);
//         networkList=new ArrayList<Network>();
    }

    public boolean checkIfUserIsUnique(String userName) {
        //
        return false;
    }
    public HospitalDirectory getHospitalDirectory() {
        if (hospitalDirectory == null) {
            hospitalDirectory = new HospitalDirectory();
        }
        return hospitalDirectory;
    }
    
    public VetDirectory getVetDirectory() {
        if (vetDirectory == null) {
            vetDirectory = new VetDirectory();
        }
        return vetDirectory;
    }
}
