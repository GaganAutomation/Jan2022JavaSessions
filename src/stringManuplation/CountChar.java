package stringManuplation;

public class CountChar {

	public static void main(String[] args) {
		
		String str = "123456789";
		int count = 0;
		
		for(char ch : str.toCharArray()) {
			
			count++;
		}
		
		System.out.println(count);
	}
}
