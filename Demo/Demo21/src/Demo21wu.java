class Solutionwu {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(-1);
        ListNode pre = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                pre.next = l1;
                l1 = l1.next;
            }else {
                pre.next =l2;
                l2 = l2.next;
            }
            pre = pre.next;

        }

        if (l1 != null) {
            pre.next = l1;
        }

        if (l2 != null) {
            pre.next = l2;
        }
        return dummy.next;
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
        printer(head);
    }
}