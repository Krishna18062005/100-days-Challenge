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
		    int w=sc.nextInt();
		    int[] ar=new int[s];
		    int[] ar2=new int[s];
		    for(int i=0;i<s;i++){
		        ar[i]=sc.nextInt();
		    }
		     for(int i=0;i<s;i++){
		        ar2[i]=sc.nextInt();
		    }
		    int winC=0;
		    List<Integer> li=new ArrayList<>();
		    for(int i=0;i<s;i++){
		        if(ar[i]>ar2[i]){
		            winC++;
		        }
		        else {
		            li.add(ar2[i]-ar[i]+1);
		        }
		    }
		    if(winC>s/2){
		        System.out.println("YES");
		        continue;
		    }
		    Collections.sort(li);
		    for(int i:li){
		        if(i>w) break;
		        w-=i;
		        winC++;
		    }
		    System.out.println((winC>s/2)?"YES":"NO");
		    
		    
		    
		}
	

	}
}
