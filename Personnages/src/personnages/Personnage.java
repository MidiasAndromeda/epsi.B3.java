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
public abstract class Personnage {
    protected ICombat combat;
    
    public Personnage() {
        this.combat = new CombatALaHache();
    }
    
    public void batsToi() {
        this.combat.executeToi();
    }
}
