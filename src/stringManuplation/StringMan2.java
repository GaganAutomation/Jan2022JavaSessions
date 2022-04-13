package stringManuplation;

public class StringMan2 {

	public static void main(String[] args) {
		
		String str = "this is this and this is this....";
		
		int count = 0;
		
		for(char ch : str.toCharArray()) {
			if(ch=='i') {
				count++;
			}
		}
		System.out.println(count);
		
	}
	
}
