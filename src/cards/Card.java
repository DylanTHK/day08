package cards;

// class to create new instance of card
public class Card {
    // card properties
    private final String SUIT; // variable for suit
    private final String NAME; // variable for name (Ace, 2, ... King)
    private final Integer VALUE;// variable for card value (1 - 10)

    // constructor to demand input
    public Card(String suit, String name, Integer value) {
        this.SUIT = suit;
        this.NAME = name;
        this.VALUE = value;
    }

    // getters for the card variables (3 nos)
    public String getSuit() {
        return this.SUIT;
    }

    public String getName() {
        return this.NAME;
    }

    public Integer getValue() {
        return this.VALUE;
    }

    // method to view card details
    @Override
    public String toString() {
        return "Card [suit=" + SUIT + ", name=" + NAME + ", value=" + VALUE + "]";
    }
}
