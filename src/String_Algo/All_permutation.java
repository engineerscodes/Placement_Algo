package String_Algo;

public class All_permutation {

	public static void main(String[] args) {

       String str="ABC";
       
       Permute(str,"");

	}
	
	public static void Permute(String str,String ans) {
		
		if(str.length()==0)
		{
			System.out.println(ans+", ");
			return ;
		}
		
		for(int i=0;i<str.length();i++) {
			// if str abc 
			// ch =b then left=a ,then right=c
			char  ch=str.charAt(i);  //fixed
			String left=str.substring(0, i);
			String right=str.substring(i+1);
			String notfixed=left+right;  //ac
			
			Permute(notfixed,ans+ch);
			
			
		}
		
	}

}
