import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Bits Decoding
		String bin=new Scanner(System.in).next();
		String ans="";
		for(int i=0;i<bin.length();i++){
		    if(bin.charAt(i)=='0') ans+='a';
		    else{
		        i++;
		        ans+='b';
		        if(i==bin.length()){ System.out.println(-1);return;}
		    }
		}
		System.out.print(ans);

	}
}
