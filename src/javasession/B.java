package javasession;

public class B {

	public static void main(String[] args) {

		int num = 7898;
		int rev = 0;

		while (num > 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num /= 10;
		}
		
		System.out.println(rev);
		
		//System.out.println(7/10);

	}
}
