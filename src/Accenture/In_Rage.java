package Accenture;

import java.util.HashSet;

/**
 * @author NAVEEN ,
 * 15 Aug, 2022
 */
public class In_Rage {

  public static void main(String agr[]){

    int n1=11;
    int n2=15;
    int count=0;
    while (n1<=n2){
      HashSet<String> set=new HashSet<>();
      String num[]=(n1+"").split(""); // [1,3]
      for(int i=0;i<num.length;i++){
        set.add(num[i]);
      } // [1,3]
      if(set.size()==num.length)
      {
        count++;
      }
      n1++;

    }

    System.out.println(" No of Non Repeating number "+count);
  }

}
