package Sorting_algo;

import java.util.*;

public class SelectionSort {

    public static void main(String ...strings){
        System.out.println("selection sort algo ");
        Integer arr[]={10,2};
        System.out.println("Before Sorting : "+Arrays.toString(arr));
        sorting(arr);
        System.out.println("After Sorting : "+Arrays.toString(arr));
        Arrays.sort(arr,new Comparator<Integer>(){
            public int compare(Integer x,Integer y){
                String XY=x+""+y;
                String YX=y+""+x;
                return YX.compareTo(XY);
            }
        });
        System.out.println("After Sorting : "+Arrays.toString(arr));
    }

    public static void sorting(Integer arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min=arr[i];
            int pos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<min)
                {   min=arr[j];
                    pos=j;
                }
            }
            int temp=arr[i];
            arr[i]=min;
            arr[pos]=temp;
        }
    }

}
