package Array_Problems;
import java.util.*;
/**
 * @author NAVEEN ,
 * 09 Jun, 2022
 */
public class Move_All_Neg {

  public static void main(String ...args){

    int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
    move_all_neg(arr);
    System.out.println("Array : "+Arrays.toString(arr));

  }

  public static  void move_all_neg(int arr[]){

    int f=0;


    for(int i=0;i<arr.length;i++){

      if(arr[i]<0){
        int temp=arr[f];
        arr[f]=arr[i];
        arr[i]=temp;
        f++;
      }

    }

  }

}
