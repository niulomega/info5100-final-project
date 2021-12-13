/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReliefSystem.Role;

import ReliefSystem.Ecosystem;
import ReliefSystem.UserAccount.UserAccount;
import UserInterface.Driver.DriverWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author niulp
 */
public class DriverRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Ecosystem system) {
        return new DriverWorkArea(userProcessContainer, account, system);
    }
}
