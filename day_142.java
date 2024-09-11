import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int s=0;
		for(int i=0;i<3;i++){
		    s+=Math.max(sc.nextInt(),sc.nextInt());
		}
		System.out.println(s);

	}
}
