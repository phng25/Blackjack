import java.util.*;
public class Table {

	private Scanner scan = new Scanner(System.in);
	private String namePlayer1; 
	private String namePlayer2; 
	private String cpuName = "CPU";
	private ArrayList<Player> players = new ArrayList<Player>();
	
	public Table() { 
		
		System.out.println("Welcome to the Casino!");
		
		//newPlayer(); //add players 
		newPlayer();
		
		
	}
	
	public void newPlayer () {
		
		boolean pass = false;
		while (!pass) {
			
			System.out.println("Player 1 please enter your name > ");
			namePlayer1 = scan.next();
			System.out.println("Player 1 please enter your age > ");
			int agePlayer1 = scan.nextInt();
			Player player1 = new Player(namePlayer1, 100, agePlayer1, null);
			players.add(player1);
			
			
			System.out.println("Player 2 please enter your name > ");
			namePlayer2 = scan.next();
			System.out.println("Player 2 please enter your age > ");
			int agePlayer2 = scan.nextInt();
			Player player2 = new Player(namePlayer2, 100, agePlayer2, null);
			players.add(player2);
			
			//CPU Player
			Player cpuPlayer = new Player("CPU", 100, 21, null);
			players.add(cpuPlayer);
			
			security();
		
		}
		
		
		
	}
	
	public boolean security() {
		
		boolean pass;
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
	
	public void startGame() {
		//Trung
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Table aTable = new Table();
		Deck aDeck = new Deck(); //create deck object 
	
		
	}

}
