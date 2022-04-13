package javasession;

import java.util.Scanner;

public class Assignments {
	
	public static void main(String[] args) {
		
		//1. WAP to print I am Batman
		
		for(int i=0;i<=10;i++) {
			System.out.println("I am Batman");
		}
		System.out.println("=======================");
		/*2. WAP to print following output:
			I am Batman 1
			I am Batman 2
			I am Batman 3
			I am Batman 4
		*/
		for(int i=1;i<=10;i++) {
			System.out.println("I am Batman"+" "+ i);
		}
		
		System.out.println("=======================");
		
		//3.WAP to print 10 to 1 using for, while and do-while loop
		
		for(int i=10;i>=1;i--) {
			System.out.println(i);
		}
		
		System.out.println("=======================");
		
		int i=10;
		while(i>=1) {
			System.out.println(i);
			i--;
		}
		
		System.out.println("=======================");
		
		int j =10;
		do {
			System.out.println(j);
			j--;
		}while(j>=1);
		
		System.out.println("=======================");
		
		//4. Write a program in Java to print "Hello World" ten times using while loop
		
		int k = 1;
		while(k<=10) {
			System.out.println(k+"."+"Hello World");
			k++;
		}
		
		System.out.println("=======================");
		
		//5. WAP to find out the max number from the given positive numbers in static array.
		
		int[] array = new int[5];
		array[0] = 10;
		array[1] = 1;
		array[2] = 200;
		array[3] = 30;
		array[4] = 40;
		
		int num = array[0];
		
		for(int m=0;m<array.length;m++) {
			if(array[m]>num)
			{
				num = array[m];
			}
							
	}
		System.out.println(num);
		
		//6. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
		
		System.out.println("Hello"
				+ "\nGagan Tyagi");
		
		//7. Write a Java program to print the sum of two numbers. 
		
		int a = 74;
		int b = 36;
		System.out.println("Sum of a and b:"+(a+b));

		//8. Write a Java program to divide two numbers and print on the screen. 
		
		int c = 50;
		int d = 3;
		System.out.println("Divisible of c and d: "+(c/d));
		
		//9. Try to concat "Hello Selenium" with a character 't'.
		
		char t = '1';
		String s = "Hello selenium";
		System.out.println(s+t);
		
		//10. Write a Java program to test a number is positive or negative.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number:");
		int n = sc.nextInt();
		
		if(n>0) {
			System.out.println("Positive number");
		}else {
			System.out.println("Negative number");
		}
		
		
	}

}
