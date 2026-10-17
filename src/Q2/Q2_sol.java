package Q2;

import common.ListNode;

public class Q2_sol {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        int sum = 0;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0){
            int x = (l1 != null)? l1.val: 0;
            int y = (l2 != null)? l2.val: 0;
            sum = x + y + carry;
            carry = sum / 10;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        return dummy.next;
    }
}
