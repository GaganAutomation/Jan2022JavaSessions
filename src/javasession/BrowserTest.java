package javasession;

import java.util.Arrays;

public class BrowserTest {

	
	public static void main(String[] args) {
		
		String[] plugin = new String[2];
		plugin[0] = "selectorsHub";
		plugin[1] = "selenium";
		
		Browser b = new Browser("Chrome", 90.0, plugin);
		
		System.out.println(b.getName());
		System.out.println(b.getVersion());
		System.out.println(Arrays.toString(b.getPlugin()));
		
	}
}
