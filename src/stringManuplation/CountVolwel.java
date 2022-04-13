package stringManuplation;

public class CountVolwel {
	
	public static void main(String[] args) {
		
		String str = "this is what you feel";
		str = str.toLowerCase();
		int count = 0;
		
		for(char ch : str.toCharArray()) {
			
			if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
