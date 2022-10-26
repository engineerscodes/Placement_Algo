package Array_Problems;


/**
 * @author NAVEEN ,
 * 11 Sep, 2022
 */
import java.util.*;
public class LIS
{
   static int maxlen=0;
  public static void main(String[] args)
  {

    Integer arr[] = { 8,16,30};
    ArrayList<Integer> list=new ArrayList<>();
    for(int i=0;i<arr.length;i++)
      list.add(arr[i]);
    System.out.println(Arrays.toString(arr));
     lcs2(list,new ArrayList<>());
  }


  public static void lcs2(ArrayList<Integer>arr ,ArrayList<Integer>res) {





  }

  public static void lis(ArrayList<Integer> arr,ArrayList<Integer> res){

     if(arr.size()==0){
       if(maxlen<res.size()){
         maxlen=res.size();
       System.out.println(res);
       }
     }else{
       ArrayList<Integer> temp=new ArrayList<>(res);
       ArrayList<Integer> narr=new ArrayList<>(arr);
       Integer cur=narr.get(0);
       narr.remove(cur);
       lis(narr,temp);
       if( temp.size()!=0 && cur>=temp.get(temp.size()-1)) {
         temp.add(cur);
         lis(narr, temp);
       }
       if(temp.size()==0){
         temp.add(cur);
         lis(narr, temp);
       }
     }
  }


}