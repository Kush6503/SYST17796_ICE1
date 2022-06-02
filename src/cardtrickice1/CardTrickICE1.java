/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrickice1;
import java.util.*;

/** step1 : generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in  the array 'card is found '
 *
 * @author sivagamasrinivasan,May 23rd
 */
import static cardtrickice1.Card.VALUE;
import static cardtrickice1.Card.SUITS;

public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Card luckyCard = new Card("spades",5);//Added from github
        Card[] magicHand = new Card[7];
        String value;
        String suits;
        
        for( int i=0;i<magicHand.length;i++)
        {
            value = VALUE[(int)(Math.random()*13)];
            suits = SUITS[(int)(Math.random()*4)];
            magicHand[i] = new Card(value,suits);
            System.out.println(magicHand[i]);
        }
        System.out.println();
        //step 2:take input 
        
        System.out.println("Please choose the suit:");
        System.out.println(" 1: Diamond \n 2: Clubs \n 3: Spade \n 4: Heart");
        Scanner sc = new Scanner(System.in);
        int suit = sc.nextInt();
        
        System.out.println("Please choose the value(1-13):");
        int rank = sc.nextInt();
        Card c1 = new Card(VALUE[rank - 1],SUITS[suit - 1]);
        System.out.println(c1);
        
        String out = "Card not found";
        for(Card c2 : magicHand){
            if(c1.toString().equals(c2.toString())){
                out = "Card found";
                break;
            }
        }
        System.out.println(out);
        
        //step 3: match with array 
    }
    
}
