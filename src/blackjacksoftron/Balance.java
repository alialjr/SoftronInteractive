/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjacksoftron;

/**
 *
 * @author Ali
 */
public class Balance {
    
    /*
    Balance class allows the User to bet their balance.
    Minimum amount one can bet is above 20 and the maximum being 100
    */
    public Balance() {
        
    }
    
     public static boolean betRange(int bet)
    
    {
        
        if(bet>20 && bet<=100){
    return true;
    
    
    }
        
    return false;
        
}

 public int addToBalance(int x) {
     return x;
    }
 public void betFromBalance(User u, int x) {
    u.setMoney(u.getMoney()-x);
    }
 
 
}