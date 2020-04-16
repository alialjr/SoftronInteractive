
package blackjacksoftron;

import java.util.Scanner;

/**
 *
 * @author Ali, Joshua, Varun, Abdullah
 * 
 * 
 */
public class Game extends Operations{

    private int userNumber;
    private int userBet;
    
    public void start(){
        System.out.println("Please Enter the Number of Users (Max 4 Player)");    
        
        Scanner input = new Scanner(System.in); 
        userNumber = input.nextInt();
        
        if (!checknumberOfPlayer(userNumber)){
        System.out.println("Only 4 players maximum can play");
        System.out.println("Please Enter the Number of Users");
         userNumber = input.nextInt();
        }
              
            input.nextLine();
            User[] userList= new User[userNumber];

         
          for(int i=0; i<userNumber; i++) {
           System.out.println("Please Enter the Name of Users / 3 - 16 Characters "); 
           System.out.println("Please Enter the Name of User " + (i+1));
             String userName = input.nextLine();
             
           while (!checkNameLength(userName)){
        System.out.println("The user name must be 3-16 characters");
        userName = input.nextLine();
        }
           userList[i]=new User(userName, 500);
          }
           
          for(int i=0; i<userNumber; i++) {
           System.out.println(userList[i].getName() + " balance: $500 \nHow much will they bet?\n\n");
           int userBet = input.nextInt();
           
           if(!checkUserBetAmount(userBet)) {
               System.out.println("Can only bet between the range of $20 - $100\n");
               userBet = input.nextInt();
           }
          
             userList[i].setMoney(userList[i].getMoney()-userBet);
              System.out.println("\n " + userList[i].getName() + "has a balance of: $" + userList[i].getMoney());
         }  
          
     for(int j=0;j<userList.length;j++)
        {
          System.out.println(userList[j].getName() +" has " +  userList[j].getMoney()+ " CAD");
        }
     
        System.out.println("The hand of the Dealer is ");
     
      Card[] dealerHand = new Card[2];
     
            
            for (int i=0; i<dealerHand.length; i++) {
                Card d = new Card();

                d.setValue(Card.VALUE[d.randomValue()] );
                d.setSuit(Card.SUITS[d.randomSuit()] );   

                dealerHand[i]=d;
            }
            
              System.out.println(dealerHand [0].getValue() + " of " + dealerHand [0].getSuit());
              System.out.println("Dealers Second Card is face down ");
              
    
      for(int k=0; k<userNumber; k++) {
           System.out.println("The hand of  " + userList[k].getName()+ "  is");
       Card[] magicHand = new Card[2];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
            c.setValue(Card.VALUE[c.randomValue()] );
            c.setSuit(Card.SUITS[c.randomSuit()] );   
            
            magicHand[i]=c;
            
        
            System.out.println(magicHand[i].getValue() + " of " + magicHand[i].getSuit());
        }
   
        
       
            
          
        }          
}   
    
    public void generateUser() {
        
    }

    public int getUserNumber() {
        return userNumber;
        }

    public void setUserNumber(int userNumber) {
        this.userNumber = userNumber;
        }
    
    public static boolean checknumberOfPlayer(int userNumber) {
        if(userNumber>0 && userNumber<=4){
    return true;
    }
    return false;
}
        
    public static boolean checkNameLength(String userName) { 
        if(userName.length()>=3 && userName.length()<=16){
    return true;
    }
        return false;
    }
    
   public static boolean checkUserBetAmount(int userBet) {
       if(userBet>=20 && userBet<=100 ) {
       return true;
     }  return false;
   }
    
}