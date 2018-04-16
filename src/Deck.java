import java.util.Random; 
import java.util.ArrayList;

public class Deck {

	ArrayList<Card> deck = new ArrayList<Card>();
	
	public Deck()
	{
		generateDeck();
	}
	
	public Card gimmeACard() //returning a card object, gives you a card
	{
		Random rand = new Random(); //create random object 
		int position = rand.nextInt(deck.size()); //gets position based on random position in the deck 
		Card aCard = deck.get(position); //card object at a random position 
		deck.remove(position); //removes the object at the position 
//		while (aCard == null) //if aCard is null, search for another card 
//		{
//			position = rand.nextInt(deck.size());
//			aCard = deck.get(position);
//		}
//		deck[position] = null; //tells you that a card has been pulled 
		return aCard; //returns a random card 
	}
	
	private void generateDeck() //makes the deck array 
	{
		//Create arrays for different attributes of cards in the deck 
		String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"	};
		String[] faces = {"Aces", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen"};
		int[] faceValues = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		
//		int deckCounter = 0; //tells you which card in the deck 
		for (int i = 0; i < suits.length; i++) //loops through suits array 
		{
			for (int j = 0; j < faces.length; j++) //loops through faces array, faces and faceValue hold same amount so they can use the same index
			{
				Card aCard = new Card(suits[i], faces[j], faceValues[j]); //create new card object 
				deck.add(aCard); //inputting info into deck ArrayList
//				deckCounter++; //increment position in deck
			}
		}
	}
}
