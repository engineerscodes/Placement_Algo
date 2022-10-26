import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.HashMap;
import java.util.*;

/**
 * @author NAVEEN ,
 * 19 Sep, 2022
 */
public class code {

  public static void main(String agr[]){


      Scanner nav=new Scanner(System.in);
      int n=nav.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<arr.length;i++)
          arr[i]=nav.nextInt();

      int sum=0;
      for(int i=0;i<arr.length;i++)
         sum+=arr[i];

      int check= (int) (sum/(2.0));
       double d=sum/(2.0);
       if((double) check==d)
       System.out.println("YES");
       else
           System.out.println("NO");

  }




}
