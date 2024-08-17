import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Digits to Bits;
		String ip=new Scanner(System.in).next();
		String num="";
		for(int i=0;i<ip.length();i++){
		    int k=ip.charAt(i)-'0';
		    if(k%2==0) num+='0';
		    else num+='1';
		}
		System.out.print(Long.valueOf(num,2));

	}
}
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Even Inteegres Shifting Digits
		String ip=new Scanner(System.in).next();
		for(int i=0;i<ip.length();i++){
		   
		   long num=Long.valueOf(ip);
	
		   if(num%2==0){
		       System.out.print(num+" ");
		   }
		   ip=ip.charAt(ip.length()-1)+ip.substring(0,ip.length()-1);
		}

	}
}
