//206. Reverse Linked List https://leetcode.com/problems/reverse-linked-list/description/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head==null)return null;
        ListNode node = head;
        ListNode prev = null;
        while(node!=null){
            ListNode temp = node.next;
            node.next = prev;
            prev = node;
            node = temp;
        }
        head = prev;
        return head;
    }
}
/* Explaination
Going backwards, node is current head, prev is the last node.
temp node to hold the inputted next node and move all the nodes forward (back for ans).
Example:
input:   1->2->3->4->5->null
      ^  ^  ^
      n  h  t                 
ans:  1->null

next:   1->2->3->4->5->null
        ^  ^  ^
        n  h  t
ans: 2->1->null
*/
