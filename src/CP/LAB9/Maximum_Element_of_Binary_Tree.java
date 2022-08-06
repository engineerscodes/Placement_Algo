package CP.LAB9;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author NAVEEN ,
 * 04 Aug, 2022
 */

class Node{

  Node left,right;
  int data;

  public Node(int data){
    this.data=data;
  }

  public String toString(){
    return this.data+" ";
  }

}


public class Maximum_Element_of_Binary_Tree {

  static Node root;
  static  Node max;
  public static Node insert(Node root,int data){

    Node new_node=new Node(data);
    if(data==-1){
     new_node=null;
    }
    if(root==null) {
      root = new Node(data);
      return root;
    }
    Queue<Node> q=new LinkedList<>();
    q.add(root);

    while (!q.isEmpty()){
      Node temp=q.poll();
      if(temp.left==null)
      {
        temp.left=new_node;
        break;
      }
      else{
        q.add(temp.left);
      }
      if(temp.right==null){
        temp.right=new_node;
        break;
      }else {
        q.add(temp.right);
      }

    }

    return root;
  }

  public static void inorder(Node root){
    if(root == null)
      return;
    inorder(root.left);
    if(max==null){
      max=root;
    }
    if(root.data>max.data){
      max=root;
    }
    inorder(root.right);
  }

  public static void main(String arg[]){

    System.out.println("Enter no of element is Tree : ");
    Scanner nav=new Scanner(System.in);
    int size=nav.nextInt();
    System.out.println("Enter Tree Nodes : ");
    for (int i=0;i<size;i++){
      root=insert(root,nav.nextInt());
    }
    inorder(root);
    System.out.println("The maximum value of the node key of given tree is : "+max);
  }

}
