import java.math.*;
class Solution {
    public int getDecimalValue(ListNode head) {
        head=reverse(head);
        int ans=0,i=0;
        while(head != null){
            ans = ans+(int)Math.pow(2,i)*head.val;
            i++;
            head= head.next;
        }    
        return ans;
    }
    
     public static ListNode reverse(ListNode head){
         if(head.next == null){
             return head;
         }
         ListNode k=reverse(head.next);
         head.next.next=head;
         head.next = null;
         return k;

     }
}