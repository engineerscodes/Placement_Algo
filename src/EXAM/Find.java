package EXAM;

/**
 * @author NAVEEN ,
 * 23 Aug, 2022
 */

/*
Given a sorted array of n integers containing all integers in range from 1 to n-1 i.e. exactly one integer occurs twice. The task is to find the repeating integer in an array, in the most time optimal way.
Example 1 :
Input : arr[] = { 1, 2 , 3 , 4 , 4}
Output : 4

Example 2:
Input : arr[] = { 1 , 1 , 2 , 3 , 4, 5}
Output : 1

* */
public class Find {


  public static void main(String arg[]){

    int size=5;
    int arr[]={1,2,3,4,4};


    find(arr,0,arr.length-1,arr.length-1);

  }

  public static void find(int arr[],int l,int r,int size){

    if(l<r){
      //System.out.println(r+" mid "+l);
      int mid=(r+l)/2;
      //System.out.println(mid);
      if( ( arr[mid]==arr[mid+1]) || arr[mid-1]==arr[mid]){
         System.out.println(arr[mid]);
         return;
      }
      else {
        int val=arr[mid];
        if(val==mid+1){
          //System.out.println(val+ " = "+mid);
          find(arr,mid+1,r,size);
        }else{
          //System.out.println(val+ "   - "+mid);
          find(arr,l,mid-1,size);
        }
      }

    }


  }

}
