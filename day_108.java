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
		    int c=sc.nextInt();
		    int d=sc.nextInt();
		    int sum=a+b+c+d;
		    if(sum-a<a||sum-b<b||sum-c<c||sum-d<d){
		        System.out.println("YES");
		    }
		    else 
		    System.out.println("NO");
		}

	}
}
