package CP.LAB5;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author NAVEEN ,
 * 14 Jul, 2022
 */
public class Vowels_on_Strike {

  public static void main(String agr[]){

    char ch[]={'a','e','i','o','u'};
    System.out.println("Enter string : ");
    String str=new Scanner(System.in).nextLine();
    System.out.println("BEFORE STRIKING VOWELS "+str);
    for(int i=0;i<ch.length;i++){
      str=str.replace(ch[i]+"","");
    }
    System.out.println("AFTER STRIKING VOWELS : "+str);
  }

}
