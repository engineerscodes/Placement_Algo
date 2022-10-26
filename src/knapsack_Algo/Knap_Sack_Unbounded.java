package knapsack_Algo;

/**
 * @author NAVEEN ,
 * 12 Aug, 2022
 */
public class Knap_Sack_Unbounded {


  public static void main(String arg[]){
    int W = 7697;
    int val[] = { 15, 12, 13 };
    int wt[] = { 148, 116, 134 };
    int res=knap(W,val,wt,val.length);

    System.out.println(res);

  }



  private static int knap(int w, int[] val, int[] wt, int n) {

    if(w==0|| n==0)
      return 0;
    if(wt[n-1]>w){
      return knap(w,val,wt,n-1);
    }
    else {
        int cost_for_n=(w/wt[n-1])*val[n-1];
        int wi_left=(w%wt[n-1]);
        System.out.println(cost_for_n+" "+wi_left);
        return Math.max(knap(w,val,wt,n-1),cost_for_n+knap(wi_left,val,wt,n-1));
    }


  }


}
