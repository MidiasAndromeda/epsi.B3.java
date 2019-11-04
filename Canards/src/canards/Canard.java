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
public abstract class Canard {
    private Vol maFaconDeVoler;
    
    public Canard() {
        this.maFaconDeVoler = null;
    }
    public void faisCoinCoin() {
        System.out.println("Coin Coin.");
    }
    
    public void nage() {
        System.out.println("Je nage.");
    }
    
    public void afficheToi() {
        System.out.println("");
    }
    
    public void setMaFaconDeVoler(Vol v) {
        this.maFaconDeVoler = v;
    }
    
    public void envoleToi() {
        this.maFaconDeVoler.vole();
    }
}
