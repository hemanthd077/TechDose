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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> q = new PriorityQueue<>((a,b) -> a.val - b.val);
        ListNode dummy = new ListNode(0);
        ListNode head= dummy;
        for(ListNode a : lists){
            while(a!=null){
                q.offer(a);
                a=a.next;
            }
        }
        while(!q.isEmpty()){
            dummy.next=q.poll();
            dummy=dummy.next;
            dummy.next=null;
        }
        return head.next;
    }
}