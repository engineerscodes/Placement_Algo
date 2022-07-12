package Random_Try;

import java.util.Scanner;

/**
 * @author NAVEEN ,
 * 03 Jul, 2022
 */
public class Eng {

    public static void main(String args[]){
        Scanner nav=new Scanner(System.in);
        int size=nav.nextInt();
        int arr[]=new int[size];
        String str="";
        for(int i=0;i<size;i++)
        { arr[i]=nav.nextInt();
          str=str+arr[i];
        }
       int num=Integer.parseInt(str,2);

        System.out.println((char)(num+'a'));

    }

}
