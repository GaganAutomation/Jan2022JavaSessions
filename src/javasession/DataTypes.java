package javasession;

public class DataTypes {

	public static void main(String[] args) {
		
		//data types:
		//strict type:
		//1. primitive data types: no need of Objects
		   //boolean types:
	       //Numeric type:
				//a. Character type: char
		       	//b. Integral Value:
					//b.1: Integer: byte, short. int, long
					//b.2: Floating-point: float, double
		
		//2. non primitive data type: String, Arrays, class, interface
		//Objects will come into the picture.
		
		//1. byte:
		// size: 1 byte = 8 bits
		
		byte b = 120;
		byte b1 = 2;
		b = 30;
		
		System.out.println(b+b1);
		
		//2. short:
		// size: 2 byte = 16 bits
		
		short s = 35;
		System.out.println(s);

		//3. int:
		// size: 4 bytes = 32 bits
		
		int i = 1312;
		System.out.println(i);
		
		//4. long
		// size: 8 bytes = 64 bits
		
		long l = 4123412343123l;
		System.out.println(l);
		
		//5. float:
		// size: 4 bytes: 32 bits
		// upto 7 digits
		
		float f = (float) 3.21;
		System.out.println(f);
		
		//6. double:
		//size: 8 bytes: 64 bits
		
		double d = 14.32123;
		System.out.println(d);
		
		//7. char: 
		// size: 2 bytes = 16 bits
		
		char c = 'a';
		System.out.println(c);
		
		byte t = 065;
		System.out.println(t);
		//065 = (0 × 8²) + (6 × 8¹) + (5 × 8⁰) = 53
		
		double f1 = 32/0;
		
		
	}

}
