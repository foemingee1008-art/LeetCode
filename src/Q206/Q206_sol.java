package Q206;

import common.ListNode;

public class Q206_sol {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        while (cur != null){
            ListNode nextNode = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextNode;
        }
        return prev;
    }
}
