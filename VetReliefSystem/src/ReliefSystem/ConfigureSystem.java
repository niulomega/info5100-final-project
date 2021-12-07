/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReliefSystem;

/**
 *
 * @author niulp
 */
public class ConfigureSystem {
    
    public static Ecosystem configure(){
        
        Ecosystem system = Ecosystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("Sysadmin","sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        return system;
    }
    
}
