package Random_Try.BTS_;

import java.util.BitSet;

/**
 * @author NAVEEN ,
 * 18 Jun, 2022
 */
public class Node_Bst {

    static class Bst_Node{
        Bst_Node left,right;
        int data;

        public Bst_Node(int data){
            this.data=data;
        }
    }

    public static  Bst_Node insert(Bst_Node node,int data){

        if(node == null)
            return new Bst_Node(data);
        if(data<node.data)
            node.left= insert(node.left,data);
        else
            node.right=insert(node.right,data);

        return node;
    }
    public static void inorder(Bst_Node node){
        if(node ==null)
            return ;
        inorder(node.left);
        System.out.println(node.data);
        inorder(node.right);
    }
    public static  void main(String ...args){
        Bst_Node root=new Bst_Node(0);
        root=insert(root,50);
        root=insert(root,30);
        root=insert(root,20);
        root=insert(root,40);
        root=insert(root,70);
        root=insert(root,60);
        root=insert(root,80);

        inorder(root);
    }



    public void delete(Bst_Node node,int target){

       if(node == null)
           return;
       if(node.data== target){
            //case one with -Leaf Node
           if(node.left ==null && node.right == null){

           }

       }

    }



}
