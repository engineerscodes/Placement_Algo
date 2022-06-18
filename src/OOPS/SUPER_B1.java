package OOPS;

/**
 * @author NAVEEN ,
 * 09 Jun, 2022
 */
public class SUPER_B1 {

  static  String greet(){
    return "GoodNigth";
  }
  String name(){
    return "RAM";
  }

  public static void main(String args[]){

    SUPER_B1 b1=new newB();
    System.out.println(b1.greet() + " "+b1.name());
    SUPER_B1 b2=new SUPER_B1();
    System.out.println(b2.greet() + " "+b2.name());
    newB b3=new newB();
    System.out.println(b3.greet() + " "+b3.name());
    //  newB newb=(newB) new SUPER_B1();
   // System.out.println(newb.greet() + " "+newb.name());

  }

}

class  newB extends SUPER_B1{
  static  String greet(){
    return "GM";
  }
  String name(){
    return "BHEEM";
  }
}
