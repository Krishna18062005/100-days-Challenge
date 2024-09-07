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
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int c=0;
		    int max=0;
		    int n=sc.nextInt();
		    String s=sc.next();
		    for(int i=0;i<n;i++){
		        if(!"aeiou".contains(s.charAt(i)+"")){
		            c++;
		        }
		        else{
		            c=0;
		        }
		        if(max<c){
		            max=c;
		        }
		    }
		    System.out.println((max<=3)?"YES":"NO");
		}

	}
}
