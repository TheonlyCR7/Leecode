package linkedarray;

import java.util.List;

public class Demo82{

static class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
// 超出时间限制
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head.val == head.next.val)  // 判断前两个元素是否相同
            head = deleElement(head);
        ListNode cur = head;
        while(cur != null) {
            if (head.next == null) break;
            ListNode node = cur.next;
            if (node.next.val == node.val) {
                cur.next = deleElement(node);
            }else {
                cur = cur.next;
            }
        }
        return head;
    }

    // 删除重复节点
    public ListNode deleElement(ListNode node){
        if (node.val == node.next.val)
            deleElement(node.next);
        else{
            return node;
        }
        return node;
    }
}
}
