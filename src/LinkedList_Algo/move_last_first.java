package LinkedList_Algo;

/**
 * @author NAVEEN ,
 * 05 Jun, 2022
 */
public class move_last_first {

  Node head;  // head of list

  /* Linked list Node*/
  class Node
  {
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
  }

  void moveToFront()
  {

    Node cur=head;
    Node prev=null; //for second last
    while (cur.next!=null){
      prev=cur;
      cur=cur.next;
    }
    System.out.println("Second Last : "+prev.data);
    //make second last element .next ==null
    prev.next=null;

    //now move it to first place
    cur.next=head;
    head=cur;


  }


  /* Utility functions */

  /* Inserts a new Node at front of the list. */
  public void push(int new_data)
  {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
    Node new_node = new Node(new_data);

    /* 3. Make next of new Node as head */
    new_node.next = head;

    /* 4. Move the head to point to new Node */
    head = new_node;
  }

  /* Function to print linked list */
  void printList()
  {
    Node temp = head;
    while(temp != null)
    {
      System.out.print(temp.data+" ");
      temp = temp.next;
    }
    System.out.println();
  }

  /* Driver program to test above functions */
  public static void main(String args[])
  {
    move_last_first llist = new move_last_first();
    /* Constructed Linked List is 1->2->3->4->5->null */
    llist.push(5);
    llist.push(4);
    llist.push(3);
    llist.push(2);
    llist.push(1);

    System.out.println("Linked List before moving last to front ");
    llist.printList();

    llist.moveToFront();

    System.out.println("Linked List after moving last to front ");
    llist.printList();
  }


}
