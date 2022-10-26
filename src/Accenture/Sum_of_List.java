package Accenture;

import java.util.ArrayList;
import java.util.List;

/**
 * @author NAVEEN ,
 * 15 Aug, 2022
 */
public class Sum_of_List {
  static int sum=0;
  public static void main(String  agr[]){
    List<Integer> l=new ArrayList<>();
    l.add(1);
    l.add(2);
    l.add(3);
    l.add(100);
    l.forEach((a)-> sum +=a);
    System.out.println(sum);
  }

}
