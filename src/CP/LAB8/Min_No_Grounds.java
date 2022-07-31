package CP.LAB8;

import java.util.Arrays;
import java.util.*;

/**
 * @author NAVEEN ,
 * 23 Jul, 2022
 */
//https://www.youtube.com/watch?v=FdzJmTCVyJU -meeting room problems

public class Min_No_Grounds {
    public static void main(String args[]){

        Scanner nav=new Scanner(System.in);
        System.out.println("Enter Size of Matrix : ");
        int size=nav.nextInt();
        int arr[][]=new int[size][2];
        System.out.println("Enter start and end time of matches : ");
        for(int i=0;i<size;i++){

            for(int j=0;j<2;j++){
              arr[i][j]=nav.nextInt();
            }


        }



        int[] start_time =new int[size];
        int[] end_time=new int[size];
        for(int i=0;i<size;i++){
            start_time[i]=arr[i][0];
        }
        for(int i=0;i<size;i++){
            end_time[i]=arr[i][1];
        }
        Arrays.sort(start_time);
        Arrays.sort(end_time);
        System.out.println("Sorted by Start Time : ");
        System.out.println(Arrays.toString(start_time));

        System.out.println("Sorted by End Time : ");
        System.out.println(Arrays.toString(end_time));

        int count=0;
        int maxCount=0;
        int start=0;
        int end=0;
         while (start<size){
             //since sorted check second event before first ends
            // overlap

            if(start_time[start]<end_time[end]){
                count++;
                start++;

            }//if no overlap even if arr[i]start == end
            else{
                end++;
                count--;
            }
            maxCount=Math.max(count,maxCount);
        }
        System.out.println("MIN GROUND NEEDED  :  "+maxCount);


    }

}
