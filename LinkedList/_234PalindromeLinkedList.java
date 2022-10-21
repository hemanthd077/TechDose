
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
    public boolean isPalindrome(ListNode head) {
        List<Integer> arr = new ArrayList<>();
        ListNode temp =head;
        while(temp!=null){
            arr.add(temp.val);
            temp=temp.next;
        }
        int start=0,end=arr.size()-1;
        while(start<end){
            if(arr.get(end) != arr.get(start)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}