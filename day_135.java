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
		while(n-->0){
		    int s=sc.nextInt();
		    int k=sc.nextInt();
		    ArrayList<Integer> a=new ArrayList<>();
		    for(int i=0;i<s;i++){
		        a.add(sc.nextInt());
		    }
		    while(k-->0){
		        int su=a.get(0)+a.get(a.size()-1);
		        a.remove(0);
		        a.remove(a.size()-1);
		        a.add(su);
		    }
		    for(int i : a)
		    System.out.print(i+" ");
		    System.out.println();
		}

	}
}
