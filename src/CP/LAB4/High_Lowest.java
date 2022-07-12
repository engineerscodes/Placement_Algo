package CP.LAB4;

import java.util.*;
/**
 * @author NAVEEN ,
 * 09 Jul, 2022
 */
public class High_Lowest {

  public static void main(String args[]){

      Scanner nav=new Scanner(System.in);

      System.out.println("ENTER SIZE OF ARRAY : ");
      int size=nav.nextInt();
      Integer[] arr =new Integer[size];
      System.out.println("Enter Element in Array : ");
      for(int i=0;i<size;i++){
          arr[i]=nav.nextInt();
      }
      System.out.println("Enter M value : ");
      int m=nav.nextInt();

      int highest_product=1;
      int highest_sum=0;
      int lowest_sum=0;
      int lowest_product=1;


      Arrays.sort(arr,new Comparator<Integer>(){

          public int compare(Integer a,Integer b){
              return -1*(a-b);
          }
      });
      System.out.println("AFTER SORTING  DESCENDING : "+Arrays.toString(arr));
      HashSet<Integer> set=new HashSet<>();
      int uni_count=0;
      for(int i=0;i<size;i++){

          if(!set.contains(arr[i]) && uni_count<m){
              highest_product*=arr[i];
              highest_sum+=arr[i];
              set.add(arr[i]);
              uni_count++;
          }

      }
      set=new HashSet<>();
      uni_count=0;
      for(int i=size-1;i>=0;i--){

          if(!set.contains(arr[i]) && uni_count<m){
              lowest_product*=arr[i];
              lowest_sum+=arr[i];
              set.add(arr[i]);
              uni_count++;
          }

      }

      System.out.println("Highest Product : "+highest_product+"\tHighest Sum : "+highest_sum+"\nLowest Product : " +
              ""+lowest_product+"\tLowest Sum : "+lowest_sum);




  }

}
