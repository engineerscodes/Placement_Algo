package Array_Problems.SW;

import java.util.*;

/**
 * @author NAVEEN ,
 * 05 Sep, 2022
 */
public class merge_sort {



  public static void main(String agr[]){


    System.out.println("-------".replace("-","------")+"MERGE SORT"+"-------".replace("-","------"));

    int arr[]={-1,-10,0,51,45,20,88,99,11,-12,899,-8};

    System.out.println("Array before Merge : "+Arrays.toString(arr));

    merge(0,arr.length-1,arr);
    System.out.println("Array After Merge : "+Arrays.toString(arr));
  }


  public static void merge(int l,int r, int arr[]){

    if(l<r){

      int mid=(l+r)/2;

      merge(l,mid,arr);
      merge(mid+1,r,arr);
      meger_sort(l,mid,r,arr);
    }
  }


  public static void meger_sort(int l,int mid,int r, int arr[]){

    int left[]=new int[mid-l+1];
    int right[]=new int[r-mid];
    int temp[]=new int[r-l+1];

    for(int i=0;i<left.length;i++)
      left[i]=arr[i+l];
    for(int i=0;i<right.length;i++){
        right[i]=arr[mid+1+i];
    }

    int count=0;
    int i=0,j=0;

    while (i<left.length && j<right.length){
      if(left[i]<right[j]){
        temp[count++]=left[i++];
      }else{
        temp[count++]=right[j++];
      }
    }

    while (i<left.length)
      temp[count++]=left[i++];
    while (j< right.length)
      temp[count++]= right[j++];


    for(int c=0;c<temp.length;c++){
      arr[l+c]=temp[c];
    }









  }



}
