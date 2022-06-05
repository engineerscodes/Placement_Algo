package Sorting_algo;

import java.util.Arrays;

/**
 * @author NAVEEN ,
 * 04 Jun, 2022
 */
public class Bubble_Sort {

  public static void main(String ...strings){

    System.out.println("BUBBLE SORT ALGO");
    int arr[]={64, 34, 25, 12, 22, 11, 90};
    System.out.println("BEFORE SORTING : "+ Arrays.toString(arr));
    b_sort(arr);
    System.out.println("AFTER SORTING : "+Arrays.toString(arr));


  }

  public static  void b_sort(int arr[]){

    for(int i=0;i<arr.length-1;i++){
      for(int j=0;j<arr.length-1-i;j++){
         if(arr[j]>arr[j+1]){
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
         }
      }
    }

  }

}
