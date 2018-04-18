import java.util.ArrayList;

public class Player {
	
	private String name; 
	private int money;
	private int age; 
	private boolean legal; 
	
	/**
	 * @return the legal
	 */
	public boolean isLegal() {
		return legal;
	}

	/**
	 * @param legal the legal to set
	 */
	public void setLegal(boolean legal) {
		this.legal = legal;
	}

	private ArrayList<Card> hand;
	

	
	public Player(String name)
	{
		this.name = name; 
		money = 100;
		hand = new ArrayList<Card>();
	}
	
	public void addCard(Card card)
	{
		hand.add(card);
	}
	
	public void printHand()
	{
		System.out.println(name + "'s hand");
			int value = 0;
			int valueAlt = 0;
			int finalValue = 0;
		for (Card card:hand) {
			if (card.getFace().equals("Ace")) {
				valueAlt = 11;
				}
			card.printInfo();
			value = card.getFaceValue() + value;
			finalValue=value + valueAlt - 1;
			}
		System.out.println("Hand Value: " + value);
			if (valueAlt > 0) {

			System.out.println("Alt Value: " + finalValue );
			}
	}
	
	
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	public boolean checkAge (int playerAge) {
		if (playerAge >= 21) {
			return true; 
		}
		return false; 
	}

	/**
	 * @param name
	 * @param money
	 * @param age
	 * @param hand
	 */
	public Player(String name, int money, int age, ArrayList<Card> hand) {
		this.name = name;
		this.money = money;
		this.age = age;
		this.hand = hand;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the money
	 */
	public int getMoney() {
		return money;
	}

	/**
	 * @param money the money to set
	 */
	public void setMoney(int money) {
		this.money = money;
	}

	/**
	 * @return the hand
	 */
	public ArrayList<Card> getHand() {
		return hand;
	}

	/**
	 * @param hand the hand to set
	 */
	public void setHand(ArrayList<Card> hand) {
		this.hand = hand;
	}
}
