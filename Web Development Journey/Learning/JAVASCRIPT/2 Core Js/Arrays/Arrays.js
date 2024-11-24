
/*
 CURD OPERATION ON ARRAY.....

// Declare Array -- can store multi-type values inside single array
let arr = [12, "Pruthvi", 'c', 12.5]

// How to access the elements in array -- arr_name[index]
console.log(arr[1])

// How to update element in array
arr[1] = "Pratte"

console.log(arr[1])

// How to delete element in array (arr_name.splice(index, count)) -- here count denotes the number of elements should be deleted from index.
arr.splice(1,2)

console.log(arr)

*/

/*

let arr2 = [18, "Khushi", 189.3, "Hing"]

// delete last element in array  arr_name.pop() -- it delete last element in array and return that element.
arr2.pop()

console.log(arr2)
// Add element at the last index of array
arr2.push("Mire")

console.log(arr2)

// Add element at the starting of an array 
arr2.unshift("VIIT")

console.log(arr2)

// Delete element from the starting of an array
arr2.shift()

console.log(arr2)

*/




// Higher Order Function : Takes argument as function and returns output as function.
// Types of Higher Order Function : map(), forEach(), find(), findIndex(), every(), some() etc.


/*
    1. map() -> It traverse whole array , perform operation on each element individually and return new Array as result.
*/


// Question : Return A array which includes squares of each element of arr.

let arr = [1,2,3,4,5]

// Ananomys Function
let cb = function (number){
    return number*number
}

let newArray = arr.map(cb);

console.log(newArray)


/*
    2. forEach() -> Work same as map but the difference is it will not able to return something it can only console the values. 
*/


// Question : Return A array which includes squares of each element of arr.

let arr1 = [1,2,3,4,5]

// Arrow Function
let cb1 = (number)=>{
    console.log(number*number)
}
let newArray1 = arr.forEach(cb1)


/* 
    3. find() -> it will traverse the array until it gets the first element which statisfy the condition and return it  
        if it is not find anything then it will return undefined. 
*/

// let arr2 = [1,2,3,4,-5]

// let element = arr2.find((ele)=>{
//         return ele<0
// })
// console.log(element)

/*
    4. findIndex() -> same as find but it will return the index instead of first element which satisfy the condition and 
        if it is not found anything then it will return -1.
*/ 

// let arr3 = [1,2,3,4,5]

// let index = arr3.findIndex((ele)=>{
//     return ele<0
// })
// console.log(index)

/*
    5. Some -> returns boolean value. Returns true only when if atleast one element satisfy the condition otherwise return false.
*/

// let arr4 = [1,-2,3,4,5]

// let som = arr4.some((ele)=>{
//     return ele<0
// })
// console.log(som)

/*
    6. every() -> returns boolean value. Returns true only when all the elements satisfy the condition otherwise return false.
*/

    // let arr5 = [-1,-2,-3,-4,-5]

    // let eve = arr5.every((ele)=>{
    //     return ele<0
    // })
    // console.log(eve)


/*
    7. filter() -> it will return new array which includes filtered elements of previous array.
*/

// let arr6 = [1,2,-3,4,5,6]

// let newArray2 = []

// for(let i=0; i<arr6.length; i++){
//     if(arr6[i]%2==0){
//         newArray2.push(arr6[i])
//     }
// }
// console.log(newArray2)

// let filArray = arr6.filter((ele)=>{
//     return ele<0
// })
// console.log(filArray)


/*
    8. reduce(function(initialValue, element), initialValue) -> it returns the single value like sum of array from an array.
*/

// 

let arr7 = [1,2,3,4,5]

// let sum = 0;

// for(let i=0; i<arr7.length; i++){
//     sum = sum + arr7[i]
// }
// console.log(sum)

// let sumResult = arr7.reduce((initialvalue, element)=>{
//     let sum = initialvalue + element
//     return sum
// },0)

// console.log(sumResult)

// let productResult = arr7.reduce((initialvalue, element)=>{
//     let product = initialvalue * element
//     return product
// },1)

// console.log(productResult)


