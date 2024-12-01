// Writing Down Ideas for Game

Cards >= Class
    - Suit (Spade, Diamonds, Ace, etc.)
    - Number Value


Deck >= Class
    - Holds Cards


Players (2) >= Class?
    - Holds Decks -> Array
    - take turn putting top card in the middle to compare -> if statement
        - if player 1 card is higher, player 1 gets card
        - else, if player 2 card is higher, player 2 gets card
        - else, in the event of a tie, go to war
        - logic for war (3 cards face down, compare the 4th cards with if statement)
        - what happens with cards that are won? bottom of array (cards in hand) ? or in 
        another array, then when no more cards in hand, shuffle and add to that hand?

Shuffle Cards
    - Randomly Sort Array of Cards

Runtime Environment (Main)