package OOP_Inheritance;

public class Audi extends Car {
	
	@Override
	public void start() {
		System.out.println("Audi--start");
	}
	
	
	public void aeroDynamics() {
		System.out.println("Audi-- aerodynamic");
	}
	
	@Override
	public void refuel() {
		System.out.println("Audi--refule");
	}
	
	

}
