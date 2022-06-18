package Array_Problems;

import java.util.Arrays;

/**
 * @author NAVEEN ,
 * 09 Jun, 2022
 */
public class reverse {


    public static void main(String ...strings){

        int arr[]={1,2,4,5,7,8,99};
        System.out.println("Before : "+ Arrays.toString(arr));
        reverse(arr);
        System.out.println("After : "+ Arrays.toString(arr));
    }

    public static void reverse(int arr[]){

        for(int i=0,j=arr.length-1;i<j;i++,j--){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        //Integer

    }

}
