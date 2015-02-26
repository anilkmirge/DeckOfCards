package com.appian.sample.test;

/**
 * @author ANIL
 *
 */
public class Card {
	// Face Values excluding 2 through 10
	public final static int ACE = 1; 
	public final static int JACK = 11;
	public final static int QUEEN = 12;
	public final static int KING = 13;
	
    // List all the 4 varieties of suits in a pack of 52
    public final static int HEARTS = 0;
	public final static int SPADES = 1;
	public final static int CLUBS = 2;
	public final static int DIAMONDS = 3;

	// Declare suit and each card's numeric value
	private final int numericSuit;
	private final int number;

   //Construct the card to accept either ACE/2-10/JACK/QUEEN/KING and a suit number.
	public Card(int number, int numericSuit) {
		this.number = number;
		this.numericSuit = numericSuit;
	}

	/**
	 * Get a String value of each of the four suits.
	 */
		public String getSuitAsString() {
			switch (numericSuit) {
				case HEARTS:
					return "Hearts";
				case SPADES:
					return "Spades";
				case CLUBS:
					return "Clubs";
				case DIAMONDS:
					return "Diamonds";
				default:
					return "Unknown";
			}
		}

		/**
		 * Get a String value of the all numeric and non-numeric card's value.
		 */
		public String getValueAsString() {
			switch (number) {
				case 1:
					return "Ace";
				case 2:
					return "2";
				case 3:
					return "3";
				case 4:
					return "4";
				case 5:
					return "5";
				case 6:
					return "6";
				case 7:
					return "7";
				case 8:
					return "8";
				case 9:
					return "9";
				case 10:
					return "10";
				case 11:
					return "Jack";
				case 12:
					return "Queen";
				default:
					return "King";
			}
		}

		@Override
		public String toString() {
			return getValueAsString() + " of "+ getSuitAsString();
		}
}
