package Array_Problems;

import java.util.ArrayList;
import java.util.*;

/**
 * @author NAVEEN ,
 * 10 Aug, 2022
 */
public class Longest_increasing_subsequence {
  static ArrayList<List<Integer>> sub=new ArrayList<>();
  public static void main(String agr[]){

    int arr[]=new int[]{10,9,2,5,3,7,101,18};
    ArrayList<Integer> a=new ArrayList<>();
    for(int  i=0;i<arr.length;i++){
      a.add(arr[i]);
    }
    ArrayList<Integer> res=new ArrayList<>();
    subsequence(a,res);
    System.out.println(sub);
  }

    public static void subsequence(ArrayList<Integer> a,ArrayList<Integer> res){

       if(a.size()==0 ){
         if(res.size()!=0)
            sub.add(res);
         return;
       }
       ArrayList<Integer> tempA=new ArrayList<>(a);
       ArrayList<Integer> tempR=new ArrayList<>(res);
       ArrayList<Integer> tempR2=new ArrayList<>(res);
       Integer t=tempA.get(0);
       tempA.remove(0);
       tempR.add(t);
       subsequence(tempA,tempR);
       subsequence(tempA,tempR2);

    }

}
