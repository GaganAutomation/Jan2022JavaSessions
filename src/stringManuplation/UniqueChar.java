package stringManuplation;

public class UniqueChar {

	public static void main(String[] args) {

		String str = "Jafb";
		
		boolean isunique = false;
		
		for(char ch : str.toCharArray()) {
			
			if(str.indexOf(ch)==str.lastIndexOf(ch)) {
				
				isunique = true;
				
			}
			else {
				isunique = false;
				break;
			}
			
			
		}
		
		if(isunique) {
			
			
			System.out.println("String has all unique characters");
		}
		
		else {
			System.out.println("String is not Unique charactes");
		}
	}

}
