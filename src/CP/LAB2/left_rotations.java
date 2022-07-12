package CP.LAB2;

/**
 * @author NAVEEN ,
 * 02 Jul, 2022
 */
import java.util.*;
public class left_rotations {

    public static void main(String args[]){
        Scanner nav=new Scanner(System.in);
        System.out.println("ENTER SIZE OF ARRAY : ");
        int size=nav.nextInt();
        System.out.println("ENTER K : ");
        int K=nav.nextInt();
        int arr[]=new int[size];
        System.out.println("ENTER ELEMENT IN ARRAY :");
        for(int i=0;i<arr.length;i++)
         arr[i]=nav.nextInt();
        System.out.println("ELEMENT IN ARRAY BEFORE LEFT ROTATIONS \n"+Arrays.toString(arr));
        int new_arr[]=new int[size];
        for(int i=0;i<arr.length;i++){

         new_arr[i]=arr[(i+(K%size))%size];

        }

        System.out.println("ELEMENT IN ARRAY AFTER K {"+K+"} LEFT ROTATIONS \n"+Arrays.toString(new_arr));

    }

}
