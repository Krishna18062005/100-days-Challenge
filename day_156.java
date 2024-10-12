//ml federated learning basics today
// Node is defined as:
// class Node{
//     int val;
//     Node next;
//     Node(int x){
//     	val = x; next = null;
//     }
// }
class Solution{
    static int solve(Node root){
    int c=0;
    int prev=root.val;
    root=root.next;
    while(root.next!=null){
        if(prev<root.val&&root.val>root.next.val) c++;
        else if(prev>root.val&&root.val<root.next.val) c++;
        prev=root.val;
        root=root.next;
    }
    return c;
    }
}
