/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReliefSystem;

import ReliefSystem.Person.PersonDirectory;
import ReliefSystem.Role.Role;
import ReliefSystem.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author niulp
 */
public abstract class Organization {

    private String name;
    private PersonDirectory personDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter = 0;

    public enum Type {
        SysAdmin("SysAdmin"),
        HospitalAdmin("HospitalAdmin"),
        HealthCampOrganizer("HealthCampOrganizer"),
        HealthCampVolunteer("HealthCampVolunteer"),
        FundRaisingAgency("FundRaisingAgency"),
        Vet("Vet"),
        LabAssistant("LabAssistant"),
        PetVolunteer("PetVolunteer"),
        Driver("Driver"),
        Pharmacy("Pharmacy");

        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        personDirectory = new PersonDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public Organization() {

    }

    public abstract ArrayList<Role> getSupportedRole();

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
