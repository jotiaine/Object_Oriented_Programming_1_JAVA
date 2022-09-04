
import java.util.Scanner;
public class CollertoAppMain 
{//1pair

	public static void main(String[] args) 
	
	{//2pair

		try
		{
		//variables of the main
		int choice = 0;
		//lets make object of Item class and Paintings class
		Item newItem = new Item();
		Paintings newPainting = new Paintings();
		Scanner myObject = new Scanner(System.in);
/*
		newItem.setName("Mug: Dancing moomins");
		newItem.setPrice(50.00);
		newItem.setPurchaseYear(2022);	
		newItem.printAddedItem();
		
		newPainting.setArtist("Pablo Picasso");
		newPainting.setName("Picasso painting");
		newPainting.setPrice(2000000.00);
		newPainting.setPurchaseYear(2022);
		newPainting.setPaintingName("Science and Charity");
		newPainting.yearDone(1897);
		newPainting.printPaintingInfo();
		*/
		//add new item or painting by asking from user
		do
		{
		System.out.println("Do you want to add new 1)item 2)painting 3)exit");
		choice = myObject.nextInt();
		if (choice==1)
			{//4pair
				collectBasicInfo();
			}//4pairend
		else if (choice==2)
		{
			insertNewPainting();
		}
		else if (choice==3)
		{
			System.out.println("Application closed");
			System.exit(0);
			
		}

		}while (choice!=3);
		
		}
		catch (Exception e)
		{
			System.out.println("Dont do that. Bye.");
		}
	}//2pairend



	  static void insertNewPainting()
	  {//3pair		    
		    Paintings newPainting = new Paintings();
		    Scanner myObject = new Scanner(System.in);
		    collectBasicInfo();
		    System.out.println("Please add more information of the painting:");	    
		    System.out.println("Name of the artist: ");
		    newPainting.setArtist(myObject.nextLine());
		    System.out.println("Name of the painting ");
		    newPainting.setPaintingName(myObject.nextLine());
		    System.out.println("Year done: ");
		    newPainting.setYearDone(myObject.nextInt());
		    newPainting.printPaintingInfo();
	  }//3pair end
	  
	  static void collectBasicInfo()
	  
	  {
		    Item newItem = new Item();
		    Scanner myObject = new Scanner(System.in);
		    System.out.println("Name of the item: ");
		    newItem.setName(myObject.nextLine());
		    System.out.println("Price of the item: ");
		    newItem.setPrice(myObject.nextDouble());
		    System.out.println("Year of purchase: ");
		    newItem.setPurchaseYear(myObject.nextInt());
		    newItem.printAddedItem();
		    
	  }
}//1pairend
