public class Card {
    /*
     * Two Values for Each Card;
     * Number Value & Suit
     */
    private int cardValue;
    private String suitType;

    /*
     * Card Object, Done Here.
     */
    public Card (int cv, String st) {
        this.cardValue = cv;
        this.suitType = st;
    }

    public int getCardValue() {
        return this.cardValue;
    }

    public String getCardSuit() {
        return this.suitType;
    }
}
