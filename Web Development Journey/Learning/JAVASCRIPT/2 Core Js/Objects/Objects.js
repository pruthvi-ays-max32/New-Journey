
// Object is unordered collection of key-value pairs

/*

                                     CURD Operation on object ....

//  Create

let obj = {
    name:"Pruthvi",
    "surname":"Suryawanshi"
}

// Access the object

// M1 using .
console.log(obj.name)

// M2 using Bracket
console.log(obj["name"])



// Update
obj.name = "Hello"


// Delete 

delete obj.name

console.log(obj)

*/

/*

// Nested Object

let SRK = {
    name:"Shahrukh",
    lastname :"Khan",
    nationality : "Indian",
    movies :["DDLJ", "RNBJ","Swades","Chak De! India"],
    Address : {
        city:"Mumbai",
        State:"Maharashtra",
        Nation:"India"
    }
}

// Access array elements inside the object
console.log(SRK.movies[2])

// Access The nested object value
console.log(SRK.Address.city)

// Add Element at the last of an array 
SRK.movies.push("DTPH")

// Add Element in object
SRK.fanArmy = ["SRK Squad", "KKR"]

// Update the value inside array 
SRK.fanArmy[1] = "TKR"

// Update the value inside nested object
SRK.Address.city = "Delhi"
console.log(SRK)

// Delete object key value pair

delete SRK.Address
console.log(SRK)

*/