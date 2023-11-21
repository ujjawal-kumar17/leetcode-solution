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
        public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(Integer.MIN_VALUE), prev = dummy;
        while (head != null && head.next != null) {
            prev.next = head; 
            head = head.next; 
            while (head != null && head.val != 0) {
                prev.next.val += head.val; 
                head = head.next; 
            }
            prev = prev.next; 
        }
        prev.next = null;
        return dummy.next;
    }
}