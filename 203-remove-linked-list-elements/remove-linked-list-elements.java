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
    public ListNode removeElements(ListNode head, int val) {
        ListNode i = head;
        if(head == null){
         return null;}else{
        while(i.next !=null){
            if(i.next.val==val){
                i.next=i.next.next;
            }else{
                i=i.next;
            }
        }}
        return head.val == val ? head.next : head;
    }
}