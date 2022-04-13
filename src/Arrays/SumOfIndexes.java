package Arrays;

public class SumOfIndexes {
	
	public static void main(String[] args) {
		int sum = 0;
		int[] a = {1,2,3,4,5};
		System.out.println(a.length);
		
		for(int i=0; i<=a.length-1;i++) {
			
			 sum = sum + a[i];
		}
		
		System.out.println(sum);
	}

}
