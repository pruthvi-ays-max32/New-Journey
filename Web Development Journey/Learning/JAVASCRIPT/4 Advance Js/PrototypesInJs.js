

function myFunction (username, score){
  this.username = username;
  this.score = score;
}


myFunction.prototype.increment = function (){
   this.score++;
}


const user1 = new myFunction("Kunal", 50);
const user2 = new myFunction("Pruthvi", 70);


// it will show undefined error if we don't use new keyword while creating instance bcz new keyword tells that i have defined new prototypes for you.
console.log(user1.increment())