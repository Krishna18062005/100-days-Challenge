import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Number of Occurrences of Q
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int p=sc.nextInt();
		int q=sc.nextInt();
		int c=0;
		long s=n;
		for(int i=1;i<=p;i++){
		    s+=p;
		    if(Long.toString(s).contains(q+"")) c++;
		}
		System.out.println(c);

	}
}
