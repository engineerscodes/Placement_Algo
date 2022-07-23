package String_Algo;

/**
 * @author NAVEEN ,
 * 21 Jul, 2022
 */
public class ALL_SUBSET {

  public static void main(String arg[]){

    String str="abc";
    find_sub(str,"");
  }

  public static  void find_sub(String str,String ans){

    if(str.length()==0){
        System.out.println(ans+" ");
        return ;
    }
    else{

      for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        String left=str.substring(0,i);
        String right=str.substring(i+1);
        find_sub(left+right,ans+ch);

      }
    }
  }

}
