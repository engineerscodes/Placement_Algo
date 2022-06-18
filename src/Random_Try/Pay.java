package Random_Try;

import java.util.Scanner;

/**
 * @author NAVEEN ,
 * 15 Jun, 2022
 */
public class Pay {
  static float salary=0;
  public static void main(String args[]){

    Scanner nav=new Scanner(System.in);

    int basic_pay,hours_worked;
    System.out.println("ENTER BASIC PAY : ");
    basic_pay=nav.nextInt();
    System.out.println("ENTER HOURS WORKED : ");
    hours_worked=nav.nextInt();

    if(hours_worked<=35)
      salary=basic_pay*hours_worked;
    else
      salary= (float) (basic_pay*(0.1));

    System.out.print("TOTAL PAY : "+salary);
  }
}
