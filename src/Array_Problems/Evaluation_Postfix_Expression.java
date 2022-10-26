package Array_Problems;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author NAVEEN ,
 * 11 Sep, 2022
 */
public class Evaluation_Postfix_Expression {


    public static void main(String agr[]){


        String str="2 31 5 * + 9 -";
        String op[]=str.split(" ");
        System.out.println(Arrays.toString(op));

        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<op.length;i++){

            char s=op[i].charAt(0);

            if(Character.isDigit(s)){
                stack.push(s-'0');
            }else{
                int n1=stack.pop();
                int n2=stack.pop();

                if(s=='+'){
                    stack.push(n1+n2);
                } else if (s=='-') {
                    stack.push(n2-n1);
                } else if (s=='/') {
                    stack.push(n2/n1);
                }else if (s=='*') {
                    stack.push(n2*n1);
                }
            }

        }
        System.out.println(stack);
        //USING REGEX

        stack=new Stack<>();
        String regex="\\d+";
        for(int i=0;i<op.length;i++){
             //if digit
            if(op[i].matches(regex)){
                stack.push(Integer.parseInt(op[i]));
            }else{

                int n1=stack.pop();
                int n2=stack.pop();

                String oper=op[i];
                if(oper.equals("+")){
                    stack.push(n1+n2);
                } else if (oper.equals("-")) {
                    stack.push(n2-n1);
                } else if (oper.equals("/")) {
                    stack.push(n2/n1);
                }else if (oper.equals("*")) {
                    stack.push(n2*n1);
                }
            }

        }
        System.out.println(stack);
    }

}
