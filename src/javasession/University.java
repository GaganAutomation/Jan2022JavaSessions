package javasession;

import java.util.ArrayList;

public class University {
	
	String name;
	String country;
	String establishedDate;
	ArrayList<String> courseList;
	
	public University(String name, String country, String establishedDate) {
		this.name = name;
		this.country = country;
		this.establishedDate = establishedDate;
	}
	
	public University(String name, String country, String establishedDate, ArrayList<String> courseList) {
		this.name = name;
		this.country = country;
		this.establishedDate = establishedDate;
		this.courseList = courseList;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @return the establishedDate
	 */
	public String getEstablishedDate() {
		return establishedDate;
	}

	/**
	 * @return the courseList
	 */
	public ArrayList<String> getCourseList() {
		return courseList;
	}

	
}
