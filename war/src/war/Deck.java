package war;

import java.util.Random;

public class Deck {
	private Card[] cards;
	Random rand = new Random();
	public Deck(int n) {
		this.cards = new Card[n];
	}

	
	public Deck subDeck(int low, int high) {
		Deck sub = new Deck(high - low +1);
		for(int i = 0; i < sub.cards.length; i++) {
			sub.cards[i] = this.cards[low + i];
		}
		return sub;
	}
	
	public Card[] getCards() {
		return cards;
	}
	
	public Deck() {
		this.cards = new Card[52];
		int index = 0;
		for (int suit = 0; suit < 4; suit++) {
			for (int rank = 1; rank <= 13; rank++) {
				this.cards[index] = new Card(rank, suit);
				index++;
			}
		}
	}
	public void print(Card[] cards) {
		for(Card card : this.cards) {
			System.out.println(card);
		}
	}
	
	public int Search(Card target) {
		int low = 0;
		int high = this.cards.length -1;
		while(low <= high) {
			int mid = (low + high) /2;
			int comp = this.cards[mid].compareTo(target);
			
			if(comp == 0) {
				return mid;
			}else if(comp < 0) {
				low = mid +1;
			}else {
				high = mid -1;
			}
		}
		return -1;
	}
	
	public void swap(Card[] cards, int i, int j) {
		Card temp = cards[j];
		cards[i] = cards[j];
		cards[j] = cards[i];
	}
	
	
	public void shuffle() {
		for(int i = 0; i < cards.length; i++) {
			int loc = rand.nextInt(i, cards.length -1);
			swap(i, loc);
		}
	}
	
}
