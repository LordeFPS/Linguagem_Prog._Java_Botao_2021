/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.awt.Frame;

/**
 *
 * @author 69146
 */
public class Agenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Menu menu = new Menu();
        menu.setVisible(true);
        menu.setExtendedState(Frame.MAXIMIZED_BOTH);
    }
    
}
