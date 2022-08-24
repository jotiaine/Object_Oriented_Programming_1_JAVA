import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

/*
    1. Introduce vars
    2. Create jasenrekisteri.txt
    3. Loop the program 
        4. Add member to the list
        5. Print the list
        6. End or return to main menu
*/

public class App {
    // 1.
    public static Scanner input = new Scanner(System.in);
    public static Scanner myReader;
    public static FileWriter myWriter;
    public static String fname;
    public static String lname;
    public static String tel;
    public static int choice;
    public static File file;

    public static void main(String[] args) {
        // 2.
        createJRFile();

        // 3.
        startLoop();
        // Steps 4. & 5. & 6. are in the loop

        // Close
        input.close();
    }

    static void createJRFile() {
        try {
            file = new File("jasenrekisteri2.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void startLoop() {
        while (true) {
            System.out.println("1) Add a new member to the register");
            System.out.println("2) Print the entire content of the member register");
            System.out.println("Enter your choice:");
            choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                // 4.
                addMember();
            } else if (choice == 2) {
                // 5.
                printMembers();
            }
            break;
        }
    }

    static void addMember() {
        try {
            System.out.println("First name:");
            fname = input.nextLine();
            System.out.println("Last name:");
            lname = input.nextLine();
            System.out.println("Telephone:");
            tel = input.nextLine();

            myWriter = new FileWriter(file, true);
            myWriter.write(fname + " " + lname + " " + tel + "\n");
            myWriter.close();

            endOrReturnToMM();

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

    }

    static void printMembers() {
        try {
            myReader = new Scanner(file);

            // Checking if the file is empty
            if (myReader.hasNextLine()) {
                while (true) {
                    if (myReader.hasNextLine()) {
                        System.out.println(myReader.nextLine());
                    } else {
                        break;
                    }
                }
            } else {
                System.out.println("The register is empty.");
            }

            myReader.close();

            // 6.
            endOrReturnToMM();

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    static void endOrReturnToMM() {
        try {
            System.out.println("1) Return to the main menu");
            System.out.println("2) End the program");
            System.out.println("Enter your choice:");
            choice = input.nextInt();

            if (choice == 1) {
                startLoop();
            } else {
                // Delete file
                if (!file.delete()) {
                    String message = file.exists() ? "is in use by another app" : "does not exist";
                    throw new IOException("Cannot delete file, because file " + message + ".");
                } else {
                    System.out.println("File deleted");
                    System.out.println("Program ended");

                }

            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

}
