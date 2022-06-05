package LinkedList_Algo;

/**
 * @author NAVEEN ,
 * 05 Jun, 2022
 */
public class ListNode{
    ListNode next;
    int data;
    public ListNode(int data){
        this.data=data;
    }
    public String toString(){
        return this.data+"";
    }

    public void insert(ListNode root,int data){
        if(root ==null)
            return ;//new ListNode(data);
        ListNode new_node=new ListNode(data);
        ListNode temp=root;
        while (temp.next!=null){
            temp=temp.next;
        }

        temp.next=new_node;

        return  ;//root;

    }
}
