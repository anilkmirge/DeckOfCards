# DeckOfCards
This example is to code in Java a set of classes that represent a deck of poker-style playing cards. 

(Fifty-two playing cards in four suits: hearts, spades, clubs, diamonds, with face values of Ace, 2-10, Jack, 

Queen, and King.) Within one of your classes, you must provide two operations:

shuffle() --> Shuffle returns no value, but results in the cards in the deck being randomly permuted. Please do not use 

library-provided “shuffle” operations to implement this function. You may use library provided random 

number generators in your solution if needed.

dealOneCard() --> This function should return one card from the deck to the caller. Specifically, a call to shuffle followed by 52 

calls to dealOneCard() should result in the caller being provided all 52 cards of the deck in a random 

order. If the caller then makes a 53rd call dealOneCard(), no card is dealt.