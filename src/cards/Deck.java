package cards;

import java.security.SecureRandom;
import java.util.*;

// create an array of cards
public class Deck {

    // define array of suits (spade, club heart, diamond)
    private String[] SUITS = {"spade", "club", "heart", "diamond"};
    // define card names
    private String[] NAMES = {
        "Ace", "Two", "Three", 
        "Four", "Five", "Six", 
        "Seven", "Eight", "Nine", 
        "Ten", "Jack", "Queen", "King"
    };
    // define card values
    private Integer[] VALUES = {
        1, 2, 3, 
        4, 5, 6, 
        7, 8, 9, 
        10, 10, 10, 10
    };

    // array to store cards in deck (52 cards)
    private List<Card> allCards = new LinkedList<>(); // more efficient for adding / removing

    // Constructor for deck
    public Deck() {
        this.allCards = generateDeck();
    }

    public Integer getSize() {
        return allCards.size();
    }

    // take method (take one card from top)
    public void take() {
        Card yourCard = allCards.get(0);
        // print card
        System.out.printf("Your card is: %s of %s\n", yourCard.getName(), yourCard.getSuit());
        // take first value (remove)
        allCards.remove(0);
    }

    // method to generate a deck
    public List<Card> generateDeck() {
        List<Card> cards = new ArrayList<Card>(); // creates List of card objects
        for (String suit : SUITS) {
            for (int i = 0; i < NAMES.length; i++) {
                Card card = new Card(suit, NAMES[i], VALUES[i]);
                cards.add(card);
            }
        }
        return cards;
    }

    
    // shuffle method (randomise cards order in deck, systematic method)
    public void shuffle() {
        Integer deckSize = allCards.size();
        for (int i = 0; i < deckSize; i++) {
            SecureRandom random = new SecureRandom();
            Integer randomIndex = random.nextInt(deckSize);
            // swap index i with index random
            Card toSwap = allCards.get(randomIndex);
            allCards.set(randomIndex, allCards.get(i));
            allCards.set(i, toSwap);
        }
    }
    
    // call this method by printing deck instance
    @Override
    public String toString() {
        return "Deck [allCards=" + allCards + "]";
    }
}
