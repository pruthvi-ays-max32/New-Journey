/*
 
      Draw Some patterns  :

      1. *                   2. * * * *             3.          *
         * *                    * * *                         * *
         * * *                  * *                         * * *
         * * * *                *                         * * * *
  
 */

//  Without Using Loops only single print statement 




//  using Loop

public class pattern {

  public static void main(String[] args) {


    System.out.println("pattern 1 using single print statement :");
    System.out.println(" * \n * * \n * * * \n * * * *");

    System.out.println("Pattern 1 using Loop :");

    for(int i=0; i<4; i++){
      for(int j=0; j<=i; j++){
        System.out.print("* ");
      }
        System.out.println();
    }

    System.out.println("pattern 2 using single print statement :");
    System.out.println(" * * * * \n * * *  \n * * \n * ");

    System.out.println("Pattern 2 using Loop :");

    for(int i=0; i<4; i++){
      for(int j=4; j>i; j--){
        System.out.print("* ");
      }
        System.out.println();
    }

    System.out.println("pattern 3 using single print statement :");
    System.out.println("       * \n     * * \n   * * * \n * * * *");

  }
}