/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReliefSystem.LabAssistant;

/**
 *
 * @author niulp
 */
public class LabAssistant {
    private String name;
    private String username;

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
    
    public LabAssistant(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
