package personnages;

/**
 *
 * @author midia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Personnage chevalier = new Chevalier();
        chevalier.batsToi();
        Personnage troll = new Troll();
        troll.batsToi();
        Personnage brigand = new Brigand();
        brigand.batsToi();
    }    
}
