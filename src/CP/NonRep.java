package CP;

import java.util.*;

/**
 * @author NAVEEN ,
 * 30 Jun, 2022
 */
public class NonRep {

  public static void main(String args[]){

    int arr[]={9,4,9,6,7,4};

    HashMap<Integer,Integer> map=new HashMap<>();

    for(int i=0;i<arr.length;i++){
        if(map.containsKey(arr[i]))
          map.put(arr[i],map.get(arr[i])+1);
        else
          map.put(arr[i],1);
    }
    for(int i=0;i<arr.length;i++)
    {
      if(map.get(arr[i])==1)
      { System.out.println(arr[i]);
         break;}
    }
  }


}
