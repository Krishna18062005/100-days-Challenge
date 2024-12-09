import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Sum - Integer & Number of 1s
		int n=new Scanner(System.in).nextInt();
		for(int i=0;i<n;i++){
		    if(i+nu(i)==n){
		        System.out.print("NO");
		        return;
		    }
		}
		System.out.println("YES");

	}
	static int nu(int a){
	    int c=0;
	    while(a>0){
	        c+=(a&1);
	        a>>=1;
	    }
	    return c;
	}
}
