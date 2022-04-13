package javasession;

public class A {
	
	public static void main(String[] args) {
		try {
		throw new Exception();
		}
		catch(Exception e) {
			
			System.out.println("Got the exception"+e);
		}
	}

}
