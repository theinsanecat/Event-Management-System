import java.util.*;

public interface Event_Management_Interface {

	void displayData(ArrayList<Event> l);

	void inputEvent(Scanner sc, ArrayList<Event> list);

	void deleteEvent(Scanner sc, ArrayList<Event> list);

	void searchEvent(Scanner sc, ArrayList<Event> list);

	void changeFootfall(Scanner sc, ArrayList<Event> list, int u);

	void changeTitle(Scanner sc, ArrayList<Event> list, int u);

	void changeDate(Scanner sc, ArrayList<Event> list, int u);
}
