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
public class Morillon extends Canard {
    public Morillon() {
        this.setMaFaconDeVoler(new VolAvecAiles());
    }
    
    @Override
    public void afficheToi() {
        System.out.println("Je suis un Morillon.");
    }
}
