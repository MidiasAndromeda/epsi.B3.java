/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canards;

/**
 *
 * @author midia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Canard morillon = new Morillon();
        Canard colvert = new Colvert();
        Canard canardEnBois = new CanardEnBois();
        
        morillon.afficheToi();
        colvert.afficheToi();
        canardEnBois.afficheToi();
        
        morillon.envoleToi();
        colvert.envoleToi();
        canardEnBois.envoleToi();
    }    
}
