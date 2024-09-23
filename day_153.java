Linked List
  slowpointer  and fast pointer //for middle element 

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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null) return head;
         ListNode odd=new ListNode(0);

         ListNode even=new ListNode(0);
         ListNode kp=even;
         ListNode ans=odd;
         int i=1;
         while(head!=null){
            if(i%2==0){
                even.next=new ListNode(head.val);
                even=even.next;
            }
            else{
                odd.next=new ListNode(head.val);
                odd=odd.next;
            }
            i++;
            head=head.next;
         }
         odd.next=kp.next;
         return ans.next;

    }
}

 public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
    // Write your code here
        SinglyLinkedListNode curr=llist,prev=null,next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            
        }
        return prev;

    }

  
    public static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode llist) {
    // Write your code here
        if(llist==null||llist.next==null) return llist;
        SinglyLinkedListNode ans=llist;
        
 
        while(llist.next!=null){
            if(llist.data==llist.next.data){
                llist.next=llist.next.next;
                
            }
            else {llist=llist.next;}
        }
        return ans;

    }
static boolean hasCycle(SinglyLinkedListNode head) {
        if(head==null||head.next==null) return true;
        SinglyLinkedListNode slo=head;
        SinglyLinkedListNode fas=head.next;
        while(fas!=null&&fas.next!=null){
            
            slo=slo.next;
            fas=fas.next.next;
            if(slo==fas) return true;
        }
        return false;


    }
