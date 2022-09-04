import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

public class App {
    public static void main(String[] args) throws Exception {
        // Show show;
        Movie deerHunter;
        Series got;

        deerHunter = new Movie("Deer Hunter", 2017, new String[] { "Taika Waititi" }, new String[] { "Kaitlyn Dever" },
                8.0, "Good", 120);

        got = new Series("Game of Thrones", 2011, new String[] { "David Benioff", "D. B. Weiss" },
                new String[] { "Peter Dinklage", "Kit Harington", "Iwan Rheon", "Lena Headey", "Emilia Clarke",
                        "Aidan Gillen" },
                9.0, "Great show", 10);

        deerHunter.getShowInfo();// // Variables
        got.getShowInfo();// // Variables
        // Scanner input = new Scanner(System.in);
        // String userName;
        // int userChoice;
        // String movieName;
        // int movieGrade;
        // String movieComment;

        // // Files
        // File watchListFile = new File("watchlist.txt");
        // File userFile = new File("movies.txt");

        // if (userFile.exists()) {
        // System.out.println(userFile.getAbsolutePath() + "file exists");
        // System.out.println("Do you want to overwrite the file? (y/n)");
        // String userInput = input.nextLine();
        // if (userInput.equals("y") || userInput.equals("Y")) {
        // userFile.delete();
        // userFile.createNewFile();
        // } else {
        // System.out.println("Start adding movies!");
        // }
        // } else {
        // userFile.createNewFile();
        // System.out.println("File does not exist");
        // }

        // if (watchListFile.exists()) {
        // System.out.println(watchListFile.getAbsolutePath() + "file exists");
        // System.out.println("Do you want to overwrite the file? (y/n)");
        // String userInput = input.nextLine();
        // if (userInput.equals("y") || userInput.equals("Y")) {
        // watchListFile.delete();
        // watchListFile.createNewFile();
        // } else {
        // System.out.println("Start adding movies!");
        // }
        // } else {
        // watchListFile.createNewFile();
        // System.out.println("File does not exist");
        // }

        // FileWriter userWriter;
        // FileWriter watchListWriter;
        // Scanner reader;
        // Scanner watchListReader;

        // try {
        // // 1. Welcome the user and ask for their name
        // System.out.println();
        // System.out.println("Welcome to the best movies app!");
        // System.out.println("Hello to a program where you can save your favorite
        // movies!");
        // System.out.println("You can also save movies you want to watch!");
        // System.out.println();
        // System.out.println("Enter your name:");
        // userName = input.nextLine();

        // for (int i = 0; i < 50; i++) {
        // System.out.println();
        // }

        // // 3.
        // while (true) {
        // System.out.println();
        // System.out.println("Hello " + userName + "!");
        // System.out.println();
        // System.out.println("1) Save a movie and make a review");
        // System.out.println("2) Add a movie to the watch list");
        // System.out.println("3) Print all the saved movies");
        // System.out.println("4) Print the watch list");
        // System.out.println("5) Quit the program");
        // System.out.println();
        // System.out.println("Enter your choice:");
        // userChoice = input.nextInt();

        // for (int i = 0; i < 50; i++) {
        // System.out.println();
        // }

        // if (userChoice == 1) {
        // input.nextLine();
        // System.out.println("Enter the name of the movie:");
        // movieName = input.nextLine();
        // System.out.println("Give a grade to the movie 0-10:");
        // movieGrade = input.nextInt();

        // if (movieGrade > 10 || movieGrade < 0) {
        // System.out.println("Invalid grade!");
        // continue;
        // } else {
        // userWriter = new FileWriter(userFile, true);
        // input.nextLine();
        // System.out.println("Enter a review/comment:");
        // movieComment = input.nextLine();
        // userWriter.write(userName + "'s favourite movies:" + "\n" + "Movie: " +
        // movieName + "\n"
        // + "Grade: " + movieGrade + "\n" + "Comment: "
        // + movieComment + "\n" + "\n");
        // System.out.println("Movie saved!");
        // System.out.println();
        // userWriter.close();
        // }

        // } else if (userChoice == 2) {
        // input.nextLine();
        // watchListWriter = new FileWriter(watchListFile, true);
        // System.out.println("Enter the name of the movie:");
        // movieName = input.nextLine();
        // watchListWriter.write(userName + "'s watch list:" + "\n" + "Movie: " +
        // movieName + "\n" + "\n");
        // System.out.println(movieName.toUpperCase() + " was added to the watch
        // list!");
        // System.out.println();
        // watchListWriter.close();
        // } else if (userChoice == 3) {
        // reader = new Scanner(userFile);
        // System.out.println("All the saved files:");
        // System.out.println();
        // while (reader.hasNextLine()) {
        // System.out.println(reader.nextLine());
        // }
        // reader.close();
        // } else if (userChoice == 4) {
        // watchListReader = new Scanner(watchListFile);
        // System.out.println("All the saved files:");
        // System.out.println();
        // while (watchListReader.hasNextLine()) {
        // System.out.println(watchListReader.nextLine());
        // }
        // watchListReader.close();
        // } else if (userChoice == 5) {
        // System.out.println("Goodbye!");
        // break;
        // } else {
        // System.out.println("Invalid choice!");
        // }
        // }

        // } catch (Exception e) {
        // System.out.println("Error: " + e.getMessage());
        // } finally {
        // input.close();
        // }
    }
}
