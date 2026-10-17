package Q234;

import common.ListNode;

public class Q234_sol {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head == null){
            return false;
        }
        ListNode half = head;
        ListNode end = head;
        while (end != null && end.next != null){
            end = end.next.next;
            half = half.next;
        }
        ListNode prev = null;
        ListNode cur = half;
        while (cur != null){
            ListNode nextNode  = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextNode;
        }
        ListNode p1 = head;
        ListNode p2 = prev;
        while (p2 != null){
            if (p1.val != p2.val){
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }
}
