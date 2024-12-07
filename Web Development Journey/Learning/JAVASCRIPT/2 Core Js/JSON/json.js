/*
      JSON : Javascript Object Notation
          - Similar like js object but has different meaning and uses.
          - JSON is a data format and JS object is data structure.
          - it is used for network call and data storage.
          - Strings are easy to transport over network.

          - In json everything is a string means all properties should be inside quotes.
          - typeOf JSON object is "String".
          eg.  {
                  "name" : "kunal",
                  "age" : 22,
               }

          - JS Object : typeOf JS Object is "Object".
                  {
                      name : "Kunal",
                      age : 22,
                  }

          -- we can convert js object and json into each other using parse and stringify methods.
              - To convert 
                  use JSON.Stringify() =>  JS Object ---> JSON Object. 
                  use JSON.parse()  => JSON Object ---> JS Object.

*/


let obj = {
  name : "Pruthvi",
  bff : "Akanksha"
}

console.log(typeof obj)

let x = JSON.stringify(obj);
console.log(x)

console.log(typeof x)

let y = JSON.parse(x);
console.log(y)
console.log(typeof y)