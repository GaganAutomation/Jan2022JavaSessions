package stringManuplation;

public class longestWord {
	
	public static String StringChallenge(String sen) {
		int i=0;
	//	String sen = "I love dogs";
		
		
		String str = sen.replaceAll("[^a-zA-Z0-9]", " ");
		String[] a = str.split(" ");
		String longestWord = a[0];
		
		
		for( i=0; i<a.length;i++) {
			
			if(a[i].length()>longestWord.length()) {
				longestWord = a[i];
		}
			
	  }
			return longestWord;
	}
	

	public static void main(String[] args) {
		
	String first = StringChallenge("Fog!!$ time");
	System.out.println(first);
		
		
	}

}
