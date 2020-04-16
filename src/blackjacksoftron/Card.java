/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjacksoftron;

import java.util.ArrayList;
import java.util.Random;

/**
 * A class that models playing card Objects. Cards have 
 * a value (note that Ace = 1, Jack -11, Queen =12, King = 13)
 * A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers.
 * This code is to be used in ICE1. When you create your own branch,
 * add your name as a modifier.
 * @author srinivsi
 * @modifier Joshua Mulani
 * Student ID - 991553342
 */
public class Card {

   private String suit; //clubs, spades, diamonds, hearts
   private String  value;//1-13
   
   Random random = new Random();
   
   public static final String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
    public static final String [] VALUE = {"ACE","TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN","JACK","QUEEN","KING"};
   
   
    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(String value) {
        this.value = value;
    }
    

    
    public int randomValue() {
         int rndValue = random.nextInt(12)+1;
         return rndValue;
    }
    
    public int randomSuit() {
         int rndSuit = random.nextInt(4);
         return rndSuit;
    }
}