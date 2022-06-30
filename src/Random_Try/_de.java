package Random_Try;

import java.util.Scanner;

/**
 * @author NAVEEN ,
 * 30 Jun, 2022
 */
public class _de {


  public static void main(String args[]){

    String arr[]=new String[5];

    Scanner nav=new Scanner(System.in);
    for(int i=0;i<arr.length;i++)
       arr[i]=nav.next();
    try{
    for(int i=0;i< arr.length;i++){

      int num=Integer.parseInt(arr[i]);
      if(num<0)
        throw new Exception();
    }
    }catch (NumberFormatException e){
      System.out.println("Invalid input");
    } catch (Exception e) {
      System.out.println("Negative input");
    }


  }

}
