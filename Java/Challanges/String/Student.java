package String;

/*
    Q :  Define a Student class with fields like name and age, and use toString to print student details.
*/

public class Student {
  int age;
  String name;
  String sex;
  double height;
  double weight;

  
  public Student(int age, String name, String sex, double height, double weight) {
    this.age = age;
    this.name = name;
    this.sex = sex;
    this.height = height;
    this.weight = weight;
}

    public String toString(){
           return "Student [ name : " + name + ", age : " + age + ", sex : " + sex + ", height : " + height + "foot , Weight : " + weight + "kg ]";
    }

    public static void main(String[] args) {
        Student Kunal = new Student(22, "Kunal", "Male", 5.6, 60.10);
        System.out.println(Kunal);
    }
}
