import java.util.* ;
import java.io.*; 

public class Solution {
	public static void posAndNeg(int[] arr) {
		// Write your code here
		int i=0;
		int j=1;
		int id=0;
		int[] cp=new int[arr.length];
		while(id<cp.length){
			if(arr[id]>=0){
				cp[i]=arr[id];
				i+=2;
			}
			else{
				cp[j]=arr[id];
				j+=2;
			}
			id++;
		}
		for(i=0;i<cp.length;i++)
		arr[i]=cp[i];
	}

}
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
		    boolean c=(a<=b&&b%a==0);
		    System.out.println(c?"YES":"NO");
		}

	}
}
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Character B follows A
		Scanner sc=new Scanner(System.in);
		String ip=sc.next();
		char a=sc.next().charAt(0);
		char b=sc.next().charAt(0);
		String re=a+""+b;
		int c=0;
		for(int i=0;i+1<ip.length();i++){
		    if((ip.charAt(i)+""+ip.charAt(i+1)).equals(re)) c++;
		}
		System.out.print(c);
		

	}
}
#include<stdio.h>
#include<stdlib.h>
//next prime number..
int main()
{
    int i,a;
    scanf("%d",&a);
    i=a+1;
    while(isp(i)==0){
        i++;
    }
    printf("%d",i);

}
int isp(int n){
    if(n==2||n==3) return 1;
    if(n%2==0||n%3==0) return 0;
    for(int i=4;i*i<=n;i++){
        if(n%i==0){
            return 0;
        }
    }
    return 1;
}
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//File Download Cost
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt()*1024;
		int b=sc.nextInt();
		int sec=a/b;
		if(a%b!=0) sec++;
		if(sec>1000){
		    System.out.print((sec-1000)*3+1500);
		}
		else if(sec>500){
		    System.out.print((sec-500)*2+500);
		}
		else{
		    System.out.print(sec);
		}
		

	}
}
