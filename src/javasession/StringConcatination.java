package javasession;

public class StringConcatination {

	public static void main(String[] args) {

		String s = "Hello World";
		String s1 = "Naveen Auto labs";
		String s2 = "100";
		
		String x = "Hello";
		String y = "Testing";
		
		int a = 100;
		int b = 200;
		
		System.out.println(x+y);//HelloTesting
		System.out.println(a+b);//300
		
		System.out.println(a+b+x+y);//300HelloTesting
		System.out.println(x+y+a+b);//HelloTesting100300
		
		System.out.println(x+y+(a+b));//HelloTesting300
		int x1=10;
		int y1 = 25;
		System.out.println("Test: "+x1+y1);
		
		System.out.println("The value of a is "+a);//100
		System.out.println("The value of b is "+b);//200
		System.out.println("Sum is: "+a+b);//100200
		System.out.println("Sum is: "+(a+b));//300
		
		double c = 12.33;
		double d = 23.33;
		System.out.println(c+d);//35.66
		
		System.out.println(x+y+c+d+a+b);//HelloTesting12.3323.33100200
		
		System.out.println(a+b+x+y+c+d);//300HelloTesting12.3323.33
		
		char t1 = 'a';
		char t2 = 'b';
		char t3 = 'r';
		char t4 = '1';
		System.out.println(t1+t2);//asccii values
		System.out.println(t1);
		System.out.println((int)t3);
		System.out.println((int)t4);
		
		//a-z: 97 to 122
		//A-Z: 65 to 90
		//0-9: 48 to 57
		
		System.out.println(x+t1);
		System.out.println(t1+t2+t4+x+y);
		
		System.out.println(10+20);
		System.out.println(20/10);
		
	//	System.out.println(9/0);// Arithmatic Exception
		
		System.out.println(5/2);//2
		System.out.println(5.0/2);//2.5
		System.out.println(5/2.0);//2.5
		System.out.println(5.0/2.0);//2.5
		
		System.out.println(2.5/0);//infinity
		System.out.println(5.0/2);//2.5
		System.out.println(5/2.0);//2.5
		System.out.println(5.0/2.0);//2.5
		
		System.out.println(2.5/0);//infinity
		System.out.println(2/0.0);//infinity
		System.out.println(2.5/0.0);//infinity
		
		//System.out.println(0/0);//Arithmatic Exception
		
		System.out.println(0/0.0);//Nan
		System.out.println(0.0/0.0);//Nan
		System.out.println(0.0/0);//Nan
		
		
		
	}

}
