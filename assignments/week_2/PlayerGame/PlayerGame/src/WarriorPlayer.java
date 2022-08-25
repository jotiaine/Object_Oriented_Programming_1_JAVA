//subclass of the Player superclass
public class WarriorPlayer extends Player {
	// attributes of the subclass
	private String team = "Cave clan";

	// mehtods of the subclass
	public void cavemanGreeting() { // warriorplayer methods
		System.out.println("Raaayyrrrrhhhhh!");
	}

	public String getTeam() {
		return team;
	}
}
