
/*

LOOPS IN JAVA -> 
        - To perform Repetative work / task.
        - Code runs multiple times based on condition.
    
    1. for loop -> (Use when we have the count of how many times loop is going to execute.)
        Syntax : 
            for(dtype initialize ; condition ; updation)
                {
                     code block 
                }

    2. while loop -> (use when we don't know the number of repetation.)
          - infinite loop.

          Syntax : while(condition) 
                      { 
                          code block 
                      }

    3. do while loop -> when we need to run at least one without checking the condition.
          Syntax :
              do {
                      code block 
                 } while (condition)


    4. For Each Loop : To perform similar task on each element of array.
          Syntax : 
             for (dtype var_name in arr_name){
                    task using var_name as each element
             }

    5.  Break and Continue Statement

      - Break lets you stop a loop early, or break out of a loop
      - Continue is used to skip one iteration or the current iteration
      - In while loop remember to do the increment manually
      
    */



public class Loops {
  

  public static void main(String[] args) {

    // For Loop ------------->>>>>>>>>>>>>>>
    int count = 10;
    System.out.println("For Loop Statement Result : ");
    for(int i=0; i<count; i++){
      System.out.print(i+1 + " ");
    }
    System.out.println();

    
     // while Loop----------------->>>>>>>>>>>>>>>

    int x = 1;
    System.out.println("while Loop Statement Result : ");
    while(x<=10){
      System.out.print(x + " ");
      x++;
    }
    System.out.println();
    
     // do while Loop ----------------->>>>>>>>>>>>>>>

    int y = 1;
    System.out.println("Do while Loop Statement Result : ");
    do{
      System.out.print(y + " ");
      y++;
     } while (y<=5);
     System.out.println();


     // For Each ----------------->>>>>>>>>>>>>>>

     int arr [] = {10,20,30,40,50};
     System.out.println("For each loop Statement Result : ");
     for(int z : arr){
        System.out.print(z*10 + " ");
     }
  }
}
