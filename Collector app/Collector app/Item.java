//Superclass
public class Item 
{
	//variables of the superclass
	private String name;
	private int purchaseYear;
	private double price;
	private double stock;
	
	//constructor
	Item()
	{
		name="";
		purchaseYear=2022;
		price=0.00;
		
		
	}
	//methods 
	// all "set" methods first, then all "get"methods
	
	  public void setName(String newName) 
	  {
		    this.name = newName;
      }
	  public void setPurchaseYear(int newPYear) 
	  {
		    this.purchaseYear = newPYear;
      }
	  public void setPrice(double newPrice) 
	  {
		    this.price = newPrice;
      }
	  
	  // Getter
	  public String getName() 
	  	{
		  return name;
	  	}
	  // Getter
	  public int getPurchaseYear() 
	  	{
		  return purchaseYear;
	  	}
	  // Getter
	  public Double getPrice() 
	  	{
		  return price;
	  	}
	  public void printAddedItem()
	  {
		  
		  System.out.println("\n*************\nNew product: \n"+getName()+
				  "\n"+getPrice()+"\n"+getPurchaseYear()+"\n**************");
	  }

	  
	  
	  
}
