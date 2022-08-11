package Array_Problems;

/**
 * @author NAVEEN ,
 * 08 Aug, 2022
 */

class LinkedListR{

    int data;
    LinkedListR next;

    LinkedListR(int data){
        this.data=data;
    }

}
public class reverse_K {

    static LinkedListR head;


    public static void insert(int new_data){

        if(head==null)
        {
            head=new LinkedListR(new_data);
            return;
        }

        LinkedListR new_node=new LinkedListR(new_data);
        LinkedListR temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=new_node;
    }

    public  static  void print(){
        LinkedListR temp=head;

        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public  static  void print(LinkedListR head){
        LinkedListR temp=head;

        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static LinkedListR reverseK(LinkedListR head,int k){

        if(k==1)
            return head;
        if(head==null)
            return head;
        LinkedListR temp=head;
        LinkedListR prev=null;
        int count=0;
        while (count<k && temp!=null){
           LinkedListR next=temp.next;
           temp.next=prev;
           prev=temp;
           count++;
           temp=next;
        }
        if(temp!=null) {
            head.next= reverseK(temp, k);
        }
        return prev;
    }

    public static void main(String agr[]){


        insert(1);
        insert(2);
        insert(3);
        insert(4);
        insert(5);
        insert(6);
        insert(7);
        insert(8);
        insert(9);
        insert(10);

        print();
        head=reverseK(head,3);
        print(head);

    }
}
