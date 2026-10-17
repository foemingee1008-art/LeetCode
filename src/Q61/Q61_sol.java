package Q61;

import common.ListNode;

public class Q61_sol {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        if (k == 0) return head;
        ListNode len = head;
        ListNode start = head;
        int i = 1;
        while (len.next != null){
            len = len.next; //len是结尾
            i++;
        }
        k = k % i;
        len.next = start; //链接去head；
        if (k == 0){
            len.next = null;
            return start;
        }
        for (int j = 0; j < i - k; j++){
            start = start.next;
            len = len.next;
        }
        len.next = null;
        return start;
    }
}
