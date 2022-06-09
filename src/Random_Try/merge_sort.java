package Random_Try;

import java.util.Arrays;

/**
 * @author NAVEEN ,
 * 05 Jun, 2022
 */
public class merge_sort {

  public static void main(String ...strings){
    int arr[]={47,465,-9,5,66,88,1};
    System.out.println("BEFORE MERGE SORTING : "+ Arrays.toString(arr));
    merge_sort(arr,0,arr.length-1);
    System.out.println("AFTER MERGE SORTING : "+ Arrays.toString(arr));
  }
   public static void merge_sort(int arr[],int l,int r){

    if(l<r){

      int mid=(l+r)/2;
      merge_sort(arr,l,mid);
      merge_sort(arr,mid+1,r);
      merge(arr,l,mid,r);
    }

   }

   public static void merge(int arr[],int l,int mid,int r){

    int left[]=new int[mid-l+1];
    int right[]=new int[r-mid];
    int array[]=new int[r-l+1];

    for(int i=0;i<left.length;i++)
        left[i]=arr[l+i];
    for(int j=0;j<right.length;j++)
        right[j]=arr[j+mid+1];

    int i=0,j=0,z=0;

    while (i< left.length && j<right.length){
        if(left[i]<right[j])
            array[z++]=left[i++];
        else
            array[z++]=right[j++];
    }

    while (i< left.length)
        array[z++]=left[i++];
    while (j< right.length)
        array[z++]=right[j++];


    for(int c=0;c< array.length;c++)
        arr[l+c]=array[c];


   }


}
