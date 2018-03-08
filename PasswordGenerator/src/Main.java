import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) {
		FileService file = new FileService();
		Generator g = new Generator();
		try {
			String string = file.ReadFromFile(3);	//pick an option [1-3]
			System.out.println("Dictionary: " +string);	//print a dictionary
			System.out.println(g.generator(string, 50));	//create a password of given length from dictionary
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
