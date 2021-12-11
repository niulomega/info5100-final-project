/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReliefSystem.FundRaising;

import java.util.ArrayList;

/**
 *
 * @author niulp
 */
public class FundRaisingDirectory {
    private ArrayList<FundRaising> fundRaisingDirectory;
    private FundRaising fundRaising;
    
    public ArrayList<FundRaising> getFundRaisingDirectory() {
        return fundRaisingDirectory;
    }

    public void setFundRaisingDirectory(ArrayList<FundRaising> fundRaisingDirectory) {
        this.fundRaisingDirectory = fundRaisingDirectory;
    }
    
    
    public FundRaising createUserAccount(String username) {
        fundRaising = new FundRaising(username);
        fundRaisingDirectory.add(fundRaising);
        return fundRaising;
    }
}
