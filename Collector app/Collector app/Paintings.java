
public class Paintings extends Item
{
	//variables of the subclass
		private String artist;
		private String paintingName;
		private int yearDone;
		private double stock;
	
		
		//constructor
		Paintings()
		{
			artist="";
			paintingName="";
			yearDone=0;
			stock=0.0;
			
		}
		//methods 
		// all "set" methods first, then all "get"methods
		
		  public void setArtist(String newArtist) 
		  {
			    this.artist = newArtist;
	      }
		  public void setPaintingName(String newPName) 
		  {
			    this.paintingName = newPName;
	      }
		  public void setYearDone(int newYear) 
		  {
			    this.yearDone = newYear;
	      }
		  
		  // Getter
		  public String getArtist() 
		  	{
			  return artist;
		  	}
		  // Getter
		  public String getPaintingName() 
		  	{
			  return paintingName;
		  	}
		  // Getter
		  public int getYearDone() 
		  	{
			  return yearDone;
		  	}
		  public void listArtists()
		  {
			  
			  ///zzzzz
		  }
		  
		  public void searchArtist(String searchByName)
		  {
			  
			  ///zzzzz
		  }
	//I wanto to see what is value of my stock, I will add to diagram method what will calculate the sum of stock and return value
		  
		  public double stockValue()
		  
		  {
			  //some fancy code
			return stock;
			  
		  }
		  public void printPaintingInfo()
		  {
			  
			  System.out.println("New Paining added\nPainting info: \n"+getArtist()+"\n"+getYearDone()+"\n"+getPaintingName());
		  }
		  
		  
	}
