package Accenture;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author NAVEEN ,
 * 15 Aug, 2022
 */
public class Two_sum {

  public static  void main(String agr[]){

    int arr[]={5,7,11,3};
    int target=10;
    System.out.println(sum(arr,target));
  }

  public static ArrayList<Integer> sum(int arr[], int k){

    ArrayList<Integer> res=new ArrayList<>();
    HashSet<Integer> set=new HashSet<>();
    for(int i=0;i<arr.length;i++){

      if(set.contains(arr[i])){
         res.add(arr[i]);
         res.add(k-arr[i]);
         break;
      }else{
        set.add(k-arr[i]);
      }


    }

   return res;

  }


}
