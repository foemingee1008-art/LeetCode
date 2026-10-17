package Q25;

import common.ListNode;

public class Q25_sol {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k <= 1) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode groupPrev = dummy;
        while (true){
            ListNode end = groupPrev;
            for (int i = 0; i < k && end != null; i++){
                end = end.next;
            }
            if (end == null) break;
            ListNode start = groupPrev.next;
            ListNode nextGroup = end.next;
            end.next = null;
            groupPrev.next = reverseList(start);
            start.next = nextGroup;
            groupPrev = start;
        }
        return dummy.next;
    }
    private ListNode reverseList(ListNode head){
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
