package Array_Problems;

import java.util.Arrays;

/**
 * @author NAVEEN ,
 * 11 Aug, 2022
 */
public class Min_Room_needed {

    public static void main(String agr[]){

        int arr[]=new int[]{1,2,3};
        System.out.println(Arrays.toString(arr));
        int end[]=new int[]{3,3,3};
        for(int i=0;i<end.length;i++){
            end[i]=arr[i]+end[i];
        }
        System.out.println(Arrays.toString(end));
         int st=1;
         int en=0;
         int min_room=1;
         int max=1;
         while (st<=arr.length-1){

             if(arr[st]<end[en]){
                 min_room++;
                 max=Math.max(min_room,max);
             }
             if(en!=0 && end[en-1]<end[en]){
                 min_room--;
             }
             st++;
             en++;

         }

        System.out.println(max);
    }

}
