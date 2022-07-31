package DP;

import java.util.Arrays;

/**
 * @author NAVEEN ,
 * 31 Jul, 2022
 */
public class Grid_Traveler {


    public static void main(String agr[]){
        int rows=18;
        int col=18;
        //2333606220
        System.out.println(find(rows,col));


    }


    public static Long find(int r,int c){
        if(r==0 || c==0)
            return 0L;
        if(r==1 || c==1)
            return 1L;
        return find(r-1,c)+find(r,c-1);

    }

}
