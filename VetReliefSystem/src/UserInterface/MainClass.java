/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

/**
 *
 * @author divya
 */
public class MainClass {
    
    public static void main(String[] args) {
        StartScreen screen = new StartScreen();
        SysAdmin sign = new SysAdmin();
        screen.setVisible(true);
        try {
            for (int row = 0; row <=100; row++) {
                Thread.sleep(10);
                screen.loadingNumber.setText(Integer.toString(row)+"%");
                screen.loadingprogressBar.setValue(row);
                if (row == 100) {
                    
                    screen.setVisible(false);
                    sign.setVisible(true);
                }
            }
        } catch (Exception e) {
        }
    }
}
