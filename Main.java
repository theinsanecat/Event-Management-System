import java.util.*;


public class Main extends Event {
	 

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		//String[] array=new String[5];
		
		ArrayList<Event> list = new ArrayList<Event>();
		
		
		while(true)
		{
		System.out.println("****************************************************************");	
		System.out.println("Enter the choice:");
		System.out.println("1) Enter an event"+"\n2) List all events" + "\n3) Update an event" + "\n4) Delete an event" + "\n5) Search event");
        int choice=sc.nextInt();
        switch(choice)
        {
        case 1: System.out.println("How many Events you want to register?");
                int entries=sc.nextInt();
                
                for(int i=0;i<entries;i++)
                { 
                	Event eve = new Event();
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
                    System.out.println("Enter the date(dd-mm-yy):");
                    String newdate=sc.next();
                    eve.setDate(newdate);
                    array=newart;
                    list.add(eve);
                	
                }
                
                
               
                break;
        
        
        case 2: for(int u=0;u<list.size();u++)
        {
        	
        	System.out.println("ID:"+list.get(u).getId()+"\nTitle:"+list.get(u).getTitle()+"\nFootfall:"+list.get(u).getNo_of_people()+"\nDate:"+list.get(u).getDate());
        	System.out.println("Artist/Artist:");
		String[] arr=list.get(u).getArtist();
        	for(String ele:arr)
        	{
        	System.out.println(ele);
        	}
        }
        	break;
        
        case 3: System.out.println("Enter the Id of the event you want to change :");
                int editId = sc.nextInt();
                for(int u=0;u<list.size();u++)
                {
                if(editId==list.get(u).getId())
                {
//                	int index=list.indexOf(eve);
                	
                	System.out.println("Which part you want to change?:"+"\n1. Id"+"\n2. Title"+"\n3. Footfall"+"\n4. Date"+"\nEnter your choice :");
                	int choice1=sc.nextInt();
                	Event temp=new Event();
                	switch(choice1)
                	{
                	case 1: System.out.println("Enter the new Id:");
                	        int changeid=sc.nextInt();                	        
                	        list.get(u).setId(changeid);
                	        temp.displayData(list);break;
                	    
                	case 2: System.out.println("Enter the new Title:");
        	        		String changetitle=sc.next();
        	                list.get(u).setTitle(changetitle);
        	        		temp.displayData(list);break;
        	        		
//        	        		
                	case 3: System.out.println("Enter the new Footfall:");			
                			int changefootfall=sc.nextInt();
                			list.get(u).setNo_of_people(changefootfall);
        	        		temp.displayData(list);
                			break;
                			
                	case 4: System.out.println("Enter the new Date(dd-mm-yy):");
                			String changedate=sc.next();
                			list.get(u).setDate(changedate);
        	        		temp.displayData(list);
                		
                			break;
                		
                	}
                	
                	
                	
                }}break;
                
       case 4: System.out.println("Enter the Event Id you want to delete:");
               int delevent=sc.nextInt();
               for(int u=0;u<list.size();u++)
               if(delevent==list.get(u).getId())
               {
               	 list.remove(list.get(u));
               }break;
               
               
       case 5: System.out.println("Enter anything from(Id,Title,Footfall) for the Event you want to search:");
               String ans= sc.next();
               for(int u=0;u<list.size();u++)
               {
            	 Integer searchfootfall=list.get(u).getNo_of_people();
            	 String searchtit=list.get(u).getTitle();  
            	 Integer var=list.get(u).getId();  
               if(ans.equals(var.toString()))
            	   list.get(u).display();
               else if(ans.equals(searchtit))
            	   list.get(u).display();
               else if(ans.equals(searchfootfall.toString()))
            	   list.get(u).display();
               
            	  
               }break;

        
        }
        
    }
		
	}
}
