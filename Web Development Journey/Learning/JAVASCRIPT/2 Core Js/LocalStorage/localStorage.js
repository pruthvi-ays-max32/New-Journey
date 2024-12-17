/*
            LOCAL STORAGE IN JS :
                - Its browser's object os we can use methods directly on it.

                - key Methods : 
                  - setItem() -> It takes key-value pair but it support only String d_type.

                    eg. LocalStorage.setItem(
                        "user",
                        JSON.Stringify({
                            name : "Kunal",
                            age : 22,
                        })
                    )


                  - getItem() -> retrive data based on key.

                    eg. const user = JSON.parse(
                        LocalStorage.getItem("user");  ->> access it by key name.
                    )

*/


const obj = {
  f_name : "Kunal",
  l_name : "Suryawanshi",
  qualification : "BE Computer",
  isMarried : false,
  age : 22,
  crushes : ["Kalu", "Kalaa", "Khushi", "Shivani"]
}

localStorage.setItem(
  "User" , JSON.stringify(obj)
)


const newUser = JSON.parse(
  localStorage.getItem("User")
);

console.log(newUser)

newUser.crushes.push("D")

console.log(newUser)