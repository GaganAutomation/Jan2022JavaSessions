package fileHandeling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteInFile {

	public static FileWriter fw;

	public static void main(String[] args) throws IOException {

		String string = "This is first line..";

		try {

			fw = new FileWriter("C:\\Users\\gagan.tyagi\\textwrite.txt");

		} catch (IOException e) {

			e.printStackTrace();
		}

		try {
			fw.write(string);
		} catch (IOException e) {
			e.printStackTrace();
		}
		fw.close();
		System.out.println("Writing operation successful");
	}

}
