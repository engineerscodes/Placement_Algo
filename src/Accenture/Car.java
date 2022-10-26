package Accenture;

/**
 * @author NAVEEN ,
 * 15 Aug, 2022
 */
public class Car {

   static int sec_in_min=60;
  public static void main(String arg[]){

    int r1=20;
    int n=4;
    int r2=40;
    int x=300;
    int total_in_hr=Math.round(x/sec_in_min);
    int cost_for_first_n=r1*n;
    int after_n_hr=total_in_hr-n;
    int cost_after_nhr=after_n_hr*r2;
    System.out.println("Total Cost : "+(cost_after_nhr+cost_for_first_n));
  }

}
