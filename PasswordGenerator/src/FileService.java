import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileService {
	
	public String ReadFromFile (int o) throws FileNotFoundException {
		int option;
		String password;
		option = o;
		switch (o) {
		case 1:
			return password=read(o);
		case 2:
			return password=read(o);
		default:
			System.out.println("Reading finished");
			return ("Error");
		}
		
	}

	private String read(int numOfLines) {
		String result = "";
		StringBuilder sb = null;
		BufferedReader br = null;
		try {
			sb = new StringBuilder(result);
			br = new BufferedReader(new FileReader("dictionary.txt"));
			for (int i = 0; i < numOfLines; i++) {
				sb.append(br.readLine());
			}
			result = sb.toString().toString();
			return result;
		} catch (IOException e) {
			e.printStackTrace();
			return "Error";
		}
		finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
		
		
	}
}
