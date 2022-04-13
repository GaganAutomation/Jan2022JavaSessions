package javasession;

public class Employee {
	
	String name;
	int age;
	double salary;
	boolean isActive;
	

	public static void main(String[] args) {
		
		// class - blueprint
		// object - physical entity

		Employee e1 = new Employee();
		e1.name = "Tommy";
		e1.age = 25;
		e1.isActive = true;
		
		System.out.println(e1.name + " " + e1.age + " " + e1.isActive);
		
		Employee e2 = new Employee();
		e2.name = "Mohan";
		e2.age = 26;
		e2.isActive = true;
		
		System.out.println(e2.name + " " + e2.age + " " + e2.isActive);
		
		e1 = e2;
		
		System.out.println(e1.name + " " + e1.age + " " + e1.isActive);
		
		Employee e3 = new Employee();
		e3.name = "Satish";
		e3.age = 28;
		e3.isActive = false;
      //  e3 = null; NPE NullPointerException
		
		System.out.println(e3.name + " " + e3.age + " " + e3.isActive);
		
		e2 = e3;
		
		System.out.println(e2.name + " " + e2.age + " " + e2.isActive);
		
		
		
		
	}

}
