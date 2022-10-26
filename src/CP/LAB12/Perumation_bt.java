package CP.LAB12;


import java.util.ArrayList;

/**
 * @author NAVEEN ,
 * 13 Aug, 2022
 */

class Tree{

  int data;

  ArrayList<Tree> children;

  public Tree(int data){
    this.data=data;
    this.children=new ArrayList<>();
  }

  public void insert(int child_value){
    Tree child=new Tree(child_value);
    this.children.add(child);
  }



}

public class Perumation_bt {
  static Tree root;

  static ArrayList<Integer> arr=new ArrayList<>();

  public static  void inorder(Tree root){

    if(root == null)
      return;
    int size=root.children.size();
    for(int i=0;i<root.children.size()-1;i++){
      inorder(root.children.get(i));
    }
    arr.add(root.data);
    if(size>1)
    inorder(root.children.get(size-1));

  }


  public static void main(String agr[]){
    /*
    root=new Tree(3);
    root.insert(2); //0
    root.insert(1);  //1
    root.insert(2);  //2
    root.children.get(0).insert(5); //00
    root.children.get(0).insert(4);  //01
    //01
    root.children.get(0).children.get(1).insert(1);
    root.children.get(0).children.get(1).insert(2);
    //2
    root.children.get(2).insert(4); //20
    root.children.get(2).insert(5);  //21
    //21
    root.children.get(2).children.get(0).insert(2);
    root.children.get(2).children.get(0).insert(1);
    */


    root=new Tree(3);
    root.insert(1);
    root.insert(1);
    root.children.get(0).insert(1);
    root.children.get(0).insert(2);
    root.children.get(1).insert(1);
    root.children.get(1).insert(2);

    inorder(root);
    System.out.println("ArrayList : "+arr);
    int l=0,r=arr.size()-1;
    int l_max,r_max;
    if(arr.size()%2==0){
       r_max=(arr.size()/2)+1;
       l_max=r_max-2;
    }
    else{
      r_max=(arr.size()/2)+1;
      l_max=(arr.size()/2)-1;
    }

    int flag=1;
    while (l<=l_max && r>=r_max){

      if(arr.get(r)!=arr.get(l)){
        System.out.println("Not palindromic tree");
        flag=0;
        break;
      }
      l++;
      r--;

    }
    if(flag==1)
      System.out.println("palindromic tree");

  }

}
