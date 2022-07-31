package Array_Problems;

import java.util.Arrays;

/**
 * @author NAVEEN ,
 * 30 Jul, 2022
 */
public class Next_Great {


  public static void main(String arg[]){

    int arr[]={9,72,45,10,10008,6};
     int sum[]=new int[arr.length];
     int res[]=new int[arr.length];
    for(int i=0;i<arr.length;i++){
      sum[i]=get_sum(arr[i]);
    }
    int max=-1;
    int index=-1;
    for(int i=sum.length-1;i>=0;i--){

      if(max<sum[i]){
        max=sum[i];
        index=i;
        res[i]=max;
      }
      else if(max>sum[i]){
        res[i]=max;
      }
      else if(max==sum[i]){
        if(arr[i]>=arr[index]){
           index=i;
        }
        res[i]=arr[index];
      }

    }
    res[arr.length-1]=-1;
    System.out.println(Arrays.toString(sum));
    System.out.println("Index "+Arrays.toString(res));
  }

  public static  int get_sum(int n){
    int sum=0;
    while (n>0){
      sum=sum+n%10;
      n=n/10;
    }

    return sum;

  }


}
