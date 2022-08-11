package Array_Problems;

import Generic.Main;

/**
 * @author NAVEEN ,
 * 10 Aug, 2022
 */
public class Reach_End {

    static int min=Integer.MAX_VALUE;
    public static void main(String agr[]){

        int n=10;
        find(0,n,0);
        System.out.println(min);

    }

    public static  void find(int start,int end,int count){

        if(start<0 && start<-end){
            return;
        }
        if(start>0 && start>end){
            return;
        }

        if(start==end){
            //System.out.println(count);
            min= Math.min(count,min);
            return;
        }
        else{
           find(start+count+1,end,count+1);
           find(start-(count+1),end,count+1);
        }

    }





}
