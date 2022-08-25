public class Game1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// WarriorPlayer
		WarriorPlayer johanna = new WarriorPlayer();
		johanna.greeting();
		johanna.cavemanGreeting();

		johanna.setFName("Meri Johanna");
		johanna.setLName("Vuokila");
		System.out.println("Hi " + johanna.getFirstname() + " "
				+ johanna.getLastname() + " "
				+ "the great warrior from the "
				+ johanna.getTeam() + " team!");

		// PeaceMakePlayer
		PeaceMakePlayer julia = new PeaceMakePlayer();
		julia.greeting();
		julia.goodHealthGreeting();

		julia.setFName("Julia");
		julia.setLName("Virtanen");
		System.out.println("Hi " + julia.getFirstname() + " "
				+ julia.getLastname() + " "
				+ "the great peace maker from the "
				+ julia.getTeam() + " team!");

		julia.setSmile(false);
		System.out.println(julia.getSmile());
		julia.setSmile(true);
		System.out.println(julia.getSmile());

	}

}
