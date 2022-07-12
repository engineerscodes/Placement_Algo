package CP.LAB4;

import java.util.*;
/**
 * @author NAVEEN ,
 * 09 Jul, 2022
 */
public class sum_duplicates {

  public static void main(String ...strings){

    Scanner nav=new Scanner(System.in);

    System.out.println("ENTER SIZE OF ARRAY : ");
    int size=nav.nextInt();
    int[] arr =new int[size];
    System.out.println("Enter Array Elements : ");
    for(int i=0;i<size;i++){
      arr[i]=nav.nextInt();
    }

    int sum=0;
    HashSet<Integer> set=new HashSet<>();

    for(int i=0;i<size;i++){

      if(set.contains(arr[i])){
         sum+=arr[i];
      }else{
        set.add(arr[i]);
      }

    }
    System.out.println("SUM OF DUPLICATES IS = "+sum);


  }

}
