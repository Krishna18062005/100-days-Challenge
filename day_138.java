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
    public ListNode sortList(ListNode head) {
        LinkedList<Integer> a=new LinkedList<>();
        while(head!=null){
            a.add(head.val);
            head=head.next;
        }
        Collections.sort(a);
        System.out.print(a);
        ListNode ans=new ListNode(0);
        ListNode hea=ans;
        for(int i:a){
            ans.next=new ListNode(i);
            ans=ans.next;      
             }
        return hea.next;
            }
}
