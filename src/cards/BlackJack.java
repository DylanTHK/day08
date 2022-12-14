package cards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        // 1. generate random value for Computer, 15 - 21 (Value to beat)
        Random rand = new Random();
        Integer computerLimit = 7;
        Integer computerValue = 15 + (rand.nextInt(computerLimit)); // generates value from 15 to 21
        System.out.printf("Computer's value this round: %s\n", computerValue);

        Integer playerValue = 0;
        List<String> playerHand = new ArrayList<String>();
        Integer cardsLimit = 13; // for randomising player's card
        List<String> availableCards = Arrays.asList("A","2","3","4","5","6","7","8","9","10","J","Q","K"); // available cards
        // generate starting hand
        Integer card1 = rand.nextInt(cardsLimit);
        System.out.println(card1);


        // 2. User commands
        Scanner scan = new Scanner(System.in);
        System.out.println("Select a command (Draw / Stop): ");
        // String userInput = scan.nextLine();
        // System.out.println(userInput);

        //     - Draw (Max 5 cards in hand)
        //     - Stop
        // 3. Calculate value of cards in hand
    
        // 4. compare value with computer (Draw, Win, Lose)
    
        // 5. Play Again? 
        //     - Yes: resets computer value, resets hand
        //     - No: ends program
    }
}