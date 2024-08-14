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
            System.out.println((a%4==0)?"Good":"Not Good");
         }
	}
}
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Two Inverted triangles Pattern
		int a=new Scanner(System.in).nextInt();
		for(int i=0;i<a+1;i++){
		    for(int j=0;j<=a*2;j++){
		        if(i==j||i==0||j==a||i==(a*2)-j){
		            System.out.print("*");
		        }
		        else
		        System.out.print("0");
		        
		    }
		    System.out.println();
		}

	}
}
