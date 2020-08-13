import java.util.*;


public class Main extends Event {


	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		//Retrievedata obj = new Retrievedata();
		
		Event eve = new Event();
		ArrayList<Event> list = new ArrayList<Event>();
		
		
		while(true)
		{
		System.out.println("Enter the choice:");
		System.out.println("1) Enter an event"+"\n2) List all events" + "\n3) Update an event" + "\n4) Delete an event" + "\n5) Search event");
        int choice=sc.nextInt();
        switch(choice)
        {
        case 1: System.out.println("How many Events you want to register?");
                int entries=sc.nextInt();
                
                for(int i=0;i<entries;i++)
                {
                	System.out.println("Enter the Event Id:");
                    int newid=sc.nextInt();
                    eve.setId(newid);
                    System.out.println("Enter the Title:");
                    String newtit=sc.next();
                    eve.setTitle(newtit);
                    System.out.println("Enter the Footfall:");
                    int f=sc.nextInt();
                    eve.setNo_of_people(f);
                    System.out.println("Enter the number of Artist/Artists:");
                    int a=sc.nextInt();
                    System.out.println("Enter the Artist/Artists:");
                    String[] newart=new String[a];
                    for(int j=0;j<a;j++)
                    {
                    newart[j]=sc.next();
                    }
                    eve.setArtist(newart);
                    System.out.println("Enter the date:");
                    String newdate=sc.next();
                    eve.setDate(newdate);
                    
                    list.add(eve);
                	
                }
                Event x = new Event();
                x.displayData(list);
                break;
        
        
        case 2: System.out.println("The list of all events :");
                Event y = new Event();
                y.displayData(list);break;
        
        case 3: System.out.println("Enter the Id of the event you want to change :");
                int editId = sc.nextInt();
                Event temp=new Event();
                if(editId==temp.getId())
                {
                	int index=list.indexOf(temp);
                	//String cell = list.get(index);
                	//System.out.println(cell);
                	System.out.println("Which part you want to change?:"+"\n1. Id"+"\n2. Title"+"\n3. Footfall"+"\n4. Date"+"\nEnter your choice :");
                	int choice1=sc.nextInt();
                	switch(choice1)
                	{
                	case 1: System.out.println("Enter the new Id:");
                	        int changeid=sc.nextInt();
                	        
                	        temp.setId(changeid);
                	        temp.display();break;
                	      
                	case 2: System.out.println("Enter the new Title:");
        	        		String changetitle=sc.next();
        	        
        	        		temp.setTitle(changetitle);
        	        		temp.display();break;
        	            
                	}
                	
                	
                	
                }
                
       case 4: System.out.println("hi");break;
       case 5: System.out.println("hi");break;
        
        
        
        
        
        
        
        
        
        
        
        
        
        }
        
    }
		
	}
}
