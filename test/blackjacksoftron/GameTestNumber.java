package blackjacksoftron;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import blackjacksoftron.Game;
import blackjacksoftron.Game;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author abdulla Ghazalah
 */
public class GameTestNumber {
    
    public GameTestNumber() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test 
    public void checknumberOfPlayerGood(){
        int numOfPlayers = 4;
        boolean expResult = true;
        boolean result = Game.checknumberOfPlayer(numOfPlayers);
        assertEquals(expResult, result);
        
        
        
    }
    
    @Test 
    public void checknumberOfPlayerBad(){
        int numOfPlayers = 5;
        boolean expResult = false;
        boolean result = Game.checknumberOfPlayer(numOfPlayers);
        assertEquals(expResult, result);
        

        
    }
    
    @Test 
    public void checknumberOfPlayerBoundry(){
        int numOfPlayers = 0;
        boolean expResult = false;
        boolean result = Game.checknumberOfPlayer(numOfPlayers);
        assertEquals(expResult, result);
        
        
        
    }
}
