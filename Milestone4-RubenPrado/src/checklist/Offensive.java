//Ruben Prado
//CST-105
//Mile Stone 3
//Charles Lively
//Added Offence class to the program
package checklist;
//Classes that where added
public class Offensive {
private String getName;
public int TouchDownPasses;
public int passes;
public int rushingAttempts;
public int fumbles;
public int lostFumbles;
public int completions;
public double rating;
public Offensive() {
}
public Offensive(double rating, int passingTouchDowns, int passingAttempts, int rushingAttempts, int rushingTouchDowns,
		double passingYards, double rushingYards, int fumbles, int lostFumbles, int completions) {
	this.rating = rating;
	this.TouchDownPasses = passingTouchDowns;
	this.passes = passingAttempts;
	this.rushingAttempts = rushingAttempts;
	this.fumbles = fumbles;
	this.lostFumbles = lostFumbles;
	this.completions = completions;
}
public Offensive(String url, String name, int age, double height, double weight, double rating, int passingTouchDowns, int passingAttempts, int rushingAttempts, int rushingTouchDowns,
		double passingYards, double rushingYards, int fumbles, int lostFumbles, int completions) {
	this.rating = rating;
	this.TouchDownPasses = passingTouchDowns;
	this.passes = passingAttempts;
	this.rushingAttempts = rushingAttempts;
	this.fumbles = fumbles;
	this.lostFumbles = lostFumbles;
	this.completions = completions;
}
//Overides the checklist to player string
@Override
public String toString() {
	return "Offensive: " + this.getName;
}
public double getRating() {
	return rating;
}
public void setRating(double rating) {
	this.rating = rating;
}
public int getPassingTouchDowns() {
	return TouchDownPasses;
}
public void setPassingTouchDowns(int passingTouchDowns) {
	this.TouchDownPasses = passingTouchDowns;
}
public int getPassingAttempts() {
	return passes;
}
public void setPassingAttempts(int passingAttempts) {
	this.passes = passingAttempts;
}
public int getRushingAttempts() {
	return rushingAttempts;
}
public void setRushingAttempts(int rushingAttempts) {
	this.rushingAttempts = rushingAttempts;
}
public int getFumbles() {
	return fumbles;
}
public void setFumbles(int fumbles) {
	this.fumbles = fumbles;
}
public int getLostFumbles() {
	return lostFumbles;
}
public void setLostFumbles(int lostFumbles) {
	this.lostFumbles = lostFumbles;
}
public int getCompletions() {
	return completions;
}
public void setCompletions(int completions) {
	this.completions = completions;
}
public int getPassingTouchDownPercent() {
	return TouchDownPasses / passes;
}
public double getCompletionPercent() {
	return completions / passes;
}
}