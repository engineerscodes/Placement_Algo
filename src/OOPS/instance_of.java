package OOPS;

/**
 * @author NAVEEN ,
 * 08 Jun, 2022
 */
public class instance_of {
  public static void main(String ar[]) {
    A a = new A();
    B b = new B();
    C c = new C();
    A ob = b;
    if (ob instanceof B)
      System.out.println("ob refers to B");
    else
      System.out.println("ob NOT refers to B");
    if (ob instanceof A)
      System.out.println("ob refers to A");
    else
      System.out.println("ob NOT refers to A");
    if (ob instanceof C)
      System.out.println("ob refers to C");
    else
      System.out.println("ob NOT refers to C");
  }
}

class A {
  int i, j;
}
class B extends A {
  int a, b;
}
class C extends A {
  int m, n;
}
class Main {

}
