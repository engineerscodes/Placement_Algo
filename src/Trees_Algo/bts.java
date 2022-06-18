package Trees_Algo;

/**
 * @author NAVEEN ,
 * 10 Jun, 2022
 */
public class bts {

    static Node root;
    static class Node{
        Node left,right;
        int data;

        public Node(int data){
            this.data=data;
        }

    }

    public static int search(Node root,int key){

        if(root == null)
            return -1;
        if(root.data ==key)
            return key;

        if(key<root.data)
            search(root.left,key);

        return search(root.right,key);

    }

    public static Node create(Node root,int new_value){

        if(root ==null)
        {
            root=new Node(new_value);
            return root;
        }
        if(new_value < root.data){
            root.left= create(root.left,new_value);
        }
        else{
            root.right=create(root.right,new_value);
        }

        return root;
    }

    public  static  void inorder(Node root){
        if(root == null)
            return;
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }

    public  static void  delete(Node root,int key){

    }

    public static void main(String ...args){

        root=create(root,50);
        root=create(root,30);
        root=create(root,20);
        root=create(root,40);
        root=create(root,70);
        root=create(root,60);
        root=create(root,80);

        inorder(root);
        System.out.println("Found "+search(root,50));
    }



}
