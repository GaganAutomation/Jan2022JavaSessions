package DataTypeConversion;

public class Conversion {
	

	
	public static void main(String[] args) {
		
		
		//String to int.
		String s = "100";
		System.out.println(s+20);
		int a = Integer.parseInt(s);
		System.out.println(a+20);
		
		//int to String.
		int i = 200;
		System.out.println(i+10);
		String t = String.valueOf(i);
		System.out.println(t+10);
		
		String p = "AA100";
		//int r = Integer.parseInt(p);
		//System.out.println(r);
		
			
		// Escape character 
		String j = "Hi \"this\" is java";
		System.out.println(j);
		
		
			
		
	}

}
