/*
        Problem : 
        1. Create Object to represent a product from Myntra
        2. Create an object with two references and log changes to one object by changing the other one.
        3. Use bracket notation to display delivary time.
        4. Given an object {message:"good job", status : "complete"}, use de-structuring to create two variables message and status.
        5. Add function isIdenticalProduct to compare two product objects.
*/ 


const product = {
  Category : "Shoes",
  price : "",
  size : 7,
  color:"black",
  "Company-name" : "Spark",
  "delivery-time" : "10AM Monday"
}

// both product and product2 referese to same object. 
const product2 = product;

console.log(product2)


// changes done in one object reference will affect all the references.
product["Company-name"] = "Asian";
console.log(product2)

const order = {
  message:"good job",
  status: "complete"
}

// de-structuring method 1: (v_name must be same as property name.)
let {message, status} = order;

console.log(message, "  ", status)
// de-structuring method 2: (v_name can be different.)
let msg = order.message;
let s = order.status;

console.log(msg , "  ", s)


// Problem 5 :

const product_1 = {
  Category : "Shoes",
  price : 6000,
}

const product_2 = {
  Category : "Shoes",
  price : 6000,
}

// NOTE : product_1 and product_2 both have same values but they referes to different object. so they both are not same.

const isIdenticalProduct = function (p1, p2){
  if(p1==p2){
    return `both are identical.`
  }
  else {
    return `both are identically different.`
  }
}

console.log(isIdenticalProduct(product_1, product_2));







