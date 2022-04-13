package Test;

public class Main {

	public static void MathChallenge(int num) {
		int sum = 0;
		String str = "egdr451t8";
		int j;

		for (int i = 1; i <= num; i++) {
			sum = sum + i;

		}

		String str1 = String.valueOf(sum);

		for (int i = 0; i <= str1.length() - 1; i++) {

			for (j = 0; j < str.length(); j++) {

				if (i == 0 || j == 1) {
					System.out.print(str1.charAt(i));
					if (!(j == 1)) {
						break;
					}
				} else {
					System.out.print(str.charAt(j));
				}

			}

		}

	}

	public static void main(String[] args) {
		MathChallenge(12);

	}

}
