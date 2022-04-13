package Arrays;

import java.util.Scanner;

public class FindOccurance {

	static int number;

	public static void main(String[] args) {

		FindOccurance f = new FindOccurance();
		int freq = f.findFrequency();
		System.out.println("Frequency of " + number + " is " + freq);

	}

	public int findFrequency() {
		System.out.println("Please enter the number that u want to find..");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		number = num;
		int count = 0;

		int[] arr = { 1, 1, 1, 1, 5, 4 };

		for (int e : arr) {

			if (e == num) {
				count++;
			}
		}

		return count;

	}
}
