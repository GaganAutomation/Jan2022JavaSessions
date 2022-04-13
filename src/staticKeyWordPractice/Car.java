package staticKeyWordPractice;

public final class Car {
	
	String name;
    double price;
	static int wheel = 4;
	
	public Car(double price) {
		this.price = price;
	}
	
	
	public double carPrice(String name) {
		
		this.name = name;
		
		 return price;
	}
	
	static {
		
		System.out.println("Hello this is static block that will always be called first..");
		
	}
	
	
	

}
