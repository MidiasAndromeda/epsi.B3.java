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
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Chargeur chargeur = new Chargeur();
        AdaptateurSonneEricSonne telSonneEricSonne = new AdaptateurSonneEricSonne();
        chargeur.brancherPortable(telSonneEricSonne);
        AdaptateurSamSaoule telSamSaoule = new AdaptateurSamSaoule();
        chargeur.brancherPortable(telSamSaoule);
    }
    
}
