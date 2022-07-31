package DP;

/**
 * @author NAVEEN ,
 * 28 Jul, 2022
 */
public class fib_n {
    static  int dp[]=new int[14];
    public static void main(String arg[]){

        System.out.println(fib(7));
        System.out.println(fib(13));


    }

    public static int fib(int n){
        if(n<=2)
            return 1;
        if(dp[n]!=0)
            return dp[n];

        dp[n]=fib(n-1)+fib(n-2);
        return dp[n];
    }

}
