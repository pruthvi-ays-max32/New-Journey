// const user = {
//   username : "Pruthvi",
//   isLogin : true,
//   loginCount : 30,

//   getUserDetails : function(){
//     console.log(`hello ${this.username}`)
//   }
// }

// console.log(user.username);
// console.log(user.getUserDetails())

// Constructor

function User (username , isLogin, loginCount) {
    this.username = username;
    this.isLogin = isLogin;
    this.loginCount = loginCount;

    return this
}


// if we don't use new keyword it will override the instance of user each time. so use new keyword it will craete new instance without damaging the previous ones.
const User1 = new User("Pruthvi", true, 12)
const User2 = new User("Akanksha", false, 13)

console.log(User1);
console.log(User2);
