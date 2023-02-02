package deck;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Deck {
    
    private int numberOfCards;
    private Card[] cards; // array of cards 
    private List<Card> cardList = new LinkedList<Card>(); // list of cards

    // Constructor
    public Deck() {
        this.numberOfCards = 52;
        this.cards = new Card[numberOfCards];

        for (int i = 0; i < this.numberOfCards; i++) {
            
            if ((i/13) == 0) {
                cards[i] = new Card("Spade", i%13+1);
            } else if ((i/13) == 1) {
                cards[i] = new Card("Heart", i%13+1);
            } else if ((i/13) == 2) {
                cards[i] = new Card("Club", i%13+1);
            } else if ((i/13) == 3) {
                cards[i] = new Card("Diamond", i%13+1);
            }
        }
    }

    public int getNumberOfCards() {
        return numberOfCards;
    }

    public Card[] getCards() {
        return cards;
    }

    public Card[] shuffle() {
        Random random = new Random();
        for (int i = 0; i < numberOfCards; i++) {
            int randomIndexToSwap = random.nextInt(numberOfCards);
            Card temp = cards[randomIndexToSwap];
            cards[randomIndexToSwap] = cards[i];
            cards[i] = temp;
        }
        return cards;
    }

    // public Card removeCard() {
    //     requires a List implementation
    // }
    
}
