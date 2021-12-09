/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReliefSystem.Vet;

import java.util.ArrayList;

/**
 *
 * @author niulp
 */
public class VetDirectory {

    private ArrayList<Vet> vetDirectory;
    private Vet vet;

    public VetDirectory() {
        vetDirectory = new ArrayList<Vet>();
    }

    public ArrayList<Vet> getVetDirectory() {
        return vetDirectory;
    }

    public void setVetDirectory(ArrayList<Vet> vetDirectory) {
        this.vetDirectory = vetDirectory;
    }

    public Vet getVet() {
        return vet;
    }

    public void setVet(Vet vet) {
        this.vet = vet;
    }

    public Vet createUserAccount(String username) {
        vet = new Vet(username);
        vetDirectory.add(vet);
        return vet;
    }

    public void updateVetlInfo(Vet vet, String name) {
        vet.setName(name);
//        vet.setNumber(phoneNumber);
    }

    public void deleteVet(String username) {
        for (int i = 0; i < vetDirectory.size(); i++) {
            if (vetDirectory.get(i).getUsername() == username) {
                vetDirectory.remove(i);
            }
        }

    }
}
