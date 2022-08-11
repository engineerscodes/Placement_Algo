package CP.LAB10;

import java.util.*;

/**
 * @author NAVEEN ,
 * 06 Aug, 2022
 */

class BST{

  BST left,right;
  int data;

  public BST(int data){
    this.data=data;
  }

}


public class BST_MAX_HEAP {
    static BST root;
    static  int count=0;
    public static BST insert(BST root,int new_data){

        if(root == null)
        {  BST new_node=new BST(new_data);
            return new_node;
        }

        if(new_data<root.data)
            root.left=insert(root.left,new_data);
        if(new_data>root.data)
            root.right=insert(root.right,new_data);
        return root;
    }
    public static void inorder(BST root,ArrayList<Integer> arr){
        if(root==null)
          return;
        inorder(root.left,arr);
        arr.add(root.data);
        inorder(root.right,arr);

    }

    public static void to_max_heap(BST root,ArrayList<Integer> arr){
        if(root ==null)
            return;
        to_max_heap(root.left,arr);
        to_max_heap(root.right,arr);
        root.data=arr.get(count++);
    }

    public static void postorder(BST root){
        if(root==null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }


    public static void main(String agr[]){

        root=insert(root,50);
        root=insert(root,30);
        root=insert(root,20);
        root=insert(root,40);
        root=insert(root,70);
        root=insert(root,60);
        root=insert(root,80);
        ArrayList<Integer> arr=new ArrayList<>();
        inorder(root,arr);
        to_max_heap(root,arr);
        System.out.println("Max Heap : ");
        postorder(root);

    }


}
