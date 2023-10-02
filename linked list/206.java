class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
            return fun(head);
    }
    public static ListNode fun(ListNode head){
        
        if(head.next == null){
            System.out.println(head.val);
            return head;
        }
          
            ListNode k =fun(head.next);
            System.out.println(k.val);
            head.next.next = head;
            head.next = null;
            return k;
    }
}