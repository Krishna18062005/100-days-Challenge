import java.util.* ;
import java.io.*; 

public class Solution {
	public static void posAndNeg(int[] arr) {
		// Write your code here
		int i=0;
		int j=1;
		int id=0;
		int[] cp=new int[arr.length];
		while(id<cp.length){
			if(arr[id]>=0){
				cp[i]=arr[id];
				i+=2;
			}
			else{
				cp[j]=arr[id];
				j+=2;
			}
			id++;
		}
		for(i=0;i<cp.length;i++)
		arr[i]=cp[i];
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
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    boolean c=(a<=b&&b%a==0);
		    System.out.println(c?"YES":"NO");
		}

	}
}
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Character B follows A
		Scanner sc=new Scanner(System.in);
		String ip=sc.next();
		char a=sc.next().charAt(0);
		char b=sc.next().charAt(0);
		String re=a+""+b;
		int c=0;
		for(int i=0;i+1<ip.length();i++){
		    if((ip.charAt(i)+""+ip.charAt(i+1)).equals(re)) c++;
		}
		System.out.print(c);
		

	}
}