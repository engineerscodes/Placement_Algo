package Sorting_algo;

import java.util.*;

/**
 * @author NAVEEN ,
 * 06 Jul, 2022
 */
//https://www.geeksforgeeks.org/given-an-array-of-numbers-arrange-the-numbers-to-form-the-biggest-number/
public class XY_YX {


  public static void main(String agr[]){

    String str[]={"54", "546", "548", "60"};

    Arrays.sort(str,
            new Comparator<String>(){

              public int compare(String x,String y){

                String XY=x+y;
                String YX=y+x;
                return  YX.compareTo(XY);
              }

            });

    /*
    *  Arrays.sort(str,
            (x, y) -> {
              String XY=x+y;
              String YX=y+x;
              return  YX.compareTo(XY);
            });
    * */

    System.out.println(Arrays.toString(str));
  }


}
