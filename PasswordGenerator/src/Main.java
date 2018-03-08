import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) {
		FileService file = new FileService();
		try {
			String string = file.ReadFromFile(3);
			System.out.println(string);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
