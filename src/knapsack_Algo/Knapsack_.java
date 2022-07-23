package knapsack_Algo;

import java.util.Arrays;

/**
 * @author NAVEEN ,
 * 16 Jul, 2022
 */
public class Knapsack_ {


    public static void main(String arg[]){

        int wei[]={10,20,30};
        int profit[]={60,100,120};
        System.out.println("Weights : "+ Arrays.toString(wei));
        System.out.println("Profits : "+Arrays.toString(profit));
        int  capacity=50;

        System.out.println("MAX PROFIT : "+Knap_sack(wei,wei.length,profit,capacity));


    }


    public static int Knap_sack(int wei[],int w, int[] p, int cap){
        if(w==0 || cap==0)
            return 0;

        if(wei[w-1]>cap)
            return Knap_sack(wei,w-1,p,cap);

        else{
            return Math.max(Knap_sack(wei,w-1,p,cap),p[w-1]+Knap_sack(wei,w-1,p,cap-wei[w-1]));
        }



    }

}
