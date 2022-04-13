package javasession;

import java.util.Scanner;

public class SwitchCaseConcept {
	
	static Scanner sc;
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);

		String browser = "chrome";

		switch (browser.toLowerCase().trim()) {// chrome

		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch ff");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		case "ie":
			System.out.println("launch IE");
			break;

		default:
			System.out.println("please pass the right browser....");
			break;
		}

		//
		short marks = 100;
		switch (marks) {
		case 90:
			System.out.println("GRADE A");
			break;
		case 80:
			System.out.println("GRADE B");
			break;
		case 70:
			System.out.println("GRADE C");
			break;
		case 60:
			System.out.println("GRADE D");
			break;

		default:
			System.out.println("FAIL");
			break;
		}

		//ENV selection:
		String env = "QA";
		
		switch (env) {
		case "QA":
			System.out.println("run tcs on qa env...");
			int a = 10;
			int b = 20;
			int c = a+b;
			break;
		case "DEV":
			System.out.println("run tcs on qa env...");
			break;
		case "STAGE":
			System.out.println("run tcs on qa env...");
			break;
		case "UAT":
			System.out.println("run tcs on qa env...");
			break;
		case "PROD":
			System.out.println("run tcs on qa env...");
			break;

		default:
			break;
		}
		
		//RBAC -- user permission
		String role = "admin";//superadmin, cus, vendor, parntner, seller
		
		char ltr = 'f';
		
		switch (ltr) {
		case 'a':
			System.out.println("Asccii value of a: "+(int)ltr);
			
			break;
			
		case 'b':
			System.out.println("Asccii value of a: "+(int)ltr);
			
			break;
		case 'c':
			System.out.println("Asccii value of a: "+(int)ltr);
			
			break;
		case 'd':
			System.out.println("Asccii value of a: "+(int)ltr);
			
			break;
		case 'e':
			System.out.println("Asccii value of a: "+(int)ltr);
			
			break;
		case 'f':
			System.out.println("Asccii value of a: "+(int)ltr);
			
			break;
			

		default:
			System.out.println("Please enter leter from 'a' to 'f' ");
			break;
		}
		
		while(true) {
		System.out.println("Please enter Operand..");
		String input = sc.nextLine();
		
		if(input.equalsIgnoreCase("division")||input.equalsIgnoreCase("Addition")||input.equalsIgnoreCase("summasion")||
				input.equalsIgnoreCase("Multiplication")||input.equalsIgnoreCase("Percentage")) {

			
		
		
		System.out.println("Please enter Operands a and b");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		switch (input) {
		case "division":
		System.out.println("Division of a and b is: "+a/b);	
			
			break;

		case "addition":
			System.out.println("addition of a and b is: "+(a+b));	
				
				break;
				
		case "summasion":
			System.out.println("summasion of a and b is: "+(a-b));	
				
				break;
				
		case "multiplication":
			System.out.println("multiplication of a and b is: "+a*b);	
				break;
			
		case "percentage":
			System.out.println("percentage of a and b is: "+ ((a*b)/100));	
				
				break;
		default:
			System.out.println("Entered operand is not available in the list.");
			break;
		}
		
	}else {
		System.out.println("Please enter correct operand..");
		
	}
         continue;
	}
 }

}
