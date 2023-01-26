package exercise1;
import java.util.Scanner;

/**
 * @author Jayesh Malhotra 24 Jan 2023 
 */

public class CardTrick 
{    
    public static void main(String[] args) 
    {    
        Card[] hand = new Card[7];

        for(int i = 0; i < hand.length; i++) 
        {
            Card card = new Card();
            card.setValue((int)(Math.random()*14));
            card.setSuit(Card.SUITS[(int)(Math.random()*14)]);
            hand[i] = card;
        }
        
        Scanner input = new Scanner(System.in);
        int val;
        String sui;  
        System.out.print("Enter Card Value and Suit with a gap : "); 
        val = input.nextInt();
        sui = input.nextLine();
        
        for(int j = 0; j < hand.length; j++)
                {
                    if(hand[j].getValue() == val && hand[j].getSuit() == sui)
                    {
                        printInfo();
                    }
                }  
    }

    /**
     * @author Jayesh Malhotra 24 Jan 2023 
     */
    private static void printInfo() 
    {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Paul, but you can call me prof, Paul or sir");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
    }

}
