package linkedarray;

class ListNode2 {
    int val;
    ListNode2 next;
    ListNode2(int x) { val = x; }
}
class Solution2 {
	public ListNode2 reverseList(ListNode2 head) {
		// 检验链表是否为空或只有一个元素
        if(head == null || head.next == null)
            return head;
		ListNode2 pre = null;
		ListNode2 cur = head;
		while (cur.next != null){
			ListNode2 nextNode = cur.next;
			cur.next = pre;
			pre = cur;
			cur = nextNode;
		}
		return cur;
	}
}
