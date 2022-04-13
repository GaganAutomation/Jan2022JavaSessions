package stringManuplation;

public class FindDuplicate {
	
	public static void main(String[] args) {

		String str1 = "";
		
		String str = "Thee Odd numberr iss odd";
		
		int count = 0;
		
		for(char c : str.toCharArray()) {
			
		if(str.indexOf(c)==str.lastIndexOf(c)) {
		    
			str1 = c + ", ";
		}
			
	}
		
		System.out.println(str1);
		
	}
	
}
