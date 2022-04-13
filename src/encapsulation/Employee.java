package encapsulation;

public class Employee {
	
	private String name;
	private int age;
	private double salary;
	private char gender;
	private boolean isActive;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public boolean getIsActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	public void getEmployeeInfo(String name, int age, double salary, char gender, boolean isActive) {
		
		System.out.println(name+" "+age+" "+salary+" "+gender+" "+isActive);
		
	}
	
	

}
