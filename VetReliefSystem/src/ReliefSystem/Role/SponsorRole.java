/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReliefSystem.Role;

import ReliefSystem.Ecosystem;
import ReliefSystem.UserAccount.UserAccount;
import UserInterface.Sponsor.SponsorWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author niulp
 */
public class SponsorRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Ecosystem system) {
        return new SponsorWorkArea(userProcessContainer, account, system);
    }
}
