
public class Card {
	
	private String suit; 
	private String face; 
	private int faceValue;
	
	/**
	 * @param suit
	 * @param face
	 * @param faceValue
	 */
	
	public Card(String suit, String face, int faceValue) {
		this.suit = suit;
		this.face = face;
		this.faceValue = faceValue;
	}
	/**
	 * @return the suit
	 */
	public String getSuit() {
		return suit;
	}
	/**
	 * @param suit the suit to set
	 */
	public void setSuit(String suit) {
		this.suit = suit;
	}
	/**
	 * @return the face
	 */
	public String getFace() {
		return face;
	}
	/**
	 * @param face the face to set
	 */
	public void setFace(String face) {
		this.face = face;
	}
	/**
	 * @return the faceValue
	 */
	public int getFaceValue() {
		return faceValue;
	}
	/**
	 * @param faceValue the faceValue to set
	 */
	public void setFaceValue(int faceValue) {
		this.faceValue = faceValue;
	} 
	
	public void printInfo()
	{
		System.out.println(face + " of " + suit);
	}
	
}
