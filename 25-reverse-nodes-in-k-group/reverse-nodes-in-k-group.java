/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
      private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next; 
            curr.next = prev;              
            prev = curr;                   
            curr = nextTemp;               
        }
        return prev; 
    }
    public ListNode reverseKGroup(ListNode head, int k) {
if (head == null || k == 1) {
            return head;
        }

       ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prevGroupTail = dummy;

        while (true) {
            ListNode cursor = prevGroupTail;
            for (int i = 0; i < k; i++) {
                if (cursor.next == null) {
                    return dummy.next;
                }
                cursor = cursor.next;
            }

            ListNode currentGroupHead = prevGroupTail.next; // The first node of the group
            ListNode nextGroupHead = cursor.next;           // The node immediately after the k-th node

            cursor.next = null;

            ListNode newGroupHead = reverse(currentGroupHead);

            prevGroupTail.next = newGroupHead;

           currentGroupHead.next = nextGroupHead;

            prevGroupTail = currentGroupHead;
        }
    }

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
