/*
    1. Create a method to check if a number is odd or even.
    2. Create a method to return larger of two numbers.
    3. Create method to convert celsius to fahrenheit
*/


//  1st Problem  (Using Normal Function & Ternary Operator.)

function evenOrOdd (number){
      let result = number%2==0 ? `even` : `odd`;
      return result;
}


console.log(`Given Number is ${evenOrOdd(666)}`);


// 2nd Problem (Using Arrow Function & Ternary Operator)

const larger = (num1, num2)=> {
    if(num1==num2){return `both Numbers are same`}
    let result = (num1 > num2) ? `num1 is greater` : `num2 is greater`;
    return result;
}

console.log(larger(9,6));


// 3rd Problem (Using Anonmys Function)

const Temperature = function (celcius){
  let result = (9/5) * celcius + 32;
  return result
}

console.log(`Given Temperature in ${Temperature(100)} Fahrenheit.`);