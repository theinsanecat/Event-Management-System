import java.util.*;

public class Event implements Event_Management_Interface {
	private String title,date;
	private int id,no_of_people;
	private String[] artist;
	
	public Event()
	{
		
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
	this.artist = new String[artist.length];
        System.arraycopy(artist, 0, this.artist, 0, artist.length);
	//this.artist=artist;
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
	return this.id;
}
public String getDate()
{
     return this.date;
}
public String[] getArtist()
{
	String[] copy = new String[this.artist.length];
        System.arraycopy(this.artist, 0, copy, 0, copy.length);
        return copy;
	//return this.artist;
}
public int getNo_of_people()
{
	return this.no_of_people;
}



public void display()
{
	//Retrievedata rdata= new Retrievedata();
	//ArrayList<Event> listeve= rdata.addData();
	System.out.println("Event Id :"+this.id+"\nTitle : "+this.title+"\nDate : "+this.date+"\nArtist : "+this.artist+"\nFootfall : "+this.no_of_people);
	
}

public void displayData(ArrayList<Event> list)
{ 
  System.out.println("************Event Detail************"); 
  for(int u=0;u<list.size();u++)
  {
	  System.out.println("ID:"+list.get(u).getId()+"\nTitle:"+list.get(u).getTitle()+"\nFootfall:"+list.get(u).getNo_of_people()+"\nDate:"+list.get(u).getDate());
  	  System.out.println("Artist/Artist:");
  	  String[] arr=list.get(u).getArtist();
	
	  for(String ele:arr)
		  System.out.println(ele);
  } 

}
}
