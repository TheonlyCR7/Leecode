
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head.next;
        ListNode fast = head.next;

        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        if(fast.next == null)
            return slow;
        return slow.next;
    }
}
