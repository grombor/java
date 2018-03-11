import java.text.SimpleDateFormat;
import java.util.Date;

public class Task {

	private int ID;
	private String description;
	private Date date;
	
	public Task(int id, String description, Date date) {
		this.ID = id;
		this.description = description;
		this.date = date;
	}

	public int getID() {
		return ID;
	}

	public String getDescription() {
		return description;
	}

	public String getDate() {
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		return format.format(this.date);
	}
	
	
}
