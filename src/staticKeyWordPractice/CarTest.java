package staticKeyWordPractice;

public class CarTest {

	public static void main(String[] args) {

		Car c = new Car(67.4);
		
		double price = c.carPrice("Honda");
		
		System.out.println("Honda car price is: "+price +" lakhs");
		
		
		
	}

}
