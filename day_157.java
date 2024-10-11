/* Linked List Node
struct Node {
    int data;
    struct Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}; */

class Solution {
    Node removeDuplicates(Node head) {
        // your code here
        Node ans=head;
        while(head.next!=null){
            if(head.data==head.next.data){
                head.next=head.next.next;
            }
            else head=head.next;
        }
        return ans;
    }
};
