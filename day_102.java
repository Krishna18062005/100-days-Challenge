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
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Same FreQuency pattern
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		int[] f1=frequency(s1);
		int[] f2=frequency(s2);
		System.out.print(isSameFrequency(f1,f2));

	}
	static String isSameFrequency(int[] fr1,int[] fr2){
	    Arrays.sort(fr2);
	    Arrays.sort(fr1);
	    for(int i=0;i<256;i++){
	        if(fr1[i]!=fr2[i]) return "no";
	    }
	    return "yes";
	}
	static int[] frequency(String ip){
	    int[] freq=new int[256];
	    for(char i:ip.toCharArray()){
	        freq[(int)i]++;
	    }
	    return freq;
	}
}
