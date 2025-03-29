package Challenges;

/*
 
 Q : Write a method concatenate Strings that takes variable arguments of String type and concatenates them into a single string.
 
*/
public class VarArgsStringConcatenation {
	
	public static String concat(String... strs ) {
		StringBuilder sb = new StringBuilder();
		for(String str : strs) {
			sb.append(str).append(" ");
		}
		return sb.toString();
	}

	public static void main(String[] args) {	
		System.out.println(concat("Hello", "Love", "Of", "My", "Life."));
		System.out.println(concat("Lets", "Rock", "The", "Party", "Baby", "Let's", "Rock", "The", "Party", "Baby" ));
	}

}
