/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReliefSystem.Sponsor;

import java.util.ArrayList;

/**
 *
 * @author niulp
 */
public class SponsorDirectory {
    private ArrayList<Sponsor> sponsorDirectory;
    private Sponsor sponsor;
    
    
    public SponsorDirectory() {
        sponsorDirectory = new ArrayList<Sponsor>();
    }
    
    public Sponsor createUserAccount(String username) {
        sponsor = new Sponsor(username);
        sponsorDirectory.add(sponsor);
        return sponsor;
    }
    
    public void deleteSponsor(String username) {
        for (int i = 0; i < sponsorDirectory.size(); i++) {
            if (sponsorDirectory.get(i).getUsername() == username) {
                sponsorDirectory.remove(i);
            }
        }
    }
}
