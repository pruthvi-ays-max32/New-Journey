
/*

    1. Normal Function Syntax

        function f_name(para1, para2){
              _____________
              _____________
              
              return something;
        }

        to call function :    f_name(arg1, arg2);


        Note : can be called anywhere and also called before the line of its declaration bcz it follows hoisting.

*/

    function sum (x , y){
      return x+y;
    }

    const result = sum(2,3)

    console.log(result)


/*

    2. Function Expression

    const var_name = function (para1, para2){
          _______________
          _______________

          return something;
    }

    to call function :   var_name(arg1, arg2);


    Note : we can't call function expression before the line of its declaration. it doesn't support hoisting.

*/


      const mult = function (a, b) {
        return a*b;
      }

      console.log(mult(3,4));


/*

      3. Nested Function : one function inside another funciton.

      function outerFun(para1, para2){
            function innerFun(para3){
                return para3 * para3 ;
            }

            const a = innerFun(para1);
            const b = innerFun(para2);

            return a+b;
      }


      outerFun(arg1, arg2);


      Note : Inner function is not accessible outside the outer funciton scope.

*/


      function outerFun(a , b){

        function innerFun(x){
          return x*x;
        }

        const y = innerFun(a);
        const z = innerFun(b);

        return y+z;
      }

      console.log(outerFun(2,4));
       

/* 

      4. Arrow Function : 

      valid Syntax : 

        1. () => expression
        2. (para1, para2) => expression
        3. () => {
                ____________
                ____________
          }
        4. (para1, para2) => {
                _____________
                _____________ 
          }


      Note : to call arrow function first we need to store it in variable and then call it using var_name.
*/


      const ArrowFun = (a , b) =>{
            return a/b;
      }


      console.log(ArrowFun(10,5));


/*

      5. Callback Function : A function passed as a argument to another function.

      const cbfun = () =>{
            _______
      }

      // fun is callback funtion here
      const mainfun = (a, b, cbfun){
            const result = cbfun(a) + cbfun(b);
            return result;
      }
*/

      const callbackFun = (a) => {
          return a*a;
      }

      const a = 2;
      const b = 4;

      const mainFun = (a, b, callbackFun) =>{
          return callbackFun(a)+callbackFun(b);
      }

      console.log(mainFun(a,b,callbackFun));
      

/*

      6. Asynchronous Function : It will works different than normal flow.

      eg. setTimeout function. --> it takes two parameters 1st function and 2nd is time in ms , the function will start executing after given time.
      but it will not interupt the normal flow of program.

      setInterval Funtion --> it takes two parameters 1st function and 2nd is time in ms , this method repeats a block of code at every given timing event.  it returns the intervalId. which can be used to stop the execution flow  of setInterval Function. using ClearInterval.


*/

      // console.log("First Line");
      // setTimeout(function (){
      //   console.log("Second line");
      // }, 3000)
      // console.log("Third line");

      let count = 0;

      let intervalId = setInterval(()=>{
            count += 1;
            if(count == 5) clearInterval(intervalId);

        console.log("I am Best.")
      },1000)

      // Now it will stop execution after 5 intervals.


      

      