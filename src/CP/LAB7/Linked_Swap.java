package CP.LAB7;


import java.util.Scanner;

/**
 * @author NAVEEN ,
 * 21 Jul, 2022
 */

class  SLinkedList{

  SLinkedList next;
  int data;

  SLinkedList(int  data){
    this.data=data;
  }

  public String toString(){
    return this.data+"";
  }

}
public class Linked_Swap {

  static SLinkedList head;


  public static void create(int new_data){
    SLinkedList new_node=new SLinkedList(new_data);
    if(head==null){
      head=new_node;
      return;
    }
    SLinkedList temp=head;
    while (temp.next!=null){
      temp=temp.next;
    }
    temp.next=new_node;
  }

  public static void  print(SLinkedList node){

    while (node!=null){
      System.out.print(node.data+" -> ");
      node=node.next;
    }
    System.out.println("null");

  }

  public static SLinkedList reverseList(SLinkedList head){
    SLinkedList prev=null;
    SLinkedList next=null;
    SLinkedList temp=head;
    while (temp!=null){
      next=temp.next;
      temp.next=prev;
      prev=temp;
      temp=next;
    }
    return prev;
  }

  public static SLinkedList middle(SLinkedList node){
    if(node == null)
      return null;
    SLinkedList fast=node;
    SLinkedList slow=node;
    while (fast!=null && fast.next!=null && slow!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    //System.out.println(slow.data);
    SLinkedList mid=slow.next;
    slow.next=null;
    return mid;
  }

  public static SLinkedList reorder(SLinkedList head,SLinkedList rev_head){

    SLinkedList new_arr=new SLinkedList(0);
    SLinkedList arr=new_arr;
    SLinkedList thead=head;
    SLinkedList trev_head=rev_head;

    while (thead!=null || trev_head!=null){
      if(thead!=null){
        arr.next=thead;
        arr=arr.next;
        thead=thead.next;
      }
      if(trev_head!=null){
        arr.next=trev_head;
        arr=arr.next;
        trev_head=trev_head.next;
      }
    }
     return new_arr.next;
  }

  public static void main(String arg[]){

    System.out.println("Enter N : ");
    int num=new Scanner(System.in).nextInt();

    for(int i=1;i<=num;i++){
      create(i);
    }
    System.out.println("Original List : ");
    print(head);
    SLinkedList mid=middle(head);
    SLinkedList rev_head=reverseList(mid);
    SLinkedList newhead=reorder(head,rev_head);
    System.out.println("New  List : ");
    print(newhead);
  }
}

