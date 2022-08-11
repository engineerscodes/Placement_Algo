package CP.LAB11;

import java.util.*;

/**
 * @author NAVEEN ,
 * 11 Aug, 2022
 */
public class A_B_Win {


  public static void main(String args[]){

    Scanner nav=new Scanner(System.in);
    System.out.println("Enter The size of Array : ");
    int size=nav.nextInt();
    int A[]=new int[size];
    int B[]=new int[size];
    System.out.println("Enter A elements");
    for(int i=0;i<A.length;i++){
      A[i]=nav.nextInt();
    }
    System.out.println("Enter B elements");
    for(int j=0;j<B.length;j++)
      B[j]=nav.nextInt();

    System.out.println("A : "+Arrays.toString(A)+"\nB : "+Arrays.toString(B));

    int A_score=0;
    int B_score=0;
    for(int i=0;i<A.length;i++){
      if(A[i]<B[i])
        B_score++;
      else if(A[i]>B[i])
         A_score++;
      else{
        B_score++;
        A_score++;
      }
    }

    if(A_score<B_score){
      System.out.println("B WINS");
    }
    else if(A_score>B_score)
      System.out.println("A WINS");
    else
      System.out.println("A & B DRAW");

  }

}
