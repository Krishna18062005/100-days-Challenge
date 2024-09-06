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
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode dum=head;
       
        // for(int i:nums){
           
        //          if(dum.val==i){
        //                 dummy=dummy.next;
        //                 dum=dum.next;
        //             }
            
        //     while(dum!=null&&dum.next!=null){
        //        if(dum.next.val==i){
        //             dum.next=dum.next.next;
                    
        //        }
               
        //        else
        //        dum=dum.next;
        //     }
        //     dum=dummy;
        // }
        // return dummy;
        Set<Integer> set=new HashSet<>();
        for(int i:nums) set.add(i);
        ListNode ans=new ListNode(0);
        ListNode ansH=ans;
        while(dum!=null){
            if(!set.contains(dum.val)){
                ans.next=new ListNode(dum.val);
                ans=ans.next;
               // ans=ans.next;
            }
            dum=dum.next;
        }

        return ansH.next;

    }
}
