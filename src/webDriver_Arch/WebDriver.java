package webDriver_Arch;

public interface WebDriver extends SearchContext{
	
	public void click(String element);
	public String getUrl(String url);
	public String getTitle(String title);
	public void sendKeys(String value);
	public void quit();
	
	@Override
	public void findElement(String ele);
	
	@Override
	public void findElements(String ele);
	

}
