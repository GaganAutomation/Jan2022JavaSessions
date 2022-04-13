package buiderPattern;

public class EcommAppTest {

	public static void main(String[] args) {

		EcommApp e = new EcommApp();
		
		e.login("Gagan@gmail.com", "gagan123").search("Mobile")
		.addToCart("mobile").doPayemt("241231231", "Password123").logout();
		
		
		
	}

}
