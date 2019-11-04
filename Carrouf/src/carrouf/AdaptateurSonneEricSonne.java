/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrouf;

/**
 *
 * @author midia
 */
public class AdaptateurSonneEricSonne implements IChargeable {
    PortableSonneEricSonne tel;
    
    public AdaptateurSonneEricSonne() {
        this.tel = new PortableSonneEricSonne();
    }
    
    @Override
    public void recharger(int volts) {
        this.tel.ChargerBatteries(volts);
    }
}
