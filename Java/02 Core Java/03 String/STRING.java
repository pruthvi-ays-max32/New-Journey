
/*
            String Class : (Array of characters)
                -> String is an object hence it is stored inside the Heap Memory.
                -> In Heap memory also String has special location named as String Pool.
                -> String is immutable.
                -> if we create using " " -> stored in String pool.
                -> if we create using 'new' keyword -> stored in Heap memory outside String pool.

                -> can't compare using "==" operator use 'equals' Method instead.
                -> == -> compares references.
                -> equals -> compare values inside references.

                -> concatenation ---> can be done using '+' operator. but each concatenation creates new string in string pool hence memory usage increases frequently.
                -> so use String Format to print instead of concatenation. means 'printf' statement.

                -> Methods -> there are various predefined methods we can directly use on String like 
                      - length() -> to get length of string.
                      - trim() -> return new string after removing the spaced after and before of string.
                      - substring(index) -> return new Substring which start from given index to end of string.
                      - substring(s_index, e_index) -> return new Substring which start from start index to end index.
                      - replace("old_value" , "new_value") -> replace adn give new string.
                      - startsWith("_") -> return boolean value true or false.
                      - endsWith("_") -> return boolean value true or false.
                      - charAt(index) -> returns character at this index.
                      - equals(str2) -> check equality with case-sensitiveness.
                      - equalsIgnoreCase(str2) -> check equality ignore the case-sensitiveness.
                      and more...


                -> Escape Characters : 

                    \t -> insert tab
                    \b -> insert backspace
                    \n -> new Line
                    \' -> insert ' in string.
                    \" -> insert " in string.
                    \\ -> insert \ in string.

                -> Printf characters ->

                    %s -> String
                    %d -> numbers like int, long, byte, short etc.
                    %f -> float
                    %b -> boolean
                    %c -> single character
                    %n -> new Line
                    %% -> % sign
                    %tY -> year in Four digit
                    %tT -> Time in Format HH:MM:SS

                Pattern      Data        printf output
              
              1. '%s'        Java             'Java'
              2. '%15s'      Java             '     Java'
              3. '%-15s'     Java             'Java     '
              4. '%S'        Java             'JAVA'

                Flag          Purpose
              
              1. -        Align the String to the Left.
              2. +        Output include +ve and -ve sign.
              3. (        place () around -ve sign.
              4. ,        include grouping seperator.
            
              FORMATE :-> " % [Flags] [Width] [.precision] specific-character " 
*/


public class STRING {
  public static void main(String[] args) {
    String str = "Kunal";

    String str2 = new String("Pruthvi");
    System.out.println(str2);

    // Formated String.
    System.out.printf( "Hii, I am %15s, Ready for the adventure.", str2);

    System.out.println();
    // to get length
    System.out.printf("The length of string2 is %d", str2.length());
  }
}
