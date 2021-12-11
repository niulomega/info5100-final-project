/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReliefSystem.Role;

import ReliefSystem.Ecosystem;
import ReliefSystem.UserAccount.UserAccount;
import UserInterface.HealthCamp.MainPageOrganiser;
import javax.swing.JPanel;
import ReliefSystem.PetVolunteer.PetVolunteerDirectory;

/**
 *
 * @author niulp
 */
public class HealthCampRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Ecosystem system) {
        return new MainPageOrganiser(userProcessContainer, account, system);
    }
}
