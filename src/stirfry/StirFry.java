package stirfry;

import java.util.ArrayList;

/**
 * This class +++ Insert Description here +++
 *
 * @author Haki
 */
public class StirFry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Vegetable> veggies = new ArrayList<Vegetable>();

        Vegetable v1 = new Carrot();
        Vegetable v2 = new GreenPepper();
        Vegetable v3 = new Onions();
        
        veggies.add(v1);
        veggies.add(v2);
        veggies.add(v3);
        
        
        boolean tasteGood = true;
        
        for(Vegetable vegetable: veggies) {
            if(!vegetable.isTasty()) {
                tasteGood = false;
                break;
            }
           // System.err.println("printing the value ???? " + tasteGood);
        }
        
        System.out.println("Does the stirfy taste good ? " + tasteGood);
    }

}
