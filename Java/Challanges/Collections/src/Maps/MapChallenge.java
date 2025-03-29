package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 Q: Create a Map where the keys are country names (as String) and the values are their capitals 
 (also String). Populate the map with at least five countries and their capitals. 
 Write a program that prompts the user to enter a country name and then displays 
 the corresponding capital, if it exists in  the map.
 */
public class MapChallenge {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("India", "Delhi");
		map.put("US", "WashingTon");
		map.put("England", "London");
		map.put("France", "Paris");
		map.put("Japan", "Tokyo");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter country name : ");
		String countryKey = sc.next();
		if(map.containsKey(countryKey)) {
			System.out.println("The Capital of " + countryKey +  " is : " + map.get(countryKey));
		}else {
			System.out.println("We don't know the capital og entered country.");
		}
	}

}
