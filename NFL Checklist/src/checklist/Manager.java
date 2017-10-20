package checklist;

import java.util.ArrayList;

public class Manager {
	//The Players List
		private ArrayList<Player> availablePlayers = new ArrayList<Player>();
		
		//Instance Constructor 
		public Manager() {
			createPlayers();
		}
		//Player Generater 
		public void createPlayers(){
			Player players1 = new Player("Larry Fitzgerald", "Wide Receiver", "Arizona Cardinals", 75, 218, 34, 11,
					14, "Arizona");
			Player players2 = new Player("Blane Gabbert", "Quarterback", "Arizona Cardinals", 76, 225, 39, 12,
					18, "Arizona");
			Player players3 = new Player("Chris Johnson", "Running Back", "Arizona Cardinals", 72, 225, 21, 21,
					2, "Arizona");
			Player players4 = new Player("John Brown", "Wide Receiver", "Arizona Cardinals", 70, 181, 28, 84,
					8, "Arizona");
			Player players5 = new Player("Ricky Jones", "Tight End", "Arizona Cardinals", 76, 255, 37, 85,
					15, "Arizona");
			Player players6 = new Player("Tyrann Mathieu", "Safety", "Arizona Cardinals", 72, 212, 28, 29,
					8, "Arizona");
			
			availablePlayers.add(players1);
			availablePlayers.add(players2);
			availablePlayers.add(players3);
			availablePlayers.add(players4);
			availablePlayers.add(players5);
			availablePlayers.add(players6);
		}
		public String toString(){
			String Posibleplayers = "";
			
			for (Player x : availablePlayers){
				Posibleplayers += x.getName() + "\n";
			}
			return Posibleplayers;
		}
		//Remainder players
		public void addPlayer(Player player){
			availablePlayers.remove(player);
		}
		//Player removal
		public void removePlayer(Player player){
			availablePlayers.add(player);
		}
		
	}
