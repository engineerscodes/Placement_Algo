package Accenture;

import java.util.HashMap;

/**
 * @author NAVEEN ,
 * 15 Aug, 2022
 */
public class Occurrance {

  public static void main(String agr[]){

    HashMap<Integer,Integer> map=new HashMap<>();
    int arr[]={1,2,3,2,1};
    for(int i=0;i<arr.length;i++){
       map.put(arr[i],map.getOrDefault(arr[i],0)+1);
    }
    System.out.println(map);

  }

}
