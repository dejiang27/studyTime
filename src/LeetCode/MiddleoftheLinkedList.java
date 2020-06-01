package LeetCode;

public class MiddleoftheLinkedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) {
            this.val = val; this.next = next;
        }
    }

    public ListNode middleNode(ListNode head){

        int count = 0;
        ListNode temp = head;
        while(temp != null){
            count ++;
            temp = temp.next;
        }
        int counts = count/2;

        ListNode ans = head;
        for(int i = 0; i < counts; i ++){
            ans = ans.next;
        }
        return ans;
    }
}
