package OOP_Abstraction;

public abstract class Page {
	
	    // abstract methods + non abstract methods
		// can not create the object of abstract class
		// but can create the const... of abstract class
		// and this const.. will be called when you create object of child class
		
		//can have  no abstract method -- 0% abstraction
		//can have only abstract methods -- 100% abstraction
		//abstract methods + non abstract methods -- partial abstraction
	
	public Page() {
	
		System.out.println("Page const..");
	}
	
	public Page(int a) {
		
		System.out.println("Page const.."+a);
	}
	
	public abstract void pageTitle();
	public abstract void pageUrl();
	
	public void timeOut() {
		
		System.out.println("Page time out is 10 sec");
	}
	
	public final void logo() {
		
		System.out.println("Page Logo..");
		
	}
	
}
