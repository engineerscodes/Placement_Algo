package Array_Problems.SW;

import java.util.Stack;

/**
 * @author NAVEEN ,
 * 11 Sep, 2022
 */
public class PostFix_To_Infix {


  public static void main(String agr[]){

    String postfix="ab*c+"; //((a*b)+c)
    Stack<String> stack=new Stack<>();

    String regex="[a-zA-Z]";

    for(int i=0;i<postfix.length();i++){


      if((postfix.charAt(i)+"").matches(regex)){
         stack.push(postfix.charAt(i)+"");
      }else{

        String n1=stack.pop();
        String n2=stack.pop();
        stack.push("( "+n2+postfix.charAt(i)+n1+" ) ");
      }


    }


    System.out.println(stack.peek());

  }


}
