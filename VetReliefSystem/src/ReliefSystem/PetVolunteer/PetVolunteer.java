/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReliefSystem.PetVolunteer;

/**
 *
 * @author niulp
 */
public class PetVolunteer {

    private String name;
    private String username;
    private String petType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public PetVolunteer(String username) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
