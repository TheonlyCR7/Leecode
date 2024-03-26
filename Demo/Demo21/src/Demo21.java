
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        ListNode head = new ListNode(-1);
//        ListNode list = head;
        ListNode list = null;  // 错误位置
        ListNode head = list;  // 错误位置
//        if(list1.val < list2.val) list = list1;
//        else list = list2;

        while(list1 != null && list2 != null){
            if(list1.val <= list2.val) {
                list.next = list1;
                list1 = list1.next;
            }
            else{
                list.next = list2;
                list2 = list2.next;
            }
            list = list.next;
            printer(list);
        }

        if(list1 != null){
            list.next = list1;
        }
        if(list2 != null){
            list.next = list2;
        }

        return head;
    }

    public static void printer(ListNode node){
        System.out.print("list: [");
        while(node != null){
            System.out.print(node.val + ", ");
            node = node.next;
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        ListNode list4 = new ListNode(2);
        ListNode list5 = new ListNode(4);
        list1.next = list4;
        list4.next = list5;

        ListNode list2 = new ListNode(1);
        ListNode list6 = new ListNode(3);
        ListNode list7 = new ListNode(4);
        list2.next = list6;
        list6.next = list7;
//        printer(list1);
//        printer(list2);

        ListNode head = mergeTwoLists(list1, list2);

    }
}
