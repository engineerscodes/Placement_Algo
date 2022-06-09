package OOPS;

/**
 * @author NAVEEN ,
 * 06 Jun, 2022
 */
//https://www.geeksforgeeks.org/can-we-overload-or-override-static-methods-in-java/
public class Super {
  Super(String name){
    System.out.println("SUPER NAME  : "+name);
  }
  static String greet()
  {return "HELLO";}
  public static  void main(String ...strings){
    Super s=new B1();
    System.out.println(s.greet()); //ans HELLO BECAUSE OF  STATIC //https://www.geeksforgeeks.org/can-we-overload-or-override-static-methods-in-java/
  }
}

class B1 extends Super{
  B1(){
    super("K");
    //System.out.println(super.greet());
  }
  void don(){
    System.out.println(super.greet());
  }
  static String greet(){
    return "NOT HELLO";
  }
}