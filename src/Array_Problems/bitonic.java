package Array_Problems;

import java.util.PriorityQueue;

/**
 * @author NAVEEN ,
 * 25 Aug, 2022
 */
public class bitonic {


  public static void main(String agr[]){


    int arr[]={-3, 9, 11, 20, 17, 5, 1};
    int index=1;
    for(;index<arr.length;index++){

      if(arr[index-1]<arr[index]){
        continue;
      }
      else{
        break;
      }

    }
    System.out.println(" - "+index);
    binary_search(arr,20,0,index-1);
    binary_search_2(arr,17,index,arr.length-1);

  }


  public static int binary_search(int arr[],int x,int l,int r){

    if(l<=r){

      int mid=(l+r)/2;

      if(arr[mid]==x){
        System.out.println(mid+" found ");
        return mid;
      }
      else if (x<arr[mid]) {
        return binary_search(arr,x,l,mid-1);
      }
      else {
        return binary_search(arr, x, mid + 1, r);
      }

    }
    return -1;
  }

  public static int binary_search_2(int arr[],int x,int l,int r){

    if(l<=r){

      int mid=(l+r)/2;

      if(arr[mid]==x){
        System.out.println(mid+" found ");
        return mid;
      }
      else if (x<arr[mid]) {
        return binary_search_2(arr,x,mid+1,r);
      }
      else {
        return binary_search_2(arr, x,l, mid-1);
      }

    }
    return -1;
  }






}
