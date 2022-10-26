package Graph;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author NAVEEN ,
 * 20 Sep, 2022
 */
public class Max {

  static int vertex;

  static ArrayList<Integer> arr[];

  Max(int n){
    vertex=n+1;
    arr=new  ArrayList[vertex];
    for(int i=0;i<vertex;i++)
      arr[i]=new ArrayList<>();
  }
  public static void addEdge(int src,int des){
    if(src!=des) {
      arr[src].add(des);
    }
    System.out.println(src+"src "+des);
  }


  public static void main(String agr[]){


    Scanner nav=new Scanner(System.in);
    int n=nav.nextInt();
    Max g=new Max(n);
    for(int i=1;i<=n;i++){
      g.addEdge(i,nav.nextInt());
    }

    for(int i=0;i<arr.length;i++)
    System.out.println(g.arr[i]);

  }
}
