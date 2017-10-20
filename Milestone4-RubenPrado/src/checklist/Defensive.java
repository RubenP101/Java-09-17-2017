//Ruben Prado
//CST-105
//Mile Stone 3
//Charles Lively
//This work is my own
//Added defensive class to the program
package checklist;
//Classes that where added
public class Defensive extends Player{
	int interceptedPasses;
	int defendedPasses;
	int totalTackles;
	int assistedTackles;
	int combinedTackles;
	int interceptions;
	int fumbleTouchDowns;
	int sacks;
	int interceptionYards;
	int Fumbles;
	public Defensive() {
	}
	public Defensive(String url, int interception, double sacks, int interceptionYards,
			int Fumbles, int interceptedPasses, int defendedPasses, int totalTackles, int assistedTackles,
			int combinedTackles) 
	{
		this.interceptions = interceptions;
		this.sacks = (int) sacks;
		this.interceptionYards = interceptionYards;
		this.Fumbles = Fumbles;
		this.interceptedPasses = interceptedPasses;
		this.defendedPasses = defendedPasses;
		this.totalTackles = totalTackles;
		this.assistedTackles = assistedTackles;
		this.combinedTackles = combinedTackles;
	}
	public Defensive(int interceptions, double sacks, int interceptionYards,
			int Fumbles, int interceptedPasses, int defendedPasses, int totalTackles, int assistedTackles,
			int combinedTackles) {
		this.interceptions = interceptions;
		this.sacks = (int) sacks;
		this.interceptionYards = interceptionYards;
		this.Fumbles = Fumbles;
		this.interceptedPasses = interceptedPasses;
		this.defendedPasses = defendedPasses;
		this.totalTackles = totalTackles;
		this.assistedTackles = assistedTackles;
		this.combinedTackles = combinedTackles;
	}
	//Overides the checklist to player string
	@Override
	public String toString() {
		return "Defensive Player: " + this.getName();
	}

	public int getInterceptionTouchDowns() {
		return interceptions;
	}

	public int getFumbleTouchDowns() {
		return fumbleTouchDowns;
	}

	public double getSacks() {
		return sacks;
	}

	public int getInterceptionYards() {
		return interceptionYards;
	}

	public int getForcedFumbles() {
		return Fumbles;
	}

	public int getInterceptedPasses() {
		return interceptedPasses;
	}

	public int getDefendedPasses() {
		return defendedPasses;
	}

	public int getTotalTackles() {
		return totalTackles;
	}

	public int getAssistedTackles() {
		return assistedTackles;
	}

	public int getCombinedTackles() {
		return this.totalTackles + this.assistedTackles;
	}

	public void setInterceptionTouchDowns(int interceptions) {
		this.interceptions = interceptions;
	}

	public void setSacks(double sacks) {
		this.sacks = (int) sacks;
	}

	public void setInterceptionYards(int interceptionYards) {
		this.interceptionYards = interceptionYards;
	}

	public void setForcedFumbles(int Fumbles) {
		this.Fumbles = Fumbles;
	}

	public void setInterceptedPasses(int interceptedPasses) {
		this.interceptedPasses = interceptedPasses;
	}

	public void setDefendedPasses(int defendedPasses) {
		this.defendedPasses = defendedPasses;
	}

	public void setTotalTackles(int totalTackles) {
		this.totalTackles = totalTackles;
	}

	public void setAssistedTackles(int assistedTackles) {
		this.assistedTackles = assistedTackles;
	}

	public void setCombinedTackles(int combinedTackles) {
		this.combinedTackles = combinedTackles;
	}
}