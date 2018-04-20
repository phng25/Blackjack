import java.util.*;
public class Table {
	
	private Scanner scan = new Scanner(System.in);
	private Random rand = new Random();
	private String namePlayer1; 
	private String namePlayer2; 
	private Player player1; 
	private Player player2;
	private Player dealer;
	private ArrayList<Player> players = new ArrayList<Player>();
	private boolean pass;
	
	public Table() {
		
		opening();
		createDealer();
		addPlayers();
		game();
	}

	//this method creates welcoming statement - complete do not modify
	public void opening() {
		System.out.println("Welcome to the Big Baller Casino!");
		System.out.println("You must be 21 and over to play.");
		System.out.println();
	}
	
	//this methods adds player methods - complete do not modify
	
	public void addPlayers() {
		
		while (!pass)
		{
			System.out.println("Player 1 please enter your name >");
			namePlayer1 = scan.next();
			System.out.println("Player 1 please enter your nage >");
			int agePlayer1 = scan.nextInt();
			Player player1 = new Player(namePlayer1, agePlayer1);
			players.add(player1);
			
			System.out.println("Player 2 please enter your name >");
			namePlayer2 = scan.next();
			System.out.println("Player 1 please enter your nage >");
			int agePlayer2 = scan.nextInt();
			Player player2 = new Player(namePlayer2, agePlayer2);
			players.add(player2);
			
				if (!ageCheck())
				{
					players.clear();
				}
		}

	}
	
	//this method creates the CPU dealer - complete do not modify
	public void createDealer() {
		String cpuName = "Dealer";
		dealer = new Player(cpuName, 99);
		players.add(dealer);
	}
	
	//this method returns a t/f to allow the game to continue - complete do not modify
	public boolean ageCheck() {
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

	//this method creates a card - complete do not modify
	public Card createCard() {
		Deck aDeck = new Deck();
		Card card = aDeck.gimmeACard();	
		return card;
	}
	
	//this method will add a hard to a players hand - complete do not modify
	public void deal(Player thisPlayer)
	{
		Card thisCard = createCard();
		thisPlayer.addCard(thisCard);
		System.out.print(thisPlayer.getName());
		System.out.print(" has ");
		thisCard.printInfo();
	}
	
	//this method will take player bets and add the sum to get the potential winning - complete do not modify
	public int bet(Player thisPlayer)
	{
		int winnings = 0;
		for (Player aPlayer : players)
		{
			if (!(aPlayer.getName().equals("Dealer")))
			{
				System.out.println(aPlayer.getName() + " how much would you like to bet?");
				int bet = scan.nextInt();
				aPlayer.setMoney(aPlayer.getMoney() - bet);
				winnings = winnings + bet;
			}
		}
		return winnings;
	}
	
	//this method will set the bets for the players - complete do not modify
	public void setBet()
	{
		for (Player aPlayer : players)
		{
			{
				bet(aPlayer);
			}
		}
	}
	
	//this is where the game takes place - complete do not modify
	public void game()
	{
		setBet();
		
		for (Player aPlayer : players)
		{
			deal(aPlayer);
		}
		
		System.out.println(dealer.getName() + " has a ");
		dealer.printHand();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table blackjack = new Table();
	}

}
