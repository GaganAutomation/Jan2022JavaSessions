package fileHandeling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFile extends WriteInFile {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileReader fr = new FileReader("C:\\Users\\gagan.tyagi\\textwrite.txt");
		
		
	}
}
