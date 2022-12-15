package cards;

// initialise deck here
public class CardMain {
    public static void main(String[] args) {
        Deck deck = new Deck();
        // System.out.println(deck);
        
        deck.shuffle();

        // deck.take(); // takes card at the top of deck
        System.out.println(deck);
        System.out.println(deck.getSize());


    }
}
