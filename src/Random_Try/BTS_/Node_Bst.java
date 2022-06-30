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
        Bst_Node root=new Bst_Node(50);
       // root=insert(root,50);
        root=insert(root,30);
        root=insert(root,20);
        root=insert(root,40);
        root=insert(root,70);
        root=insert(root,60);
        root=insert(root,80);

        inorder(root);
        delete(root,20);
        System.out.println("------------------------------DELETE-------------------------------------------- "+20);
        inorder(root);
        delete(root,30);
        System.out.println("---------------------------------------DELETE--------------------------------------"+30);
        inorder(root);
        delete(root,50);
        System.out.println("---------------------------------------DELETE--------------------------------------"+50);
        inorder(root);
    }



    public static Bst_Node delete(Bst_Node node,int target){

       if(node == null)
           return null;
       if(node.data== target){
            //case one with -Leaf Node
           if(node.left ==null && node.right == null){
               return null;
           }
           //case 2 -when One child is null

           if(node.left==null )
               return node.right;
           if(node.right==null)
               return node.left;

           //case 3 - both are not null
           //find successor (min value in RIGHT SUBTREE)
           int min_value=min_value(node.right);
           System.out.println("MIN VALUE IS "+min_value);
           node.data=min_value;
           //now delete the inorder successor which is  mostly leaf node
           node.right=delete(node.right, node.data);

       }
       if(target<node.data){
           node.left=delete(node.left,target);
       }
       else{
           node.right=delete(node.right,target);
       }

       return node;

    }

    public static  int min_value(Bst_Node node){

        int min=node.data;
        while (node.left!=null){
            min=node.left.data;
            node=node.left;
        }

        return min;

    }


}
