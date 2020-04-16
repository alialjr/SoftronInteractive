/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjacksoftron;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author varun
 */
public class GameTestName {
    
    public GameTestName() {
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

    /**
     * Test of start method, of class Game.
     */
    @Test
    public void checkUserNameLengthGood(){
        String userName="varunreddynell";
        boolean expResult=true;
        boolean result = Game.checkNameLength(userName);
        assertEquals(expResult, result); 
        
    }
    @Test
    public void checkUserNameLengthBad(){
        String userName="va";
        boolean expResult=false;
        boolean result = Game.checkNameLength(userName);
        assertEquals(expResult, result); 
    }
    @Test
    public void checkUserNameLengthBoundary(){
        String userName= " ";
        boolean expResult=false;
        boolean result = Game.checkNameLength(userName);
        assertEquals(expResult, result); 
    }
}
