package webDriver_Arch;

public class AmazonAppTest {
	static WebDriver driver;

	public static void main(String[] args) {

		String browser = "safari";

		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FireFoxDriver();
		} else if (browser.equals("safari")) {
			driver = new SafariDriver();

		} else {
			System.out.println("Please pass the right browser...");
		}
		
		driver.getUrl("https://www.amazon.com/");
		driver.getTitle("Amazon india");
		driver.findElement("userName");
		driver.findElement("password");
		driver.click("loginButton");
		driver.quit();
	}
}
