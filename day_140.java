///day 140...
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
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    long ans=0;
		  
		    for(int i=0;i<a;i++){
		        if(c<b){
		            ans+=(long)Math.pow(c,2);
		            break;
		        }
		        ans+=(long)Math.pow(b,2);
		        c-=b;
		    }
		    System.out.println(ans);
		}

	}
}
