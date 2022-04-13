package ExceptionHadling;

public class ExceptionHandeling {
	
	public static void main(String[] args) {
		int[] ar = new int[2];
		
		System.out.println("Hi..");
		
		try {
		int i = 9/0;
		
		}
		
		catch(ArithmeticException e) {
			e.printStackTrace();
			
			try {
			ar[5] = 10;
			}
			
			catch(ArrayIndexOutOfBoundsException e1) {
				e1.printStackTrace();
			}
		}
		
		
		System.out.println("Bye...");
	}

}
