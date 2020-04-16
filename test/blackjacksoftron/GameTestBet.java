package blackjacksoftron;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mulan
 */
public class GameTestBet {
    
    public GameTestBet() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }


  
    @Test
    public void checkPlayerBetGood() {
        int betAmount = 20;
        boolean expResult = true;
        boolean result = Game.checkUserBetAmount(betAmount);
        assertEquals(expResult, result);
    }


    @Test
    public void checkPlayerBetBad() {
        int betAmount = 101;
        boolean expResult = false;
        boolean result = Game.checkUserBetAmount(betAmount);
        assertEquals(expResult, result);
    }


    @Test
    public void testChecknumberOfPlayer() {
        int betAmount = 19;
        boolean expResult = false;
        boolean result = Game.checkUserBetAmount(betAmount);
        assertEquals(expResult, result);
    }

    
}