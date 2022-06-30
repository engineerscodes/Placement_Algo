package CP;

import java.util.Arrays;

/**
 * @author NAVEEN ,
 * 30 Jun, 2022
 */
public class moveZero {


  public static void main(String args[]){

    int arr[]={4,5,0,1,0,5,0};

    System.out.println(Arrays.toString(arr));
    int index=0;

    for(int i=0;i<arr.length;i++)
        if(arr[i]!=0)
            arr[index++]=arr[i];

    for(;index<arr.length;index++)
      arr[index]=0;
    System.out.println("ZEROS AT END : "+Arrays.toString(arr));
  }


}
