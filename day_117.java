import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Split string based on Vowels
		String inp=new Scanner(System.in).next();
		char[] s1=inp.toCharArray();
		char[] s2=new char[inp.length()];
		for(int i=0;i<inp.length();i++){
		    s2[i]='*';
		}
		for(int i=1;i<inp.length();i++){
		    if("aeiouAEIOU".contains(inp.charAt(i-1)+"")){
		       s2[i]=s1[i];
		        s1[i]='*';
		    }
		}
		System.out.print(new String(s1)+"\n"+new String(s2));

	}
}
