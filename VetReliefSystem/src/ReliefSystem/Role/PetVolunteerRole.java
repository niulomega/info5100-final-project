/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReliefSystem.Role;

import ReliefSystem.Ecosystem;
//import UserInterface.PetVolunteer.PetVolunteer;
import ReliefSystem.UserAccount.UserAccount;
import UserInterface.HospiitalAdmin.HospitalAdminWorkArea;
import javax.swing.JPanel;
import UserInterface.PetVolunteer.PetVolunteer;

/**
 *
 * @author niulp
 */
public class PetVolunteerRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Ecosystem system) {
//        return new PetVolunteer(userProcessContainer, account, system);
          return new PetVolunteer(userProcessContainer, account, system);
    }
}
