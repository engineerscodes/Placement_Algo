package CP.LAB2;

import java.util.*;
/**
 * @author NAVEEN ,
 * 02 Jul, 2022
 */
public class Reverse_Half {
    public  static void main(String args[]){

        Scanner nav=new Scanner(System.in);
        System.out.println("ENTER SIZE OF ARRAY : ");
        int size=nav.nextInt();
        int arr[]=new int[size];
        System.out.println("ENTER ELEMENT IN ARRAY :");
        for(int i=0;i<arr.length;i++)
            arr[i]=nav.nextInt();
        System.out.println("ELEMENT IN ARRAY BEFORE REVERSING  \n"+Arrays.toString(arr));
        reverse(arr,arr.length);

    }
    public static void reverse(int arr[],int size){
        int new_arr[]=new int[size];
        int mid,l_max,r_min;
        mid=size/2;
        if(size%2==0)
        {
            l_max=mid-1;
            r_min=mid;
        } else{
            l_max=mid-1;
            r_min=mid+1;
            new_arr[mid]=arr[mid];
        }
        int index=0;
        while (l_max>=0){
            new_arr[index++]=arr[l_max--];
        }
        int len=size-1;
        while (r_min<size){
              new_arr[len--]=arr[r_min++];
        }

        System.out.println("REVERSE HALF  ARRAY :\n"+Arrays.toString(new_arr));

    }
}
