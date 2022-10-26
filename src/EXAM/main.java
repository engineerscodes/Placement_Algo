package EXAM;

/**
 * @author NAVEEN ,
 * 17 Aug, 2022
 */

class A{
    int x;

    public  void name(){
        System.out.println("A");
    }

}

class B extends A{

    public  void f(){

    }
    public  void name(){
        System.out.println("B");
    }
}

public class main {

    public static void main(String agr[]){

        A a=new B();
        a.name();



    }

}
