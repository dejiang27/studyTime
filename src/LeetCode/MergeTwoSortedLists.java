package LeetCode;

public class MergeTwoSortedLists {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {val = x;}
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        //ListNode dummy = new ListNode(0);

        if(l1 == null){
            return l2;
        } else if(l2 == null){
            return l1;
        }

        ListNode head = null;

        // set head first
        if(l1.val <= l2.val) {
            head = l1;
            l1 = l1.next; // move forward
        } else {
            head = l2;
            l2 = l2.next; // move forward
        }

        ListNode cur = head;

        // merging
        while(l1 != null && l2 != null) {
            if(l1.val <= l2.val){
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }

        // add remain nodes
        if(l1 == null){
            cur.next = l2;
        } else if(l2 == null){
            cur.next = l1;
        }

        return head;
        /*ListNode ans = null;

        if(l2.val < l1.val){
            ans = l2;
            l2 = l2.next;
        }else{
            ans = l1;
            l1 = l1.next;
        }

        ListNode cur = ans;

        while(true){
            if(l1.next == null){
                cur.next = l2;
                break;
            }
            if(l2.next == null){
                cur.next = l1;
                break;
            }
            if(l1.val < l2.val){
                cur.next = l1;
                l1 = l1.next;
            }else{
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        return ans.next;*/
    }

    public static void main(String[] args){


    }
}
