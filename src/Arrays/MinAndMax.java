package Arrays;

import java.util.Scanner;

public class MinAndMax {

	public static void main(String[] args) {
		int i;
		int min;
		int max;

		System.out.println("Please enter the size of an array..");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int a[] = new int[n];
		System.out.println("Please enter the elements of an array..");

		for (i = 0; i <= a.length - 1; i++) {
			a[i] = sc.nextInt();
		}

		max = a[0];

		for (int j = 0; j <= a.length - 1; j++) {
			if (a[j] > max) {
				max = a[j];
			}
		}

		System.out.println("Max--" + max);

		min = a[0];

		for (int j = 0; j <= a.length - 1; j++) {
			if (a[j] < min) {
				min = a[j];
			}
		}

		System.out.println("Min - " + min);

	}

}
