package Sorting_algo;

import java.util.Arrays;

/**
 * @author NAVEEN ,
 * 05 Jun, 2022
 */
public class MergeSort {

  public static void main(String  ...string){

    int arr[]={45,-5,1,8,99,5,99999,20,6,91,56,3,8,1000};
    System.out.println("BEFORE ARRAY MERGE SORT : "+ Arrays.toString(arr));
    Merge_Sort(arr,0,arr.length-1);
    System.out.println("AFTER ARRAY MERGE SORT : "+ Arrays.toString(arr));

  }

  public static void Merge_Sort(int arr[],int l,int r){

    if(l<r) {
      int mid = (l + r) / 2;
      Merge_Sort(arr, l, mid);
      Merge_Sort(arr, mid+1, r);
      merge(arr,l,mid,r);
    }
  }

  public static  void merge(int arr[],int l,int mid,int r){
     int left[]=new int[mid-l+1];
     int rigth[]=new int[r-mid];
     int array[]=new int[r-l+1];

     for(int i=0;i<left.length;i++)
       left[i]=arr[l+i];
     for(int j=0;j<rigth.length;j++)
       rigth[j]=arr[mid+1+j];
     int i=0;
     int j=0;
     int z=0;
     while (i<left.length && j< rigth.length){
         if(left[i]< rigth[j])
           array[z++]=left[i++];
         else
           array[z++]=rigth[j++];
     }

     while (i<left.length)
     {
       array[z++]= left[i++];
     }
     while (j< rigth.length){
       array[z++]= rigth[j++];
     }
     //System.out.println(array.length);
     for(int c=0;c< array.length;c++){
       arr[l+c]=array[c];
     }

  }

}
