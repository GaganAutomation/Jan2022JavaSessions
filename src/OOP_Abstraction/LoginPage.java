package OOP_Abstraction;

public class LoginPage extends Page {
	
	public LoginPage() {
		System.out.println("Login page const..");
	}
	
	public LoginPage(int a) {
		System.out.println("Login page const.."+a);
	}

	@Override
	public void pageTitle() {

		System.out.println("Login Page -- Page title");
	}

	@Override
	public void pageUrl() {

		System.out.println("Login page -- page Url");
	}

	@Override
	public void timeOut() {

		System.out.println("LoginPage time out is 5 sec");
	}
	
	public void doLogin() {
		
		System.out.println("login page login..");
		
	}

	
}
