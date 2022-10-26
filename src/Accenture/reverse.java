package Accenture;

import java.util.Arrays;

/**
 * @author NAVEEN ,
 * 15 Aug, 2022
 */
public class reverse {

    public static void  main(String arg[]){

        int a[]={1,2,3,4,5};
        System.out.println("Initial Array "+ Arrays.toString(a));
        System.out.println("Reverse Array : ");
        for(int i=a.length-1;i>=0;i--)
            System.out.print(a[i]+" ");

    }

}
