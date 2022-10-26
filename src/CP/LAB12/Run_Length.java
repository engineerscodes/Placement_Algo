package CP.LAB12;

import java.util.Scanner;

/**
 * @author NAVEEN ,
 * 13 Aug, 2022
 */
public class Run_Length {


  public static void main(String agr[]){

    Scanner nav=new Scanner(System.in);
    System.out.println("Enter the String : ");
    String str=nav.next();


    for(int i=0;i<str.length();i++){

      int count=1;
      char ch=str.charAt(i);
      while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
         i++;
         count++;
      }
      System.out.print(ch+""+count);
    }

  }

}
