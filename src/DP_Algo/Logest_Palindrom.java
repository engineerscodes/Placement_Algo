package DP_Algo;

import java.util.*;
/**
 * @author NAVEEN ,
 * 09 Jun, 2022
 */
//longest palindrome substring
public class Logest_Palindrom {

    public static void main(String ...args){

        String str[]="aaaabaaa".split("");


        int dp[][]=new int[str.length][str.length];

        for(int i=0;i<str.length;i++){
            dp[i][i]=1;
            if(i!=str.length-1) {
                if (str[i].equals(str[i + 1]))
                    dp[i][i + 1] = 1;
                else
                    dp[i][i + 1] = 0;
            }

        }

       for(int i=0;i<dp.length;i++)
           System.out.println(Arrays.toString(dp[i]));




        for(int i=0;i<dp.length;i++)
            System.out.println(Arrays.toString(dp[i]));

    }
}
