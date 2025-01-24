# Abstraction : Hides the complex implementation details.
        - foucses on functionality:
                  foucses on what Object is doing it doesn't matter how is doing.

        - Reduce Complexity by showing only relevant information.

  # Abstract Keyword - >
    Can be used with class and method :
        1. Abstract Class : Can't create instance / Object of abstract class.
                    - It only work as base/ Parent class.
                    - Every Constructor have to call its parent's constructor due to constructor chaining.
                    - We can't access the properties of abstract class directly.
                    - By creating object of child class we can access its properties.

                    eg. public abstract class c_name {};

        2. Abstract Method : Define method without implementation body.
                    - abstract method can be defined only inside abstract method.
                    - Which class extends abstract class have to implement all abstract methods of its parent class.
                    - if it doesn't wanted to implement then declare itself a abstract class.
                    
                    eg. public abstract void sayHello();


  # Advantages : 
    1. Focus on Functionality.
    2. Reduce Complexity.
    3. Child Can Implement methods in its own way.
    


