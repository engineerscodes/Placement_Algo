package Accenture;

import java.util.ArrayList;

/**
 * @author NAVEEN ,
 * 15 Aug, 2022
 */
public class Ten {

  public static void main(String agr[]){

    ArrayList<Integer> arr=new ArrayList<>();
    int nums[]={10,12,5,30,40,50,100,55};
    int count=0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]%10==0)
          arr.add(nums[i]);
        else
        { arr.add(count++,nums[i]);
        }
    }
    System.out.println(arr);

  }

}
