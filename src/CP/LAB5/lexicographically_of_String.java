package CP.LAB5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author NAVEEN ,
 * 14 Jul, 2022
 */
public class lexicographically_of_String {

  public static void main(String arg[]){
    Scanner nav=new Scanner(System.in);
    System.out.println("NO OF STRINGS : ");
    int size=nav.nextInt();
    System.out.println("Enter Strings : ");
    String arr[]=new String[size];
    nav.nextLine(); /// This line you have to add (It consumes the \n character)
    for(int i=0;i<arr.length;i++)
    { arr[i]=nav.nextLine();
       nav.nextLine(); // to skip \n because nextLine issue in java
    }
    System.out.println("Element is array : "+ Arrays.toString(arr));

    Arrays.sort(arr,new Comparator<String>(){

      public int compare(String x,String y){

        return x.compareToIgnoreCase(y);
      }

    });

    System.out.println("SORTED : "+Arrays.toString(arr));
    System.out.println("Smallest  lexicographically String : "+arr[0]);
    System.out.println("Largest  lexicographically String : "+arr[arr.length-1]);
  }

}
