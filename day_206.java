import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Next Integer - Same 1s Count
		int n=new Scanner(System.in).nextInt();
		int ini=count(n);n++;
		while(count(n)!=ini) n++;
		System.out.print(n);
	}
	static int count(int num){
	    int c=0;
	    while(num!=0){
	        c+=(num&1);
	        num>>=1;
	    }
	    return c;
	}
}
