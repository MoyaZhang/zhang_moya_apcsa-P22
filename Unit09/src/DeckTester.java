/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		
		Deck face = new Deck(new String [] {"Q", "J", "K", "A"}, new String [] {"Spades", "Hearts", "Clubs", "Diamonds"}, new int [] {1,5,10,15});
		Deck number = new Deck(new String [] {"2", "3", "4", "5","6", "7", "8", "9", "10"}, new String [] {"Spades", "Hearts", "Clubs", "Diamonds"}, new int [] {1,5,10, 15, 1, 1, 1, 1, 6});
		Deck all = new Deck(new String [] {"Q", "J", "K", "A", "2", "3", "4", "5","6", "7", "8", "9", "10"}, new String [] {"Spades", "Hearts", "Clubs", "Diamonds"}, new int [] {12, 11, 13, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
		
		System.out.println(face.isEmpty());
		System.out.println(number.isEmpty());
		System.out.println(all.isEmpty());
		System.out.println();
		
		System.out.println(face.size());
		System.out.println(number.size());
		System.out.println(all.size());
		System.out.println();
		
		System.out.println(face.deal());
		System.out.println(number.deal());
		System.out.println(all.deal());
		System.out.println();
		
		all.shuffle();
		System.out.println(face);
		System.out.println(number);
		System.out.println(all);

	}
}
