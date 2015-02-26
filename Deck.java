package com.appian.sample.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ANIL
 *
 */
public class Deck {
	private List<Card> deck = new ArrayList<Card>();
	private int cardToGet = 0;
    
	public Deck() {
		for (int suit = Card.HEARTS; suit <= Card.DIAMONDS; suit++) {
			for (int value = Card.ACE; value <= Card.KING; value++) {
				deck.add(new Card(value, suit));
			}
		}
	}

	public void shuffle() {
		for (int i = deck.size() - 1; i > 0; i--) {
			int rand = (int) Math.floor(Math.random() * (i + 1));
			Card temp = deck.get(i);
			deck.set(i, deck.get(rand));
			deck.set(rand, temp);
		}
		cardToGet = 52;
	}

	public Card dealOneCard() {
		try {
			System.out.println("Deck size is "+deck.size());
			return deck.remove(--cardToGet);
		} catch (IndexOutOfBoundsException e) {
			/** Show the message that the deck is empty **/
			throw new IllegalArgumentException("EMPTY");
		}
	}

	/**
	 * Main method to test out the deck drawing and shuffling
	 */
	public static final void main(String[] args) {
		 System.out.println("*******Welcome to the game of 'Deck of Cards'.This represents a deck of poker-style playing cards.********");
		 System.out.println();
		// Create the deck list with 52 cards
		Deck deck = new Deck();
		// Start shuffling
		deck.shuffle();
		// Calling one more than 52 to trigger empty deck message to the user
		for (int i = 1; i <= 53; i++) {
			try{
				Card card = deck.dealOneCard();
				System.out.println("Now Getting Card # " +i + " as '"+ card +"'");
			} catch(IllegalArgumentException iae) {
				if(iae.getMessage().equals("EMPTY")) {
					System.err.println("******************All the cards in the deck have been used******************");
				}
			}
		}
	}
}
