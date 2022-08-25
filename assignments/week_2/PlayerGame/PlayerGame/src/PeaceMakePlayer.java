//subclass of the Player superclass
public class PeaceMakePlayer extends Player {
	private String team = "eatrhProtectors"; // attribuutit
	private boolean smile = true;

	public void peaceGreeting() { // methods
		System.out.println("Peace!");
	}

	public void goodHealthGreeting() {
		System.out.println("Cheers!");
	}

	// all set and get methods should come here. Do them.
	// getTeam
	public String getTeam() {
		return team;
	}

	// setTeam
	public void setTeam(String newTeam) {
		this.team = newTeam;
	}

	// getSmile
	public boolean getSmile() {
		return smile;
	}

	// setSmile
	public void setSmile(boolean newSmile) {
		this.smile = newSmile;
	}
}
