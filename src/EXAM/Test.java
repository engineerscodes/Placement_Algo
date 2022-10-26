package EXAM;

/**
 * @author NAVEEN ,
 * 18 Aug, 2022
 */
import java.util.*;
public class Test {

  public static void main(String agr[]){

    int arr[]={};
    //[1,2,[3,4],[5,6,[7]]];
    ArrayList<int []> ar=new ArrayList();
    ar.add(new int[]{3,4});
    ar.add(new int[]{5,6});

    ArrayList<Integer> res=new ArrayList<>();

    for(int i=0;i<ar.size();i++){

      int temp[]= (int[]) ar.get(i);

      for(int j=0;j<temp.length;j++){
        res.add((Integer) temp[j]);
      }

    }

    System.out.println(res);

  }


}
