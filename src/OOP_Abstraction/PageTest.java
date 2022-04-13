package OOP_Abstraction;

public class PageTest {
	
	public static void main(String[] args) {
		
//		LoginPage l = new LoginPage();
//		l.pageTitle();
//		l.pageUrl();
//		l.timeOut();
//		l.logo();	
		
//		HomePage h = new HomePage();
//		h.pageTitle();
//		h.pageUrl();
//		h.timeOut();
//		h.logo();
		
		//top casting
		Page p = new LoginPage();
		p.pageTitle();
		p.pageUrl();
		p.timeOut();
		p.logo();
		
		

	}

}
