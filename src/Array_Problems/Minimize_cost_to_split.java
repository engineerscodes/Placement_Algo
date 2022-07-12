package Array_Problems;

import java.util.*;

/**
 * @author NAVEEN ,
 * 12 Jul, 2022
 */
public class Minimize_cost_to_split {

    public static void main(String arg[]){

        Integer arr[]={  9, 20, 7, 8};
        int k=2;

        Arrays.sort(arr,new Comparator<Integer>(){

            public  int compare(Integer a,Integer b){
                return -1*(a-b);
            }

        });

        System.out.println("ARRAY AFTER SORTING : "+Arrays.toString(arr));

        int sum=0;
        int count=1;
        for(int i=0;i< arr.length;i=i+k){

            for(int j=i;j<i+k && j<arr.length ;j++){
                sum=sum+arr[j]*(count);
            }
          count++;
        }

       System.out.println(sum);


    }

}
