package webDriver_Arch;

public class SafariDriver implements WebDriver {

	public SafariDriver() {

		System.out.println("Launching safari browser");
	}

	@Override
	public void click(String element) {
		System.out.println("clicking on the element" + element);

	}

	@Override
	public String getUrl(String url) {
		
		System.out.println("Launching the url "+ url);
		
		return url;
		
	}

	@Override
	public String getTitle(String title) {
		System.out.println("The title is "+ title);
		
		return title;
	}
	
	
	@Override
	public void sendKeys(String value) {
		System.out.println("Enter the value in field " + value);
	}

	@Override
	public void findElement(String ele) {
		System.out.println("Finding the element " + ele);

	}

	@Override
	public void findElements(String ele) {

		System.out.println("Finding the elements " + ele);

	}

	@Override
	public void quit() {
		System.out.println("Closing the browser.");
	}

}
