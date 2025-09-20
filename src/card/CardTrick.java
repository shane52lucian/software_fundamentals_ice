/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
import java.util.Scanner;
import java.util.Random;


/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * @modifier Sabestian Lucian - 991726319 - https://github.com/shane52lucian/software_fundamentals_ice.git
 */
public class CardTrick {
    
    private static Random rnd = new Random();
    private static final Scanner scn = new Scanner(System.in);

    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue(rnd.nextInt(13) + 1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[rnd.nextInt(Card.SUITS.length)]);
            
            magicHand[i] = c;
        }
        
        System.out.println("Hello to the game, pick a card.");
        System.out.println("Choose number 1-13: ace=1, jack=11, queen=12, king=13");
        System.out.println("Then choose a suit: Hearts, Clubs, Diamonds, Spades.\n");
        System.out.print("Pick number: ");
        int selectedNumber = scn.nextInt();
        System.out.print("Pick suit: ");
        scn.nextLine();
        String selectedSuit = scn.nextLine();
        
        Card uc = new Card();
        uc.setValue(selectedNumber);
        uc.setSuit(selectedSuit);

        Card luckyCard = new Card();
        luckyCard.setValue(6);
        luckyCard.setSuit("Hearts");
        
        for (int j = 0; j < magicHand.length; j++){
            if(uc.getValue() == magicHand[j].getValue()){
                if (uc.getSuit().equals(magicHand[j].getSuit())){
                    System.out.println("Your Card was found.");
                    return;
                }
            }
            
        }
        System.out.println("Your Card was not found.");
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        // add one luckcard hard code 2,clubs
    }
    
}
