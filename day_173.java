import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Reverse Between CH
		Scanners sc=new Scanner(System.in);
		String str=sc.nextLine();
		char ch=sc.next().charAt(0);
		int st=str.indexOf(ch);
		int la=str.lastIndexOf(ch);
		String ans=str.substring(0,st);
		for(int i=la;i>=st;i--) ans+=str.charAt(i);
		ans=ans+str.substring(la+1);
		System.out.print(ans);

	}
}
