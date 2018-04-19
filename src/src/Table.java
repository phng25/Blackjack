import java.util.*;
public class Table {

	private Scanner scan = new Scanner(System.in);
	private String namePlayer1; 
	private String namePlayer2; 
	private String cpuName = "CPU";
	private Player player1; 
	private Player player2;
	private Player dealer;
	private ArrayList<Player> players = new ArrayList<Player>();
	private boolean pass;

	public Table() { 
		
		System.out.println("Welcome to the Casino!");
		
		//DO NOT TOUCH METHOD - COMPLETE 
		newPlayer();
		
		//THIS IS A DEBUG STATEMENT
		System.out.println("All players are older than 21. Proceed.");
		
		Deck aDeck = new Deck(); 
		Card card = aDeck.gimmeACard();
				

		dealer.addCard(card);
		System.out.println("Dealer hand: ");
		dealer.printHand();
			
	}

	
	//DO NOT TOUCH METHOD - COMPLETE (PN)
	//This method adds the players 
	public void newPlayer () {
		
		while (!pass) {
			
			System.out.println("Player 1 please enter your name > ");
			namePlayer1 = scan.next();
			System.out.println("Player 1 please enter your age > ");
			int agePlayer1 = scan.nextInt();
			player1 = new Player(namePlayer1, agePlayer1);
			players.add(player1);
			
			
			System.out.println("Player 2 please enter your name > ");
			namePlayer2 = scan.next();
			System.out.println("Player 2 please enter your age > ");
			int agePlayer2 = scan.nextInt();
			player2 = new Player(namePlayer2, agePlayer2);
			players.add(player2);
			
			//CPU Player
			dealer = new Player("CPU", 21);
			players.add(dealer);
			
			verify(security());
		}
		
		if (pass)
		{
			return;
		}
	}
	
	//DO NOT TOUCH METHOD - COMPLETE (PN)
	//This method checks if all players are over 21
	public boolean security() {
		
		for (Player aPlayer : players)
		{
			if (!aPlayer.checkAge(aPlayer.getAge()))
			{
				System.out.println(aPlayer.getName() + " is not of age - please return when you and your guests are 21.");
				System.out.println("");
				pass = false;
				return pass;
			}
		}
		
		pass = true; 
		return pass;
		
	}
	
	//DO NOT TOUCH METHOD - COMPLETE (PN)
	//If players are not over 21, the players ArrayList will clear 
	public void verify(boolean check) {
		if (!check)
		{
			players.clear();
		}
	}
	
	public void startGame() {
		//Trung
		Deck aDeck = new Deck(); 
		Card card = aDeck.gimmeACard();
				
		dealer.addCard(card);
		System.out.println("Dealer hand: ");
		dealer.printHand();	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Table aTable = new Table();
		Deck aDeck = new Deck(); //create deck object 
		
	}

}
