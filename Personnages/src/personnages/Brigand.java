/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnages;

/**
 *
 * @author midia
 */
public class Brigand extends Personnage {
    public Brigand() {
        this.combat = new CombatAuCouteau();
    }
}
