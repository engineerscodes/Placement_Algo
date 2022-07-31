package Array_Problems.SW;

import java.util.Arrays;

/**
 * @author NAVEEN ,
 * 24 Jul, 2022
 */
public class Max_Sub_array {

  public static void main(String arg[]){

    int arr[]={1, 4, 2, 10, 2, 3, 1, 0, 20};
    System.out.println("Array : "+ Arrays.toString(arr));
    int k=4;
    int sum=0;
    for(int i=0;i<k;i++){
         sum+=arr[i];
    }
    int left=0;
    int right=k;
    int max=Integer.MIN_VALUE;
    while (right<arr.length){
          sum=sum-arr[left++];
          sum=sum+arr[right++];
          if(max<sum)
           max=sum;

    }

   System.out.println(max);





  }

}
