
// Definition for singly-linked list.
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
        // 创建指针指向最后一个元素  即变化后的首元素
    	ListNode newHead = head;
    	while(newHead.next != null)
    		newHead = newHead.next;
    	// 创建指针  迭代到倒数第二位元素
    	ListNode node = head;
    	while(node.next.next != null)
    		node = node.next;
    	node.next.next = node;
    	node.next = null;   
    	node = head;
    	if (node.next != null)  // 说明倒排还没有完成
    		reverseList(node);

    	return newHead;   // 返回新的头节点

    }
}