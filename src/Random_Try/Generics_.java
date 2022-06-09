package Random_Try;
import java.util.*;

public class Generics_ {
	public static void main(String[] args) 
    {
      System.out.println("Enter the Number :");
      Integer t[]= {2,322,6,1};
      Array ar=new Array(t);
      ar.Sort(t);
      System.out.println(Arrays.toString(ar.mark));

    }
}



class Array <Type extends Comparable<Type>>
{  Type mark[];
   int count=0;
    Array(  Type Marks[])
    {
        mark=Marks;
    }
    public void put(Type i)
    {
        mark[count++]=(Type)i;
    }
    public Type[] Sort(Type Marks[])
    {  
        for(int i=0;i<mark.length-1;i++)
        {
            for(int j=0;j<mark.length-i-1;j++)
            {
                if(mark[j].compareTo(mark[j+1])>0)
                {
                    Type t=(Type) mark[j];
                    mark[j]=mark[j+1];
                     //mark[j+1]=   t; \\Type mismatch: cannot convert from Type to Type extends Comparable<Type>
                    mark[j+1]=(Type)t;
                    
                }
            }
        }
        
        return mark;//error  Type mismatch: cannot convert from Type[] 
    // to Type[]
    }
}
