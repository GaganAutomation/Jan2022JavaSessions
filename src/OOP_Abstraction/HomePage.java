package OOP_Abstraction;

public class HomePage extends Page {
	
	public HomePage() {
		System.out.println("HomePage Const..");
	}

	@Override
	public void pageTitle() {

		System.out.println("Home Page -- Page title");
	}

	@Override
	public void pageUrl() {

		System.out.println("Home Page -- Page url");
	}
	
	@Override
	public void timeOut() {

		System.out.println("HomePage time out is 2 sec");
	}

}
