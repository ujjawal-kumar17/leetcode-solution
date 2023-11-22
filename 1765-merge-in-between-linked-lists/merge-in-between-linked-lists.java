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
 public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode link1,link2;
        link1=list1;
        link2=list1;
        int k=b-a+1;
        for(int i=0;i<k;i++)
            link2=link2.next;
        
        for(int i=1;i<a;i++)
		{ 
            link1=link1.next;
            link2=link2.next;
        }
        link1.next=list2;
        while(list2.next!=null)
            list2=list2.next;
			
        list2.next=link2.next;
        
        return list1;
    }
}