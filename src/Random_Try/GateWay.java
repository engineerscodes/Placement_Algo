package Random_Try;

import java.util.Scanner;

/**
 * @author NAVEEN ,
 * 15 Jun, 2022
 */
public class GateWay {

  public static void main(String args[]){
    System.out.println("Number of Employees ids ");
    Scanner nav=new Scanner(System.in);
    String ids="AAAC13";
    int size=nav.nextInt();
    String employ[]=new String[size];
    for(int i=0;i<size;i++)
      employ[i]=nav.next();
    System.out.println("John entered employee ids");
    for(int i=0;i<size;i++)
      System.out.println(employ[i]);

    System.out.println("Employee ids,after correction ");
    for(int i=0;i<size;i++)
    { employ[i]=ids+employ[i].substring(6);
      System.out.println(employ[i]);
    }
  }

}
