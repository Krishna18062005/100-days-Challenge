import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Valid Set & Position
		int n=new Scanner(System.in).nextInt();
		if(n%sum(n)!=0){
		    System.out.println(-1);
		    return;
		}
		int i=1;
		int c=0;
		while(i<=n){
		    if(i%sum(i)==0){
		        c++;
		    }
		    else{
		        c=0;
		    }
		    i++;
		}
		while(i%sum(i)==0){
		    i++;
		    c++;
		}
		if(c==1) {
		    System.out.println(-1);
		    return;
		}
		System.out.print(c+" "+(c-(i-1-n)));

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
