package CP.LAB7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author NAVEEN ,
 * 20 Jul, 2022
 */
public class Rabbit_Hole {

    public static void main(String arg[]){


        Scanner nav=new Scanner(System.in);
        System.out.println("Enter No of Rabbit : ");
        int n=nav.nextInt();
        System.out.println("No of Holes & Rabbit are : "+n);

        System.out.println("Enter Position of Rabbits ");
        int rabbit[]=new int[n];
        for (int i=0;i<n;i++){
            rabbit[i]=nav.nextInt();
        }
        System.out.println("Rabbits : "+ Arrays.toString(rabbit));
        System.out.println("Enter position of Holes : ");
        int Holes[]=new int[n];
        for(int i=0;i<n;i++)
            Holes[i]=nav.nextInt();
        System.out.println("Position of Holes are : "+Arrays.toString(Holes));

        Arrays.sort(rabbit);
        Arrays.sort(Holes);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(Math.abs(Holes[i]-rabbit[i]),max);
        }

        System.out.println("MAX TIME TAKEN IS : "+max);



    }



}
