package String;

public class FindDuplicates {

	public static void main(String[] args) {

		String str = "Thiis is google.";
		
		int count = 0;
		
		char[] ch = str.toCharArray();
		
		for(int i=0; i<ch.length;i++) {
			for(int j=i+1; j<ch.length; j++) {
				if(ch[i]==ch[j]) {
					System.out.println("Duplicate character are: "+ch[j]);
					count++;
				}
				
			}
		}
		
		System.out.println("Count is: "+count);
	}
}
