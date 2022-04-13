package javasession;

import java.util.ArrayList;

public class TestUniversity {
	
	public static void main(String[] args) {
		
		ArrayList<String> courseList = new ArrayList<String>();
		courseList.add("Chemistry");
		courseList.add("Computer Science");
		courseList.add("Biology");
		courseList.add("Physics");
		
		University t = new University("HRIT", "India", "01/09/1990");
		
		System.out.println(t.getName());
		System.out.println(t.getCountry());
		System.out.println(t.getEstablishedDate());
		
		University t1 = new University("SRM University", "America", "02/07/1970", courseList);
		
		System.out.println(t1.getName());
		System.out.println(t1.getCountry());
		System.out.println(t1.getEstablishedDate());
		System.out.println(t1.getCourseList());
		
		
	}

}
