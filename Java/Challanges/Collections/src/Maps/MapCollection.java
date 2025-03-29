package Maps;

import java.util.HashMap;
import java.util.Map;

public class MapCollection {

	public static void main(String[] args) {
		
		// create
		Map <String, Character> map = new HashMap<>();
		
		// put or add
		map.put("Kunal", 'F');
		map.put("Akanksha", 'B');
		map.put("Sejal", 'A');
		map.put("Gaurav", 'D');
		
		// read or access
		System.out.println(map.get("Sejal"));

		// remove or delete
		System.out.println("Before removing somthing : " + map);
		map.remove("Kunal");
		System.out.println("After removing somthing : " + map);
		
		// Searching -> containsKey
		
		if(map.containsKey("Kunal")) {
			System.out.println("Key is present in our Map.");
		} else {
			System.out.println("Key is not present in our Map.");
		}
		
		// Get all keys -> returns set of all keys bcz they are unique.
		System.out.println(map.keySet());
		
		// get all values -> returns collection of all values.
		System.out.println(map.values());
		
		// Iterate over map
		for(String key : map.keySet()) {
			System.out.printf("%s : %s %n", key , map.get(key));
		}
	}

}
