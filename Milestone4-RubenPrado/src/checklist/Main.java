
//Ruben Prado
//Ruben Prado
//CST-105
//Mile Stone 3
//Charles Lively
// This has constructors and with Getter and setter methods
// I chose to use the Arizona Cardinals (my team)
package checklist;
public class Main {
public static void main(String[] args) {
		//Test
		playerDriver();
		
		System.out.println();
		
		managerDriver();
		}
	//For the Player class
	public static void playerDriver(){
		//create a player
		Player BlaneGabbert = new Player();
		//Set parameters manually
		BlaneGabbert.setHeight(0);
		BlaneGabbert.setWeight(0);
		 
		BlaneGabbert.setBMI();
		
		//print to show the info for the players
		System.out.println(BlaneGabbert.toString());
		System.out.println();
		
		//Create a player by accepting all of the parameters
		Player LarryFitzGerald = new Player("Larry Fitzgerald", "Wide Receiver", "Arizona Cardinals", 75, 220, 48, 60,
				14, "Arizona");
		
		//print to show the info for the player
		System.out.println(LarryFitzGerald.toString());
	}
	
	//test driver for Manager class
	public static void managerDriver(){
		//Create a player manager class instance
		Manager availablePlayers = new Manager();
		
		//print a list of available players in the manager
		System.out.println(availablePlayers.toString());
	}

}
