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
public class CanardEnBois extends Canard {
    public CanardEnBois() {
        this.setMaFaconDeVoler(new NoVol());
    }
    
    public void afficheToi() {
        System.out.println("Je suis un canard en bois.");
    }
}
