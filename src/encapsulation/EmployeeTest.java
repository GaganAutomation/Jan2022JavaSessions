package encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee e = new Employee();
		
		e.setName("Gagan");
		e.setAge(28);
		e.setGender('M');
		e.setSalary(12.33);
		e.setActive(true);
		
		e.getEmployeeInfo(e.getName(), e.getAge(), e.getSalary(), e.getGender(), e.getIsActive());
		
	}

}
