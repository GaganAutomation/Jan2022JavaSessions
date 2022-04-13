package String;

import java.util.Scanner;

public class FindIndex {
	public static void main(String[] args) {

		String str = "Hello Java";
		char c = 0;

		System.out.println("Please enter the position");
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();

		for (int i = 0; i <= str.length(); i++) {

			if (p >= 0 && p <= 9) {
				c = str.charAt(p);
			}

			else {

				try {
					throw new Exception();
				} catch (Exception e) {
					System.out.println("Please pass position between 0 to 9");
					System.exit(0);
				}
			}

		}

		System.out.println("Character at position " + p + " is " + c);
	}

}
