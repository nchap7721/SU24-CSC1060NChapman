package war;

import java.util.ArrayList;

public class pile {
	private ArrayList<Card> cards;

	public pile() {
		this.cards = new ArrayList<Card>();
	}
	
	public void addCard(Card card) {
		this.cards.add(card);
	}
	
	public Card popCard() {
		return this.cards.remove(0);
	}
	
	public boolean isEmpty() {
		return this.cards.isEmpty();
	}
	
	public void addDeck(Deck deck) {
		for (Card card : deck.getCards()) {
			this.cards.add(card);
			
		}
	}
	
}
