package buiderPattern;

public class EcommApp {
	
	public void login() {
		
	}
	
    public EcommApp login(String un, String pwd) {
		System.out.println("login with :"+un+":"+pwd);
		return this;
	}
    
    public EcommApp search(String productName) {
    	System.out.println("Searching the product: "+productName);
		return this;
		
	}
    
    public EcommApp search(String productName, String price) {
    	System.out.println("Searching the product: "+productName+":"+price);
    	return this;
	}
    
    public EcommApp addToCart(String productName) {
    	System.out.println("Adding to the cart: "+productName);
    	return this;
	}
    
    public EcommApp doPayemt(String cc, String pwd) {
    	System.out.println("Doing payment: "+cc+": "+pwd);
    	return this;
	}
    
    public EcommApp logout() {
    	System.out.println("Logging out from the app..");
    	return this;
    }

}
