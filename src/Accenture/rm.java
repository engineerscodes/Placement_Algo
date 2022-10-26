package Accenture;

import java.util.*;
import java.util.HashSet;

/**
 * @author NAVEEN ,
 * 15 Aug, 2022
 */
public class rm {

  public static void main(String agr[]){

    ArrayList<Integer> arr=new ArrayList<>();
    int num[]={10,70,10,5,1,1,3};
    HashSet<Integer> set=new HashSet<>();

    for(int i=0;i<num.length;i++){
      if(!set.contains(num[i])){
         arr.add(num[i]);
         set.add(num[i]);
      }
    }
    System.out.println(arr);


  }


}
