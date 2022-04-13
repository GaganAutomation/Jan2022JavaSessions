package HashMap;

import java.util.HashMap;

public class HashMapTest {
	
	public static void main(String[] args) {
		
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		map.put("Sandeep", 100);
		map.put("Ravi", 200);
		map.put("Minesh", 900);
		
//		System.out.println(map.get("Sandeep"));
//		System.out.println(map.get("Ravi"));
//		System.out.println(map.get("Minesh"));
		
		
//	System.out.println(	map.size());
	
	map.forEach((k,v)->System.out.println(k+":"+v));
	
	
		
	}

}
