package superKeyword;

public class Employee extends Company{
	
	
	int salary = 200;
	
	public Employee() {
		super(10);
		System.out.println("Emp-- contr..");
	}
	
	public void cafe() {
		System.out.println("Employee--- cafe");
		System.out.println(salary);
		System.out.println(super.salary);
		super.cafe();
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.cafe();
	}

}
