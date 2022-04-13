package stringManuplation;

public class NonRepeatedString {
	
	public static void main(String[] args) {
		
		
		String str = "jjaavaa";
		
		
		for(char ch : str.toCharArray()) {
			int a = str.indexOf(ch);
			int b = str.lastIndexOf(ch);
			if(str.indexOf(ch)==str.lastIndexOf(ch)) {
				System.out.println(ch);
			}
		}
	}

}
