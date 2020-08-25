import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class EventManipulation implements Event_Management_Interface {

	public void displayData(ArrayList<Event> list) {

		for (int u = 0; u < list.size(); u++) {
			System.out.println("_______________________________________________________");
			System.out.println("\nID" + "   | " + " Title" + "   |" + "  Footfall:");
			System.out.println(list.get(u).getId() + "\t" + list.get(u).getTitle() + "\t"
					+ "    "+list.get(u).getNo_of_people());
			System.out.println("\nDate: "+list.get(u).getDate());
			System.out.println("\nArtist/Artist:");
			String[] arr = list.get(u).getArtist();
			for (String ele : arr)
				System.out.println(ele);

		}
		System.out.println("_______________________________________________________");
	}

	public void deleteEvent(Scanner sc, ArrayList<Event> list) {
		System.out.println("Enter the Event Id you want to delete:");
		int delevent = sc.nextInt();
		for (int u = 0; u < list.size(); u++)
			if (delevent == list.get(u).getId()) {
				list.remove(list.get(u));
			}
	}

	public void searchEvent(Scanner sc, ArrayList<Event> list) {
		sc = new Scanner(System.in);
		System.out.println("Enter anything from :\n1.Id\n2.Title\n3.Footfall \nfor the Event you want to search:");
		int ans = sc.nextInt();
		boolean tag=false;
		switch (ans) {
		case 1:
			int searchid=0;
			do {
				try {
			
			System.out.println("Enter the Event ID you want to search :");
			searchid = sc.nextInt();break;}catch(Exception e) {
				System.out.println("Incorrect ID!!");
			}tag=true;
			}while(tag);
			for (int u = 0; u < list.size(); u++) {
				if (searchid == list.get(u).getId())
					list.get(u).display(list);
				else
					System.out.println("your Event does not exist, please make an Entry!");
				
			}break;
		case 2:
			System.out.println("Enter the Event title you want to search :");
			String searchtit = sc.next();
			for (int u = 0; u < list.size(); u++) {
				if (searchtit.equals(list.get(u).getTitle()))
					list.get(u).display(list);
				else
					System.out.println("your Event does not exist, please make an Entry!");
				
			}break;
		case 3:
			int searchfootfall=0;
			do {try {
			System.out.println("Enter the Event footfall you want to search :");
			 searchfootfall = sc.nextInt();break;}
			catch(Exception e) {
				 System.out.println("Footfall should be a numerical value!!");}tag=true;
			}while(tag);
			for (int u = 0; u < list.size(); u++) {
				if (searchfootfall == list.get(u).getNo_of_people())
					list.get(u).display(list);
				else
					System.out.println("your Event does not exist, please make an Entry!");
				
			}break;

		}
	}

	public void inputEvent(Scanner sc, ArrayList<Event> list) {
		boolean status = false;
		int entries=0;
		do {
			try {
			sc=new Scanner(System.in);
		System.out.println("How many Events you want to register?");
		entries = sc.nextInt();break;}
			catch(Exception e)
			{
				System.out.println("Number of Events should be a numerical value!!");
			}status=true;
		}while(status);
		int newid = 0;
		for (int i = 0; i < entries; i++) {
			Event eve = new Event();
			System.out.println("Enter the Title:");
			String newtit = sc.next();
			eve.setTitle(newtit);
			boolean dummy=false;
			do {
				try {sc=new Scanner(System.in);
			System.out.println("Enter the Footfall:");
			int f = sc.nextInt();
			eve.setNo_of_people(f);break;
				}
				catch(Exception e) {
					System.out.println("Footfall should be a number!!");
				}dummy=true;
			}while(dummy);
			boolean hot=false;
			int a=0;
			do {
				try {sc= new Scanner(System.in);
			
			System.out.println("Enter the number of Artist/Artists:");
			a = sc.nextInt();break;}
				catch(Exception e) {
					System.out.println("Number of atrists should be a numerical value!!");
				}hot = true;
				}while(hot);
			System.out.println("Enter the Artist/Artists:");
			String[] newart = new String[a];
			for (int j = 0; j < a; j++) {
				newart[j] = sc.next();
			}
			eve.setArtist(newart);
			LocalDate d = null;
			boolean flag = false;
			do {
				System.out.println("\nEnter the date(m/d/yyyy):");
				String newdate = sc.next();
				DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("M/d/yyyy");

				try {
					// Parsing the String
					d = LocalDate.parse(newdate, dateFormat);;
					eve.setDate(d);
					break;
				} catch (Exception e) {
					System.out.println("Incorrect Date!");

				}
				flag = true;

			} while (flag);
			list.add(eve);
			newid += 1;
			eve.setId(newid);

		}
	
	}
	public void changeFootfall(Scanner sc, ArrayList<Event> list, int u) {
		boolean dummy=false;
		do {
			try {sc=new Scanner(System.in);
		System.out.println("Enter the new Footfall:");
		int changefootfall = sc.nextInt();
		list.get(u).setNo_of_people(changefootfall);break;
			}
			catch(Exception e) {
				System.out.println("Footfall should be a number!!");
			}dummy=true;
		}while(dummy);
}

	public void changeTitle(Scanner sc, ArrayList<Event> list, int u) {
		System.out.println("Enter the new Title:");
		String changetitle = sc.next();
		list.get(u).setTitle(changetitle);
	}

	public void changeDate(Scanner sc, ArrayList<Event> list, int u) {

		LocalDate d = null;
		boolean tag = false;
		do {

			try {
				sc = new Scanner(System.in);

				 DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("M/d/yyyy");
				System.out.println("Enter the new Date(dd-mm-yy):");
				String changedate = sc.next();
				System.out.println(".next()");

				d = LocalDate.parse(changedate, dateFormat);

				for (u = 0; u < list.size(); u++) {

					list.get(u).setDate(d);

				}
				break;
			} catch (Exception e) {
				System.out.println("Incorrect Date!");
			}
			tag = true;

		} while (tag);
	}

}
