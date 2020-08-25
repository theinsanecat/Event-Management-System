import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		EventManipulation x = new EventManipulation();
		Scanner sc = new Scanner(System.in);
		ArrayList<Event> list = new ArrayList<Event>();

		while (true) {
			int choice = mainMenu(sc);
			switch (choice) {
			case 1:
				x.inputEvent(sc, list);

				break;

			case 2:
				System.out.println("\n*************************All Events*************************\n");

				x.displayData(list);
				break;

			case 3:
				System.out.println("Enter the Id of the event you want to change :");
				int editId = sc.nextInt();
				for (int u = 0; u < list.size(); u++) {
					if (editId == list.get(u).getId()) {

						System.out.println("Which part you want to change?:" + "\n1. Title" + "\n2. Footfall"
								+ "\n3. Date" + "\nEnter your choice :");
						int choice1 = sc.nextInt();
						switch (choice1) {
						case 1:
							// Updates an exiting Event Title to a new one
							x.changeTitle(sc, list, u);
							break;
						case 2:
							// Updates the count of people attending the Event
							x.changeFootfall(sc, list, u);
							break;
						case 3:
							// Updates the date of the Event
							x.changeDate(sc, list, u);
							list.get(u).display(list);
							break;
						}
					}
				}
				break;

			case 4:
				// Deletes an Event
				x.deleteEvent(sc, list);
				break;

			case 5:
				// Searches an Event in the event list for corresponding values of ID/Title/Footfall 
				x.searchEvent(sc, list);
				break;
			}

		}

	}

	private static int mainMenu(Scanner sc) {
		System.out.println("\n*.--.--.--.--.--.--.--.--.--.--.--.--.--.--.--.--.--.--.--.--.--.*");
		System.out.println("\t\t\tEnter the Choice:");
		System.out.println("\n1) Enter an Event" + "\n2) List all Events" + "\n3) Update an Event"
				+ "\n4) Delete an Event" + "\n5) Search Event");
		int choice = sc.nextInt();
		return choice;
	}

}
