package javasession;

import java.util.Scanner;

// WAP on RBAC.
public class RBACSystem {
	
	static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Please enter your role..");
		String role = sc.nextLine();
		
		switch (role.toLowerCase().trim()) {
		case "admin":
			System.out.println("1.You have  Access..");
			break;
		case "superadmin":
			System.out.println("1.You have Full Access..");
			break;
		case "customer":
			System.out.println("1.You have only reading acess");
			break;
		case "vendor":
			System.out.println("1.You have write/read access");
			break;
		case "partner":
			System.out.println("1.You have read/write access");
			break;

		default:
			System.out.println("Please enter correct role..");
			break;
		}
		
		
		// WAP on RBAC thru If-else if
		
		System.out.println("Please enter role ");
		String role1 = sc.next();
		
		if(role1.equalsIgnoreCase("admin")) {
			System.out.println("you have full access");
		}
		else if(role1.equalsIgnoreCase("superadmin")) {
			System.out.println("you have full access..");
		}
		else if(role1.equalsIgnoreCase("customer")) {
			System.out.println("You have read permission");
		}
		else {
			System.out.println("Please pass correct role..");
		}
		
	}

}
