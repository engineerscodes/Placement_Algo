package EXAM;

/**
 * @author NAVEEN ,
 * 19 Aug, 2022
 */
public class Pattern {



  public static void main(String agr[]){


    int n=9 ; //no of rows

    for(int i=1;i<=n;i++){

      for(int j=n;j>=i;j--){
        System.out.print(" ");
      }
      System.out.print("*");
      for(int j=1;j<2*(i-1);j++){
        System.out.print(" ");
      }
      if(i!=1){
        System.out.print("*");
      }
      System.out.println();

    }
    for(int i=n-1;i>=1;i--){

      for(int j=n;j>=i;j--){
        System.out.print(" ");
      }
      System.out.print("*");
      for(int j=1;j<2*(i-1);j++){
        System.out.print(" ");
      }
      if(i!=1){
        System.out.print("*");
      }

      System.out.println();

    }



  }



}
