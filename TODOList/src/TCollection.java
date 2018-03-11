import java.util.HashSet;
import java.util.LinkedHashSet;

public class TCollection{
	private LinkedHashSet<Task> taskList = new LinkedHashSet<Task> ();

	public HashSet<Task> getList() {
		return taskList;
	}

	public void setList(LinkedHashSet<Task> list) {
		this.taskList = list;
	}
	
	public void printList (HashSet<Task> list) {
		
		list.forEach(t -> System.out.println(
				t.getID() + ": " 
				+ t.getDescription() 
				+ "\n\tdeadline: "
				+ t.getDate()));
		
//		for (Task t : taskList) {
//			System.out.println(t.getID() + ": " + t.getDescription());
//		}
	}
}
