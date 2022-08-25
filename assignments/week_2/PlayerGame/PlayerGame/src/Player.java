//this is a superclass of Player game
public class Player {
  // attributes of the class
  public String playerFirstname = "";
  public String playerLastname = "";

  // Method of the superclass.
  // Greeting method is able to show basic greeting in console window

  public void greeting() {
    System.out.println("Howdy!");
  }

  // Getter
  public String getFirstname() {
    return playerFirstname;
  }

  // Setter
  public void setFName(String newName) {
    this.playerFirstname = newName;
  }

  // Getter
  public String getLastname() {
    return playerLastname;
  }

  // Setter
  public void setLName(String newName) {
    this.playerLastname = newName;
  }
}
