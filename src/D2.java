import java.util.Arrays;

/**
 * @author NAVEEN ,
 * 08 Sep, 2022
 */
public class D2 {


  public static void main(String agrs[]){


    int arr[][]={
            {77,11,22,3},
            {11,89,1,12},
            {32,11,56,7},
            {11,22,44,33}
    };

    for(int i=0;i<arr.length;i++){
      System.out.println(Arrays.toString(arr[i]));
    }

    for(int i=0;i<arr.length;i++){
      Arrays.sort(arr[i]);
    }
    for(int i=0;i<arr.length;i++){
      System.out.println(Arrays.toString(arr[i]));
    }


  }

}
