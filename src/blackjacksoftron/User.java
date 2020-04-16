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
public class User extends Operations{
    
    
    private String userName;
    private int money;


    public User(String givenName,int n)
    {
        userName=givenName;
        money = n;
    }
 
    public String getName() {
        return userName;
    }

 
    public void setName(String givenName) {
        userName = givenName;
    }

    public int getMoney() {
        return money;
    }

 
    public void setMoney(int money) {
        this.money = money;
    }

    
}
    
    

