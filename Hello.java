import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//make the two string into equal lengths by trimming it 
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		int maxl=Math.min(a.length(),b.length());
		System.out.print(a.substring(0,maxl)+" "+b.substring(0,maxl));

	}
}
