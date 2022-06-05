package LinkedList_Algo;

/**
 * @author NAVEEN ,
 * 04 Jun, 2022
 */
public class LinkedListNode {



    public static void main(String ...strings){
        ListNode root=new ListNode(0);
        root.next=new ListNode(10);
        while (root!=null){
            System.out.println(root);
            root=root.next;
        }
    }

}
