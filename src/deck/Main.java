package deck;

public class Main {

    public static void main(String[] args) {
        
        Deck myDeck = new Deck();
        System.out.println("Number Of Cards in Deck: " + myDeck.getNumberOfCards());

        System.out.println("Sequence Of Cards Before Shuffling: ");
        for (int i = 0; i < myDeck.getNumberOfCards(); i++) {
            System.out.println(i+1 + ") " + myDeck.getCards()[i]);
        }

        System.out.println("Sequence Of Cards After Shuffling: ");
        myDeck.shuffle();
        for (int i = 0; i < myDeck.getNumberOfCards(); i++) {
            System.out.println(i+1 + ") " + myDeck.getCards()[i]);
        }

    }
    
}
