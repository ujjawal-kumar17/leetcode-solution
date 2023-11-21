/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
       private int gcd(int a, int b) {
        if (b == 0) return a;     
        return gcd(b, a % b);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
     ListNode i=head;
     ListNode j=i.next;
     while(j!=null){
         int temp = gcd(i.val,j.val);
         ListNode gcd = new ListNode(temp);
         gcd.next=j;
         i.next=gcd;
         i=j;
         j=j.next;
     }
     return head;
    }
}