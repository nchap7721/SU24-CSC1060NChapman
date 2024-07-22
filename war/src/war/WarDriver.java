package war;

public class WarDriver {

	public static void main(String[] args) {
		
	/*	System.out.println(search(cards, jackOfDiamonds));
		swap(cards, 1, 35);*/
	}
	
	
	Deck p1Deck = deck.subDeck(0, 25);
	Deck p2Deck = deck.subDeck(26, 51);
	
	pile p1 = new pile();
	p1.addDeck(deck.subDeck(0,25));
	
	pile p2 = new pile();
	p2.addDeck(deck.subDeck(26,51));
	
	while(!p1.isEmpty() && !p2.isEmpty()) {
		Card c1 = p1.popCard();
		Card c2 = p2.popCard();
		
		int diff = c1.getRank() - c2.getRank();
		if(diff > 0) {
			p1.addCard(c1);
			p1.addCard(c2);
		}else if (diff < 0) {
			p2.addCard(c1);
			p2.addCard(c2);
		}
		else {
			tie.addCard(c1);
			tie.addCard(c2);
			Card c3 = p1.popCard();
			
		}
	}
	
	public static int search(Card[] cards, Card target) {
		for(int i = 0; i < cards.length; i++) {
			if(cards[i].equals(target)) {
				return i;
			}
		}
		return -1;
	}
	
	
	
	public static void printDeck(Card[] cards) {
		for(Card card : cards) {
			System.out.println(card);
		}
	}
	
	public static void insSort(Card[] cards) {
		for(int i = 1; i < cards.length; i++)
			for(int j = i; (j > 0) && (cards[j].compareTo(cards[j -1]) < 0); j--);
				swap(cards, j , j -1);
		}
	
}