/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReliefSystem.FundRaising;

/**
 *
 * @author niulp
 */
public class FundRaising {
    private String username;
    private String name;

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public FundRaising(String username) {
        this.username = username;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
}
