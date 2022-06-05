package LinkedList_Algo;

/**
 * @author NAVEEN ,
 * 05 Jun, 2022
 */
public class Reverse_in_group {

    public static void main(String... strings) {
        ListNode root = new ListNode(1);
        root.insert(root, 2);
        root.insert(root, 2);
        root.insert(root, 4);
        root.insert(root, 5);
        root.insert(root, 6);
        root.insert(root, 7);
        root.insert(root, 8);
        root = reverse(root, 4);
        print(root);
        while (root != null) {
            System.out.println(root.data+",,,,");
            root = root.next;
        }
    }


    public static void print(ListNode root) {
        while (root != null) {
            System.out.println(root.data);
            root = root.next;
        }
    }

        public static ListNode reverse (ListNode node,int k){

            ListNode prev = null;
            ListNode next = null;
            ListNode head = node;
            int count = 0;
            while (node != null && count < k) {
                ListNode cur = node;
                next = node.next;
                cur.next = prev;
                prev = cur;
                node = next;
                count++;
            }

            if (node != null) {
                ListNode reprev = reverse(next, k);
                head.next = reprev;
            }

            return prev;

        }

}