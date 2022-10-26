package EXAM;

/**
 * @author NAVEEN ,
 * 21 Aug, 2022
 */

class Linked{

  int data;
  Linked next;

  Linked(int data){
    this.data=data;
  }
}

public class H {

  static Linked root;
  public static Linked insert(int data){

    if(root ==null){
      root=new Linked(1);
    }
    Linked temp=new Linked(data);
    temp.next=root;
    root=temp;
    return root;
  }

  public static void print(Linked root){

    Linked temp=root;

    while (temp!=null){
      System.out.print(temp.data+" -> ");
      temp=temp.next;
    }

  }

  public static void main(String arg[]){
    root=insert(2);
    root=insert(3);
    root=insert(4);
    root=insert(5);
    root=insert(6);
    root=insert(7);
    root=insert(8);
    print(root);



  }



}
