/*
  #  JAVASCRIPT :
        - Javascript is a dynamically typed language.
        - Js is a Case-Sensitive Language. N and n is different in Js.
        - Variable means container to store the values.
        - we can declare variables using var, let, const keywords.

        Var :->
          - It is global Scope variable.
          - we can redeclare the variable.
          - we can reassign the variable.


        - but with var we face some problems so EcmaScript6 introduced 2 new terms let and const to overcome below problems.

              ************** Problems with Var Keyword **************


  Problem 1 : We can re-declare the variable with same name it should not allow this.

      var x = 23
      var x = 43
      console.log(x)


  Problem 2 : Variables declared with var keyword are function scoped but not block scoped 

    Explanation :if we declare a variable inside the "if block" using var keyword and try to access the variable outside the "if block" it will be accessable. This should not be allowed

      var x = 43
      if(x===43){
          var y = 20
          console.log("Inside the block",y)
      }
      console.log("Outside the block",y)         
*/                           

/*
                                 *********** RESOLVED THE PROBLEMS WITH VAR KEYWORD ***********

        let :->
        - using let and const keyword we can overcome from these problems.
        - we can't declare the variable
        - we can reassign its value with any type.
        - It is a block scoped.

        const :->
           - We can't redeclare nor reassign its value.
           - We must assign value when we declare the const variable.
           - It is a block scoped.


        let x = 30
   //   let x =79        // we can't redeclare variable.
        x=60             // we can reassign it with any type of value.


        if(x==60){
            let r = 20
            console.log("Inside Block",r)
        }

        console.log("Outside Block", r)  // it will show error. we can't access 'r' outside the block.
*/


/*

  # Data Types in Js :
      Number , String, Object, Boolean, undefined, null, NaN, Symbol, BigInt.

    To check the dataType of value :
      typeof(value); -> this will return the data type of value.

  # Type Conversion In JS :
      Number() -> 
          - if true and false converted into Numbers then they will be 1 and 0 respectively.
          - if we try to convert non-number string or something to number it will give NaN.
          eg. Number('Kunal') -> NaN     , Number('56') -> 56  , " " -> 0
          - if we convert 'null' into number it will give 0. (null -> 0)
          - if we convert 'undefined' into number it will give NaN. (undefined -> NaN)

      Boolean() ->
          - false -> undefined , null , 0 , NaN
          - remaining all other values will always give true.

      String() ->
          - we can convert any value into the string.

*/


