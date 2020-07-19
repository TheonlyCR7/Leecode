class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
class Solution {
	public ListNode reverseList(ListNode head) {
		// 检验链表是否为空或只有一个元素
        if(head == null || head.next == null)
            return head;
		ListNode pre = null;
		ListNode cur = head;
		while (cur.next != null){
			ListNode nextNode = cur.next;
			cur.next = pre;
			pre = cur;
			cur = nextNode;
		}
		return cur;
	}
}
