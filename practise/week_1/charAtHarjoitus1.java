package week_1;

import java.util.Scanner;

public class charAtHarjoitus1 {
public static void main(String[] args)
{
//declaration of variables
String firstName="", lastName="";
char firstNLetter='z',lastNLetter='y';
int legthOfLastName = 0;
Scanner myObj = new Scanner(System.in);

//Ask names, save to variables and pick letters
System.out.println("Let's make for you a new name!");

System.out.println("Firstname");
firstName= myObj.nextLine();
firstNLetter=firstName.charAt(0);

System.out.println("Lastname");
lastName = myObj.nextLine();
legthOfLastName=lastName.length();
lastNLetter=lastName.charAt(legthOfLastName-1);

System.out.println("Hello: "+firstNLetter+lastNLetter);
myObj.close();
}
}