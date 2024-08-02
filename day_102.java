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
             System.out.println((sc.nextInt())*15);
         }
	}
}
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Replace X - Divisible by 4
		String inp=new Scanner(System.in).next();
		int d=inp.charAt(inp.length()-2)-'0';
		for(int i=0;i<10;i++){
		    if((d*10+i)%4==0){
		        System.out.print(inp.replace("X",i+" "));
		    }
		}

	}
}
