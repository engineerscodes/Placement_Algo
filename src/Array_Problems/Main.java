package Array_Problems;

import java.util.*;

/**
 * @author NAVEEN ,
 * 23 Sep, 2022
 */
public class Main {


    public static void main(String agr[]){

     Scanner nav=new Scanner(System.in);
     int sum=nav.nextInt();

     String str=nav.next();
     String num[]=str.split(",");
     int arr[]=new int[num.length];
     for(int i=0;i<arr.length;i++){
         arr[i]=Integer.parseInt(num[i]);
     }

    System.out.println(Arrays.toString(arr));


    }

}
