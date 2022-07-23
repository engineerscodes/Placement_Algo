package CP.LAB6;

import java.util.*;

/**
 * @author NAVEEN ,
 * 16 Jul, 2022
 */
public class Word_Problem {

    public static void main(String args[]){
        Scanner nav=new Scanner(System.in);
        String board[][]={{"ABCE"},{"ESFC"},{"XDEE"}};

        System.out.println("MATRIX :");

        for(int i=0;i<board.length;i++)
            System.out.println(Arrays.toString(board[i]));

        String str=nav.next();
        int count[]=new int[3];

        int c=0;
        for(int i=0;i<str.length();i++){

            for(int j=0;j< board.length;j++){

                if(c<3){
                    if(board[j][0].contains(str.charAt(i)+"") && count[j]==0){

                        count[j]=count[j]+1;
                        c++;
                        break;
                    }
                }else{
                    if(board[j][0].contains(str.charAt(i)+"") && count[j]==0){

                        count[j]=count[j]+1;
                        c++;
                        break;
                    }
                }
            }


        }

        int flag=1;
        for(int i=0;i< count.length;i++){
            if(count[i]==0)
            {
                flag=0;
            }
        }

       System.out.println("OUTPUT : "+flag);
    }

}
