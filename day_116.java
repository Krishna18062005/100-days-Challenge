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
		    int c=0;
		    for(int j=0;j<a;j++) if(sc.nextInt()>=b) c++;
		    System.out.println(c);
		}

	}
}
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Match Name & Marks
		Scanner sc=new Scanner(System.in);
		String[] name=sc.nextLine().split(" ");
		String[] Marks=sc.nextLine().split(" ");
		for(String i:name){
		    for(String j:Marks){
		        if(i.charAt(0)==j.charAt(0)&&i.charAt(i.length()-1)==j.charAt(j.length()-1)) System.out.println(i+" "+j.substring(1,j.length()-1));
		    }
		}

	}
}
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Bag & Boxes -Total Gold Coins;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<n;i++) ar[i]=sc.nextInt();
		int min=mind(ar[0],0);
		int s=min;
		for(int i=1;i<n;i++){
		    s+=mind(ar[i],min);
		    int mn=mind(ar[i],min);
		    if(mn!=0){
		        min=mn;
		    }
		   
		}
        System.out.print(s);
	}
	static int mind(int a,int b){
	    int m=-1;
	    String[] di=Integer.toString(a).split("");
	    Arrays.sort(di);
	    for(int i=0;i<di.length;i++){
	        if(b<=Integer.parseInt(di[i])){
	            m=Integer.parseInt(di[i]);
	            break;
	        }
	    }
	    return (m==-1)?0:m;
	}
}
