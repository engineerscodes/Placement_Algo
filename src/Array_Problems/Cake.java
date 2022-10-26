package Array_Problems;
import java.util.*;
/**
 * @author NAVEEN ,
 * 25 Sep, 2022
 */
public class Cake {




  public static void main(String arg[]){

    solve(3);

  }

  public static void solve(int n){

    int num=1;
    for(int i=0;i<n;i=i+2){
      String res="";
      for(int j=0;j<n-1;j++){
        System.out.print(num+"*");
        res=res+(num+(2*n))+"*";
        num++;
      }
      System.out.println(num);
      res=res+(num+(2*n));
      num++;
      if(i+1!=n)
     System.out.println(res);

    }


  }

}

//[1,2,3,6,9,8,7,4,5]
// 1 2 3 4 5 6 7 8 9