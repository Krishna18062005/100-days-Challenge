import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=sc.nextInt()*2;
		    boolean d=(a<=b+c);
		    System.out.println(d?"Qualify":"NotQualify");
		}

	}
}
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> containsNumber(int n, ArrayList<Integer> arr) {
		// Write your code here.
		ArrayList<Integer> ans=new ArrayList<>();
		for(int i=0;i<n;i++){
			int k=(arr.get(i));
			
			if((k+"").contains("1")&&(k+"").contains("2")&&(k+"").contains("3")) ans.add(k);
		}
		Collections.sort(ans);
		if(ans.isEmpty()) ans.add(-1);
		return ans;
	}
}
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Missing Numbers & Ranges
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<n;i++){
		    ar[i]=sc.nextInt();
		}
		Arrays.sort(ar);
		String ans="";
		if(ar[0]==1){
		    ans+="0,";
		}
		else if(ar[0]!=0){
		    ans+="0-"+(ar[0]-1)+",";
		}
		for(int i=0;i+1<n;i++){
		   
		    if(ar[i]+2==ar[i+1]){
		        ans+=(ar[i]+1+",");
		    }
		    else if(ar[i+1]-ar[i]>2){
		        ans+=(ar[i]+1+"-"+(ar[i+1]-1)+",");
		    }
		}
		System.out.print(ans.substring(0,ans.length()-1));

	}
}
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Consecutive Count && Binary
		String num=Integer.toBinaryString(new Scanner(System.in).nextInt());
		ArrayList<Integer> a=new ArrayList<>();
		int c=0;
		for(int i=0;i<num.length();i++){
		    if(num.charAt(i)=='0') c++;
		    if(c!=0&&num.charAt(i)!='0'){ a.add(c);c=0;}
		}
		if(num.charAt(num.length()-1)=='0') a.add(c);
		int p=-1;
		String ip="";
		boolean pr=false;
		for(int i=0;i<num.length();i++){
		    //int k=a.get(p);
		    if(num.charAt(i)=='0'){
		        if(!pr){
		            p=p+1;
		        }
		       pr=true; 
		      ip+=a.get(p);  
		    }
		    else{
		        pr=false;
		        ip+=num.charAt(i);
		    }
		 
		}
        System.out.print(Long.toBinaryString(Long.valueOf(ip)));
	}
}
