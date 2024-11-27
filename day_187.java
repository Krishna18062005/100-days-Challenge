import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		while(tc-->0){
		    int n=sc.nextInt();
		    int s=0;
		    for(int i=0;i<n;i++){
		        s+=sc.nextInt();
		    }
		    n=n+1;
		    int rem=s%n;
		    int q=s/n;
		    int mod=(s+100)/n;
		    if(q>=50)
		    System.out.println(0);
		    else if(mod>=50){
		        System.out.println(n*50-s);
		    }
		    else{
		        System.out.println(-1);
		    }
		}

	}
}
