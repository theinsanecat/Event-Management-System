import java.time.LocalDate;
import java.util.ArrayList;

public class Event {
	private String title;
	private LocalDate date;
	private int id, no_of_people;
	private String[] artist;

	public Event() {

	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public void setArtist(String[] artist) {
		this.artist = new String[artist.length];
		System.arraycopy(artist, 0, this.artist, 0, artist.length);
		// this.artist=artist;
	}

	public void setNo_of_people(int no_of_people) {
		this.no_of_people = no_of_people;
	}

	public String getTitle() {
		return title;
	}

	public int getId() {
		return this.id;
	}

	public LocalDate getDate() {
		return this.date;
	}

	public String[] getArtist() {
		String[] copy = new String[this.artist.length];
		System.arraycopy(this.artist, 0, copy, 0, copy.length);
		return copy;

	}

	public int getNo_of_people() {
		return this.no_of_people;
	}

	public void display(ArrayList<Event> list) {
		System.out.println("_______________________________________________________");
		System.out.println("\nID" + "  |" + "\tTitle" + "  |" + "  Footfall:");
		System.out.println(this.id + "   |" + "\t" + this.title + "      |" + "\t" + this.no_of_people);
		System.out.println("\nDate: "+this.date);
		System.out.println("\nArtist/Artist:");
		String[] arr = this.artist;
		for (String ele : arr)
			System.out.println(ele);
		System.out.println("_______________________________________________________");

	}

}
