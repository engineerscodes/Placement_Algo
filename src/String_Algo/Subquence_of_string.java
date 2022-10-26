package String_Algo;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author NAVEEN ,
 * 21 Jul, 2022
 */
public class Subquence_of_string {


    public static  void main(String arg[]){

        String str="abc";

        ArrayList<String> arr=new ArrayList<>();
        StrPrint(str,"",arr);
        //Collections.sort(arr);
        System.out.println(arr);

    }


    public static void StrPrint(String str,String ans,ArrayList<String> arr){

        if(str.length()==0){
            arr.add(ans);
        }else{
            StrPrint(str.substring(1),ans,arr); // when first character is Not Included
            StrPrint(str.substring(1),ans+str.charAt(0),arr); // when first character is Included
        }

    }

}
