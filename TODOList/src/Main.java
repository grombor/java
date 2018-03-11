import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedHashSet;

public class Main {

	public static void main(String[] args) throws ParseException {
		LinkedHashSet<Task> taskList = new LinkedHashSet<>();
		TCollection tasks = new TCollection();
		
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		
		taskList.add(new Task(1, "Make a bed tidy", format.parse("11-03-2018")));
		taskList.add(new Task(2, "ShTidy up the wash", format.parse("11-03-2018")));
		
		tasks.setList(taskList);
		tasks.printList(taskList);
		
	}

}
