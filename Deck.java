import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> deckArray;

    public Deck() {
        /*
         * Initialize Deck Array with Correct Standard Cards
         * 52 Total Cards
         * 4 Suits (Spades, Hearts, Diamonds, and Clubs)
         * Each Suit Contains 13 Cards : Ace, 2-10, Jack, Queen, King
         * We are Excluding Jokers
         */

         this.deckArray = new ArrayList<Card>();

         // 4 Suit Types
         for (int suit = 0; suit<4; suit++) {
            // 13 Card Types
            for (int card = 0; card<13; card++) {
                switch (suit) {
                    case 0:
                        this.deckArray.add(new Card(card+1, "Spades"));
                        break;
                    case 1:
                        this.deckArray.add(new Card(card+1, "Hearts"));
                        break;
                    case 2:
                        this.deckArray.add(new Card(card+1, "Diamonds"));
                        break;
                    case 3:
                        this.deckArray.add(new Card(card+1, "Clubs"));
                        break;
                }
            }
         }
    }

    public void shuffleDeck() {
        /* 
         * We Will Shuffle Order of this.deckArray
         */

        Collections.shuffle(this.deckArray);
    }

    public Card getCurrentCard() {
        return this.deckArray.get(0);
    }

    public ArrayList<Card> getDeck() {
        return this.deckArray;
    }

}
