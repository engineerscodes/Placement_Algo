package EXAM;

import java.util.Arrays;

/**
 * @author NAVEEN ,
 * 25 Aug, 2022
 */

abstract class animal{

  abstract void food();

  void shape(int i){
    System.out.println("111");
  }

}

class naveen extends animal{
  public void food(){
    System.out.println("FOOS");
  }

}

interface TEST_A{
  int A=130;
  void foo();

}

interface TEST_B{
  int B=100;
  void foo();
 // void call_B(int i);
}



public class check  implements TEST_A,TEST_B{


  public  void foo(){
    System.out.println("HI");
  }

  public static void main(String agr[]){

   check s=new check();
   s.foo();

   System.out.println(Arrays.toString(reverse("abcdef".split(""),0)));
  }

  public static String[]  reverse(String str[],int index){

    if(str.length/2==index){
      return str;
    }
     else {
       String t=str[index];
       str[index]=str[str.length-1-index];
       str[str.length-1-index]=t;
      return reverse(str,index+1);
    }
  }

}
