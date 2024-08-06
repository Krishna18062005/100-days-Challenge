import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		for(int i=0;i<k;i++){
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    int d=sc.nextInt();
		    if(a<=c&&b<=d){
		        System.out.println("POSSIBLE");
		    }
		    else  System.out.println("IMPOSSIBLE");
		}

	}
}
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null&&list2==null) return null;
        if(list1==null) return list2;
        if(list2==null) return list1;
        ListNode ans=new ListNode(0);
        ListNode head=ans;
        while(list1!=null&&list2!=null){
            if(list1.val<=list2.val){
                ans.next=list1;
                ans=ans.next;
                list1=list1.next;
            }
            else{
                 ans.next=list2;
                ans=ans.next;
                list2=list2.next;

            }
        }
        if(list1==null&&list2!=null) ans.next=list2;
        if(list2==null&&list1!=null) ans.next=list1;

       
       return head.next;
        
    }
}
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Convert String to Matrix
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine().replace(" ","*");
		int m=sc.nextInt();
		if(st.length()%m!=0){
		    for(int i=0;i<st.length()%m;i++){
		        st+='#';
		    }
		}
		int k=st.length()-1;
		for(int i=0;i<st.length()/m;i++){
		    for(int j=m;j>0;j--){
		        System.out.print(st.charAt(k--)+" ");
		    }System.out.println();
		}

	}
}
