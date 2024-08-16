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
