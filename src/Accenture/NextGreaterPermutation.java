package Accenture;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author NAVEEN ,
 * 15 Aug, 2022
 */
public class NextGreaterPermutation {

    public static void main(String arg[]){

        int arr[]={1,2,3,4};

       ArrayList<Integer> ar=new ArrayList<>();
        ArrayList<Integer> res=new ArrayList<>();
       for(int i=0;i<arr.length;i++)
           ar.add(arr[i]);

       permute(ar,res,ar.size());

    }

   static public void permute(ArrayList<Integer> arr,ArrayList<Integer> res,int n){

        if(arr.size()==0){
            System.out.println(res);
            return;
        }

        for(int i=0;i<arr.size();i++){

            int fixed=arr.get(i);
            ArrayList<Integer> Tarr=new ArrayList<>(arr);
            Tarr.remove(i);
            ArrayList<Integer> Tres=new ArrayList<>(res);
            Tres.add(fixed);
            permute(Tarr,Tres,n);


        }


    }

}
