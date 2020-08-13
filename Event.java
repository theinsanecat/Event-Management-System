import java.util.*;

public class Event implements Event_Management_Interface {
	private String title,date;
	private int id,no_of_people;
	private String[] artist;
	
	public Event()
	{
		
	}
	
	public Event(int id,String title,int no_of_people,String[] artist,String date)
	{
		this.id=id;
		this.title=title;
		this.no_of_people=no_of_people;
		this.artist=artist;
		this.date=date;
	}
	

public void setTitle(String title)
{
	this.title=title;
}
public void setId(int id)
{
	this.id=id;
}
public void setDate(String date)
{
     this.date=date;
}
public void setArtist(String[] artist)
{
	this.artist=artist;
}
public void setNo_of_people(int no_of_people)
{
	this.no_of_people=no_of_people;
}
public String getTitle()
{
	return title;
}
public int getId()
{
	return id;
}
public String getDate()
{
     return date;
}
public String[] getArtist()
{
	return artist;
}
public int getNo_of_people()
{
	return no_of_people;
}



public void display()
{
	//Retrievedata rdata= new Retrievedata();
	//ArrayList<Event> listeve= rdata.addData();
	System.out.println("Event Id :"+this.id+"\nTitle : "+this.title+"\nDate : "+this.date+"\nArtist : "+this.artist+"\nFootfall : "+this.no_of_people);
	
}

void displayData(ArrayList<Event> list)
{ 
  System.out.println("************Event Detail************"); 
  for(Event et: list )
  {
	  System.out.println("Event Id :"+et.id+"\nTitle : "+et.title+"\nDate : "+et.date+"\nArtist : "+et.artist+"\nFootfall : "+et.no_of_people);
		 
  }

}
}