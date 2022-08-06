package DP;

import java.util.Arrays;

/**
 * @author NAVEEN ,
 * 31 Jul, 2022
 */
public class Grid_Traveler {

    static long arr[][];
    Grid_Traveler(int r,int c){
        arr=new long[r+1][c+1];
    }
    public static void main(String agr[]){

        int rows=3;
        int col=3;
        //2333606220

        int grid[][]={{0,0,0},{0,1,0},{0,0,0}};
        for(int i=0;i<3;i++)
        System.out.println(Arrays.toString(grid[i]));

        new Grid_Traveler(rows,col);
        //System.out.println(find(rows,col));
        System.out.println(findPath(grid,3,3,0,0));
    }


    public static Long find(int r,int c){
        if(r==0 || c==0)
            return 0L;
        if(r==1 && c==1)
            return 1L;
        /*

        if(arr[r-1][c]!=0){
            return arr[r - 1][c];
        }
        if(arr[r][c-1]!=0){
            return arr[r][c-1];
        }
        arr[r-1][c]=find(r-1,c);//  down
        arr[r][c-1]=find(r,c-1); //right
        return arr[r-1][c]+arr[r][c-1];
         */
        if(arr[r-1][c]==0){
            arr[r-1][c]=find(r-1,c);
        }
        if(arr[r][c-1]==0){
            arr[r][c-1]=find(r,c-1);
        }
        return arr[r-1][c]+arr[r][c-1];
    }

    public static int findPath(int grid[][],int r,int c,int i,int j){

        if(r==0 || c==0)
            return 0;
        if(r==1 && c==1){
            return 1;
        }

        if(grid[i][j]==1 || grid[i][j]==1){
            System.out.println(i+" "+j);
            return 0;
        }
        return findPath(grid,r-1,c,i+1,j)+findPath(grid,r,c-1,i,j+1);


    }

}
