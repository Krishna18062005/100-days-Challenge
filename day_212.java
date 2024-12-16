import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Sum of Digits - Divisble by K
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int c=0;
		for(int i=1;i<=n;i++){
		    if(sum(i)%k==0) c++;
		}
		System.out.println(c);

	}
	static int sum(int a){
	    int s=0;
	    while(a!=0){
	        s+=(a%10);
	        a/=10;
	    }
	    return s;
	}
}
