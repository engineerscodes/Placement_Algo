package CP.LAB11;

import java.util.*;

/**
 * @author NAVEEN ,
 * 11 Aug, 2022
 */
public class Min_Room_needed {

    public static void main(String agr[]){

        Scanner nav=new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size=nav.nextInt();
        System.out.println("Enter start Time : ");
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=nav.nextInt();
        }
        System.out.println("Start time : "+Arrays.toString(arr));
        int end[]=new int[size];
        System.out.println("Enter Duration of the guests : ");
        for(int i=0;i<end.length;i++){
            end[i]=nav.nextInt();
        }
        System.out.print("So after adding start+duration -->end time :");
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

        System.out.println("Minimum Room needed : "+max);
    }

}
