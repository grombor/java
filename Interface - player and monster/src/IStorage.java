import java.util.List;

public interface IStorage {
	List<String> write();
	void read(List<String> savedValues);
	
	
}
