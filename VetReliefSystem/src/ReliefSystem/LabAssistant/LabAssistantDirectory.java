/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReliefSystem.LabAssistant;

//import ReliefSystem.Hospital.Hospital;
import java.util.ArrayList;

/**
 *
 * @author niulp
 */
public class LabAssistantDirectory {
    private ArrayList<LabAssistant> labAssistantDirectory;
    private LabAssistant labAssistant;

    public LabAssistantDirectory() {
        labAssistantDirectory = new ArrayList<LabAssistant>();
    }
    
    public ArrayList<LabAssistant> getHospitalDirectory() {
        return labAssistantDirectory;
    }

    public void setLabAssistantDirectory(ArrayList<LabAssistant> LabAssistantDirectory) {
        this.labAssistantDirectory = labAssistantDirectory;
    }


    public LabAssistant getLabAssistant() {
        return labAssistant;
    }

    public void setLabAssistant(LabAssistant labAssistant) {
        this.labAssistant = labAssistant;
    }

    public LabAssistant createUserAccount(String username) {
        labAssistant = new LabAssistant(username);
        labAssistantDirectory.add(labAssistant);
        return labAssistant;
    }

    public void updateLabAssistantInfo(LabAssistant labAssistant, String name) {
        labAssistant.setName(name);
    }

    public void deleteLabAssistant(String username) {
        for (int i = 0; i < labAssistantDirectory.size(); i++) {
            if (labAssistantDirectory.get(i).getUsername() == username) {
                labAssistantDirectory.remove(i);
            }
        }

    }
}
