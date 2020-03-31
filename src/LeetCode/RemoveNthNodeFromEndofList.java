package LeetCode;

public class RemoveNthNodeFromEndofList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode first = head;

        int len = 0;
        while(first != null){
            len ++;
            first = first.next;
        }

        if(len <= 1){
            return null;
        }

        if(len == n) return head.next;

        first = head;

        int i = 0;
        while((len - n) - 1 != i){
            i ++;
            first = first.next;
        }
        first.next = first.next.next;

        return head;

    }
}
