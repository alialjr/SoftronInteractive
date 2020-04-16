package blackjacksoftron;



/**
 *
 * @author Ali
 */



import java.util.Random;

/**
 *
 * @author Ali
 */
public class Operations {

    int rndSuit;
    int rndValue;
Random random = new Random();


    public int generateSuit() {
         rndSuit = (int) Math.floor(random.nextInt(3));
        return rndSuit;
    }

    public int generateValue() {
         rndValue = (int) Math.floor(random.nextInt(12));
        return rndValue;
    }
    
public void Stay(){};
public void Surrender(){};
public void DoubleDown(){};
    
}