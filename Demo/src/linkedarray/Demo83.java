package linkedarray;

// Definition for singly-linked list.
public class Demo83{

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while (cur != null && cur.next != null) { // 考虑循环终止的情况
            if (cur.val == cur.next.val) {   // 删除条件
                ListNode node = cur.next;
                cur.next = node.next;
                node.next = null; //清除野指针
            } else {
                cur = cur.next;
            }
        }
        return head;
    }
}
}
