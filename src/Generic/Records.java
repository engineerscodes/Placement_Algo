package Generic;

/**
 * @author NAVEEN ,
 * 10 Aug, 2022
 */
public class Records<T extends Person> {

   T o[];

   Records(T obj[]){
     o=obj;
   }


}

class Person{
    String name;
  int Age;
  Person(String name,int age){
      super();
      this.name=name;
      this.Age=age;
  }


}

class Student extends Person{
  String id="Student";
  Student(String name,int Age){
   super(name,Age);
  }

    @Override
    public String toString() {
        System.out.println(this.name+" "+this.id+" "+this.Age);
        return "";
    }
}

class PhpStudent extends Person{
    String id="PhpStudent";
    PhpStudent(String name,int Age){
        super(name,Age);
    }

    @Override
    public String toString() {
        System.out.println(this.name+" "+this.id+" "+this.Age);
        return "";
    }
}