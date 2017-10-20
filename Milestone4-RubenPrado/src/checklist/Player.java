package checklist;

public class Player {
	//Instance variables
		private String name;
		private String position;
		private String team;
		private int height;
		private int weight;
		private int age;
		private int jerseyNumber;
		private int exp;
		private String college;
		private double BMI;
		private int playerAge;
		
		//Constructor without params
		public Player() {
			super(); }	
		//Constructor that calls and excepts
		public Player(String name, String position, String team, int height, int weight, int age, int jerzeeNumber,
				int experience, String college) {
			super();
			this.name = name;
			this.position = position;
			this.team = team;
			this.height = height;
			this.weight = weight;
			this.age = age;
			this.jerseyNumber = jerseyNumber;
			this.exp = experience;
			this.college = college;
			// Age and BMI for calculation
			this.setBMI();
			this.setplayerAge();
		}
		public String getName() {
		return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPosition() {
			return position;
		}
		public void setPosition(String position) {
			this.position = position;
		}
		public int getHeight() {
			return height;
		}
		public void setHeight(int height) {
			this.height = height;
		}
		public int getWeight() {
			return weight;
		}
		public void setWeight(int weight) {
			this.weight = weight;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		public int getJerzeeNumber() {
			return jerseyNumber;
		}
		
		public void setJerzeeNumber(int jerseyNumber) {
			this.jerseyNumber = jerseyNumber;
		}

		public int getExperience() {
			return exp;
		}

		public void setExperience(int experience) {
			this.exp = experience;
		}

		public String getCollege() {
			return college;
		}

		public void setCollege(String college) {
			this.college = college;
		}

		public String getTeam() {
			return team;
		}

		public void setTeam(String team) {
			this.team = team;
		}

		public double getBMI() {
			return BMI;
		}

		public void setBMI() {
			BMI = (this.weight * .45) / ((this.height * .025) * 2);
		}

		public int getplayerAge() {
			return playerAge;
		}

		public void setplayerAge() {
			playerAge = this.age - this.exp;
		}
		
		//String Player stats
		public String toString(){
			return "Name: " + this.name
					+ "\nPlayedPosition: " + this.position
					+ "\nPlayersTeam: " + this.team
					+ "\nPlayersHeight: " + this.height / 12 + "'" + this.height % 12 + "\""
					+ "\nPlayersWeight: " + this .weight
					+ "\nPlayersBMI: " + this.BMI
					+ "\nPlayersAge: " + this.playerAge
					+ "\nPlayersNumber: " + this.jerseyNumber
					+ "\nPlayedExperience: " + this.exp + " years"
					+ "\nCollege: " + this.college;
		}
		

	}
