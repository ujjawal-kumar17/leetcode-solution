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
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Create a dummy node to simplify handling the new head of the list.
        // The dummy node points to the original head.
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // 'prev' pointer will always point to the node *before* the current pair being swapped.
        ListNode prev = dummy;

        // Iterate as long as there are at least two nodes remaining to be swapped.
        while (prev.next != null && prev.next.next != null) {
            // firstNode is the first node of the current pair
            ListNode firstNode = prev.next;
            // secondNode is the second node of the current pair
            ListNode secondNode = firstNode.next;

            // Perform the swap by rearranging pointers:

            // 1. firstNode's next should point to what was after secondNode.
            //    (This effectively removes firstNode from its original position relative to secondNode).
            firstNode.next = secondNode.next;

            // 2. secondNode's next should point back to firstNode.
            //    (This makes secondNode the new first node of the pair).
            secondNode.next = firstNode;

            // 3. prev's next should now point to secondNode (the new beginning of the swapped pair).
            prev.next = secondNode;

            // Move 'prev' two steps forward to be ready for the next pair.
            // 'firstNode' (which was originally first, now second in the pair) is where the new 'prev' should be.
            prev = firstNode;
        }

        // The head of the modified list is dummy.next.
        return dummy.next;
    }

    // --- Helper method for creating a linked list from an array ---
    public static ListNode createLinkedList(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }
}