import java.util.*;
public class Table {

	private Scanner scan = new Scanner(System.in);
	private String namePlayer1; 
	private String namePlayer2; 
	private String cpuName = "CPU";
	private ArrayList<Player> players = new ArrayList<Player>();
	
	public Table() { 
		
		System.out.println("Welcome to the Casino!");
		
		newPlayer(); //add players 
		
	
		
	}
	
	public void newPlayer () {
		
		while (!security()) 
			
		{
			
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
		
		}
		
		//security(); //check age
		
	}
	
	public boolean security() {
		boolean illegal; 
		for (Player aPlayer : players)
		{
			if (!aPlayer.getName().equals("CPU") && aPlayer.checkAge(aPlayer.getAge())) {
				System.out.println(aPlayer.getName() + " is not 21. Please return when you are of age.");	
				illegal = true;
				return illegal;
			}
		}
		return false; 
	}
	
	public void startGame() {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Table aTable = new Table();

		Deck aDeck = new Deck(); //create deck object 
	
		
	}

}
