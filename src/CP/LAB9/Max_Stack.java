package CP.LAB9;
import java.util.*;
/**
 * @author NAVEEN ,
 * 04 Aug, 2022
 */
public class Max_Stack {


  public static void main(String arg[]){

    Scanner nav=new Scanner(System.in);
    System.out.println("Enter the size of stack : ");
    int size=nav.nextInt();
    System.out.println("Enter Element is Stack : ");
    Stack<Integer> st=new Stack<>();
    for(int i=0;i<size;i++){
      st.add(nav.nextInt());
    }
    System.out.println("Element is stack : "+st);
    sort(st);
    System.out.println("Sorted stack : "+st);
  }

  public static void sort_stack(Stack<Integer> st,int Top){

      if(st.size()==0){
          st.push(Top);
          return;
      }

      if(st.peek()>Top){          //sort in desc
          st.push(Top);
          return;
      }

      int rm=st.pop();
      sort_stack(st,Top);
      st.push(rm);



  }

  public static void sort(Stack<Integer> st){

     if(st.size()!=0){

         int top=st.pop();
         sort(st);
         sort_stack(st,top);

     }

  }

}
