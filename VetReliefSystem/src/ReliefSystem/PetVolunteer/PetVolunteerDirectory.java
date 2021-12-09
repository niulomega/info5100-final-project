/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReliefSystem.PetVolunteer;

import java.util.ArrayList;

/**
 *
 * @author niulp
 */
public class PetVolunteerDirectory {
    private ArrayList<PetVolunteer> petVolunteerDirectory;
    private PetVolunteer petVolunteer;

    public PetVolunteerDirectory() {
        petVolunteerDirectory = new ArrayList<PetVolunteer>();
    }
    
    public ArrayList<PetVolunteer> getPetVolunteerDirectory() {
        return petVolunteerDirectory;
    }

    public void setPetVolunteerDirectory(ArrayList<PetVolunteer> petVolunteerDirectory) {
        this.petVolunteerDirectory = petVolunteerDirectory;
    }


    public PetVolunteer getPetVolunteer() {
        return petVolunteer;
    }

    public void setPetVolunteer(PetVolunteer petVolunteer) {
        this.petVolunteer = petVolunteer;
    }

    public PetVolunteer createUserAccount(String username) {
        petVolunteer = new PetVolunteer(username);
        petVolunteerDirectory.add(petVolunteer);
        return petVolunteer;
    }

    public void updatePetVolunteerInfo(PetVolunteer petVolunteer, String name, String petType) {
        petVolunteer.setName(name);
        petVolunteer.setPetType(petType);
    }

    public void deletePetVolunteer(String username) {
        for (int i = 0; i < petVolunteerDirectory.size(); i++) {
            if (petVolunteerDirectory.get(i).getUsername() == username) {
                petVolunteerDirectory.remove(i);
            }
        }

    }
}
