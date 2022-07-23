package CP.LAB6;


import java.util.*;

/**
 * @author NAVEEN ,
 * 17 Jul, 2022
 */
public class String_Problem {

  public static void main(String arg[]){

    Scanner nav=new Scanner(System.in);
    System.out.println("Enter String : ");
    String str_w=nav.next();
    System.out.println("String is : "+str_w);
    System.out.println("Enter size of words : ");
    int size=nav.nextInt();
    String words[]=new String[size];
    System.out.println("Enter Words ");
    for(int i=0;i<size;i++)
      words[i]=nav.next();

    System.out.println("Element in Words List : "+ Arrays.toString(words));

    System.out.println("Index : "+findString(str_w,words));

  }

  public  static List<Integer> findString(String s, String[] words) {

    ArrayList<Integer> arr=new ArrayList<>();
    String str="";
    for(int i=0;i<words.length;i++){
      str+=words[i];
    }
    String St[]=str.split("");
    Arrays.sort(St);
    for(int i=0;i<=s.length()-St.length;i++){

      String temp[]=s.substring(i,i+St.length).split("");

      Arrays.sort(temp);
      if(Arrays.equals(temp,St))
      {
        arr.add(i);
        i=i+words[0].length()-1;
      }

    }
    return arr;
  }


}
