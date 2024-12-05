import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Toogle set of bits
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=sc.nextInt();
		int len=s;
		String str="";
		while(s-->0) str+='0';
		for(int i=0;i<n;i++){
		    int st=sc.nextInt();
		    String mod="";
		    for(int j=0;j<st-1;j++) mod+=str.charAt(j);
		    for(int j=st-1;j<len;j++){
		        char ch=str.charAt(j);
		        mod+=(ch=='0')?'1':'0';
		    }
		    str=mod;
		}
		System.out.print(Integer.valueOf(str,2));

	}
}
