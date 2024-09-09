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
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Inverted -Factors Pattern
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> ar=new ArrayList<>();
		for(int i=1;i<=n;i++){
		    if(n%i==0)
		    ar.add(i);
		}
		for(int i=0;i<ar.size();i++){
		    for(int j=0;j<ar.size();j++){
		        int k=Math.min(i,j);
		        System.out.print(ar.get(k)+" ");
		    }
		    System.out.println();
		}
 
	}
}

// Input

// 12

// Output:

// 1 1 1 1 1 1 
// 1 2 2 2 2 2 
// 1 2 3 3 3 3 
// 1 2 3 4 4 4 
// 1 2 3 4 6 6 
// 1 2 3 4 6 12 
