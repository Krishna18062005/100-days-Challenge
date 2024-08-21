import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Binary Substring
		Scanner sc=new Scanner(System.in);
		String st=sc.next();
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
		    if(!st.contains(Integer.toBinaryString(i))){ System.out.print("NO");return;}
		}
		System.out.print("YES");

	}
}
