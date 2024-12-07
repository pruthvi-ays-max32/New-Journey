# JavaScript : It is a prototype based language.

# OBJECT : 
- Collection of properties and methods.

# Constructor : 
- always gives new instance. (new keyword used for it.)
- don't affect old instances.
- if we don't use new keyword while creating instance it will 	override the instance every time we create another instance.

###
S1 :when we use new keyword the empty object gets created called instance.
S2 : constructor gets called and pass arguments by wrapping.
S3 : then this keyword will inject those arguments.
S4 : Then we will get these values in function to use.
###

Object Literal -> basic unit of javascript.

# This keyword
- used to refer the current contaxt / instance.  
- eg. every week there is a monday. so specifically define which monday we use this keyword.
- when we return 'this' then it will return the whole current context / instance.

# instanceOf  _ instanceOf _  -> return boolean value



# javascript is based on prototyped inheritance means it will never accept the defeat it will go to parent then grandparent and so on until it gets null value.
- then lastly it will come to object (basic unit of javascript) and then object refer to the null.


# we can use js functions as function as well as object.

-- We can assign new prototypes :

function myFunction (username, score){
  this.username = username;
  this.score = score;
}
myFunction.prototypes.increment = function (){
  this.score++;
}