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
public class CombatAuCouteau implements ICombat {
    @Override
    public void executeToi() {
        System.out.println("Combat au couteau.");
    }
}
