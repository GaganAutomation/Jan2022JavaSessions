package fileHandeling;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static File file;

	public static void main(String[] args) throws IOException {

		file = new File("C:\\Users\\gagan.tyagi\\testFile.txt");
		if (file.createNewFile()) {
			System.out.println("file created..");
		} else
			System.out.println("file already exist..");

	}
}
