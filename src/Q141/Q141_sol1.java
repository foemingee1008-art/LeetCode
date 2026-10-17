package Q141;

import common.ListNode;

import java.util.HashSet;

public class Q141_sol1 {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> visited = new HashSet<>();
        ListNode cur = head;
        while (cur != null){
            if (visited.contains(cur)){
                return true;
            }
            visited.add(cur);
            cur = cur.next;
        }
        return false;
    }
}
