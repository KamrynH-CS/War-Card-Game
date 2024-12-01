import java.util.Scanner;

public class WarGame {
    public static void main(String[] args) {
        String player1Name = "";
        String player2Name = "";
        int player1Score = 0;
        int player2Score = 0;

        Scanner sn = new Scanner(System.in);
        System.out.println("What is Player 1's Name? ");
        player1Name = sn.nextLine();

        System.out.println("What is Player 2's Name? ");
        player2Name = sn.nextLine();

        Deck player1Deck = new Deck();
        // Initial Shuffle
        player1Deck.shuffleDeck();
        Deck player2Deck = new Deck();
        // Initial Shuffle
        player2Deck.shuffleDeck();

        int cardCount = 0;
        int inputType = -1;
        while (cardCount != 51) {
            if ((cardCount + 1)%2 == 0) {
                System.out.println(player2Name + "'s Turn, Type 2 to Continue");
                if (sn.nextInt() != 2) {
                    System.out.println("It is" + player2Name + "'s turn.");
                    continue;
                }
            }
            else {
                System.out.println(player1Name + "s Turn, Type 1 to Continue");
                if (sn.nextInt() != 1) {
                    System.out.println("It is" + player1Name + "'s turn.");
                    continue;
                }
            }
            
            if ((cardCount + 1)%2 == 0) {
                // Player 2
                System.err.println(player2Name + ", Your top Card is: " + player2Deck.getCurrentCard().getCardValue() + " of " + player2Deck.getCurrentCard().getCardSuit());

                System.out.println("--------------------------------------");

                System.err.println(player1Name + ", Your top Card is: " + player1Deck.getCurrentCard().getCardValue() + " of " + player1Deck.getCurrentCard().getCardSuit());
            }
            else {
                // Player 1
                System.err.println(player1Name + ", Your top Card is: " + player1Deck.getCurrentCard().getCardValue() + " of " + player1Deck.getCurrentCard().getCardSuit());

                System.out.println("--------------------------------------");

                System.err.println(player2Name + ", Your top Card is: " + player2Deck.getCurrentCard().getCardValue() + " of " + player2Deck.getCurrentCard().getCardSuit());
            }

            // Compare Card Values to See Who Won
            if (player1Deck.getCurrentCard().getCardValue() > player2Deck.getCurrentCard().getCardValue()) {
                System.out.println("Player 1 Wins this Round!");
                player1Score += 1;
            } else if (player1Deck.getCurrentCard().getCardValue() < player2Deck.getCurrentCard().getCardValue()) {
                System.out.println("Player 2 Wins this Round!");
                player2Score += 1;
            } else {
                // If Card Scores are Even; Each Player Picks Random Card from Deck (If they Memorized Cards, Nice)
                int player1Choice = -1;
                int player2Choice = -1;

                System.out.println("It is a Tie! Each Player Pick a Number to Pull a Card from Deck to FIGHT!\n" + player1Name + "Chooses First! (1 - 52)");
                player1Choice = sn.nextInt() - 1;
                System.out.println(player2Name + " Chooses Next! (1 - 52)");
                player2Choice = sn.nextInt() - 1;

                System.err.println(player1Name + ", Your Card is: " + player1Deck.getDeck().get(player1Choice));

                System.out.println("--------------------------------------");

                System.err.println(player2Name + ", Your Card is: " + player2Deck.getDeck().get(player2Choice));
            }

            // Lastly, Increment
            cardCount++;

            
        }


    }
}
