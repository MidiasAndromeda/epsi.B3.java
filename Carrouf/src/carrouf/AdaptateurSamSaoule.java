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
public class AdaptateurSamSaoule implements IChargeable {
    ProtableSamSaoule tel;
    
    public AdaptateurSamSaoule() {
        this.tel = new ProtableSamSaoule();
    }
    
    @Override
    public void recharger(int volts) {
        this.tel.ChargerPortable(volts);
    }
}
