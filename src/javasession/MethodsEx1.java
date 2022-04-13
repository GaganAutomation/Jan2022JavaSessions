package javasession;

import java.util.Scanner;

public class MethodsEx1 {
	
	static Scanner sc;
	
	public int sum() {
		System.out.println("Please enter the value of a and b");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = a+b;
		return sum;
	}

	public int product() {
		System.out.println("Please enter the value of c and d");
		int c = sc.nextInt();
		int d = sc.nextInt();
		int prod = c*d;
		return prod;
	}
	
	public double circle() {
		System.out.println("Please enter the radius of the circle... ");
		int radius = sc.nextInt();
		double circum = 2*3.14*radius;
		double area = 3.14*radius*radius;
		while(true) {
		System.out.println("Please type below keywords in order to get the results:"
				+ "\nTo get circumference type: 'cir'"
				+ "\nTo get area please type: 'area'");
		
		String key = sc.next();
		
		switch (key.toLowerCase().trim()) {
		case "cir":
			System.out.println("Circumference is: "+circum);
			return circum;
			
		case "area":
			System.out.println("Area is: "+area);
			return area;

		default:
			System.out.println("Please enter correct keyword..");
			break;
			
		}
		continue;
	}
		
}
	
	public void Maximum() {
		System.out.println("Please enter 3 numbers..");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println(a+" is greatest");
		}
		else if(b>c)
		{
			System.out.println(b+" is greatest");
		}
		else {
			System.out.println(c+" is greatest");
		}
	}
	
	public void Minimum() {

		System.out.println("Please enter 3 numbers..");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a<b && a<c) {
			System.out.println(a+" is Smallest");
		}
		else if(b<c)
		{
			System.out.println(b+" is smallest");
		}
		else {
			System.out.println(c+" is smallest");
		}
	}
	
	public void checkEvenOdd() {
		System.out.println("Please enter a number");
		int num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
	}
	
	public void checkAge() {
		System.out.println("Please enter your age");
		int age = sc.nextInt();
		
		if(age>=18) {
			System.out.println("elligible to vote.");
		}
		else {
			System.out.println("Not elligible");
		}
	}
	
	public void checkPrime() {
		boolean flag = false;
		System.out.println("Please enter the number");
		int num = sc.nextInt();
		
		for(int i=2; i<num/2; i++) {
			//int div = num/2;
			if(num%i==0)
			{
			   flag = true;
			   break;
			}	
		}
		
		if(flag) {
			System.out.println("Not a prime");
		}else {
			System.out.println("Prime");
		}
	}

	public void checkGrade() {
		System.out.println("Please enter marks..");
		int marks = sc.nextInt();
		
		if(marks>90 && marks<=100) {
			System.out.println("AA");
		}else if(marks>80 && marks<90) {
			System.out.println("AB");
		}else if(marks>70 && marks<80){
			
		}
	}
	
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);	
		
		MethodsEx1 m = new MethodsEx1();
		/*
		 * int result = m.sum(); System.out.println("Sum of a and b are: "+result);
		 * 
		 * MethodsEx1 m1 = new MethodsEx1(); int result1 = m1.product();
		 * System.out.println("Product of c and d are: "+result1);
		 */
		
		// m.circle();
		//m.Maximum();
		//m.Minimum();
		//m.checkEvenOdd();
		//m.checkAge();
	     m.checkPrime();
		

	}

}
