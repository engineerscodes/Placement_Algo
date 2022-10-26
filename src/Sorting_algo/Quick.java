package Sorting_algo;

import java.util.Arrays;

/**
 * @author NAVEEN ,
 * 08 Sep, 2022
 */
public class Quick {

    public static void main(String agr[]){


        int arr[]={ 10, 7, 8, 9, 1, 5};
        System.out.println("Array before sorting : "+Arrays.toString(arr));
        quick(arr,0,arr.length-1);
        System.out.println("Array After sorting : "+Arrays.toString(arr));

    }


    public static void quick(int arr[],int l,int r){

        if(l<r){

            int piIndex=partition(arr,l,r);
            quick(arr,l,piIndex-1);
            quick(arr,piIndex+1,r);
        }

    }

    public static int  partition(int arr[],int l,int r){

        int pivot=arr[r];

        int i=l;
        for(int j=l;j<=r-1;j++){
            // lesser values | pivot | higher values
            if(arr[j]<=pivot){
                 //if lesser than pivot swap it
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
        }
        //swap pivot
        int temp=arr[i];
        arr[i]=pivot;
        arr[r]=temp;
       // System.out.println(Arrays.toString(arr)+"  "+i+" r"+r);
        return i;
    }

}
