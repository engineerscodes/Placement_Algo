package Trees_Algo.BTS;


import java.util.*;

/**
 * @author NAVEEN ,
 * 20 Jul, 2022
 */
public class All_Possible_BST_1_N {


    public static void main(String arg[]){

        Scanner nav=new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num=nav.nextInt();

        int start=1;
        int end=num;
        ArrayList<BST> arr=findBST(start,end);
        //don't use inorder because it will give u sorted order
        for(int i=0;i<arr.size();i++){

            preorder(arr.get(i));
            System.out.println();
        }



    }
    //don't use inorder because it will give u sorted order
    public static void preorder(BST root){
        if(root == null)
            return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static ArrayList<BST> findBST(int start,int end){
        ArrayList<BST> arr=new ArrayList<>();
        if(start>end){
            arr.add(null);
            return arr;
        }
        for(int i=start;i<=end;i++){
            ArrayList<BST> left=findBST(start,i-1);
            ArrayList<BST> right=findBST(i+1,end);
            for(int l=0;l<left.size();l++){
                for(int r=0;r<right.size();r++){
                    BST new_node=new BST(i);
                    new_node.left=left.get(l);
                    new_node.right=right.get(r);
                    arr.add(new_node);
                }
            }
        }

       return arr;
    }

}


class BST{
    BST left;
    BST right;
    int data;
    BST(int data){
        this.data=data;
    }

    public String toString(){
        return this.data+" ";
    }
}