/*

      Date Object in Javascript :
          - can be create Date object with current time and date using "new Date()"
          - Key Methods :
                - .getTime() -> give epoch value. (Since 1st Jan 1971).
                - .getFullYear() -> give Current year
                - .getDay() -> for monday = 1; Tuesday = 2; and so on...
                - .getMinutes() -> give minutes in Current Hour.
                - .getHours() -> give current hour in 24H Format. 

*/


let date = new Date();

console.log(date)
console.log(date.getTime())
console.log(date.getFullYear())
console.log(date.getDay())
console.log(date.getMinutes())
console.log(date.getHours())