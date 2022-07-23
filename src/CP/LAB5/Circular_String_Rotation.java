package CP.LAB5;
import java.util.*;
/**
 * @author NAVEEN ,
 * 14 Jul, 2022
 */
public class Circular_String_Rotation {

    public static void main(String args[]){

        System.out.println("Enter String : ");
        String str=new Scanner(System.in).next();
        System.out.println("String before rotate : "+str);
        String r_str=str.substring(1)+str.substring(0,1);
        System.out.println("String after one rotation : "+r_str);


    }


}
