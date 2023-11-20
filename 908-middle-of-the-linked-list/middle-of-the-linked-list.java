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
 /*  इसमे क्वेशन मे एक पॉइन्टर को 2 आगे करना है और दूसरे को एक। दूसरा वाला फेले इन्क्रमन्ट हो गया 
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode i = head;
        ListNode j = head;
        while(i != null && i.next != null){
            j = j.next;
            i=i.next.next;
        }
        return j;
        
    }
}