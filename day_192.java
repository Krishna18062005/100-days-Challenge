import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Co-Primes in Rows
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][] ma=new int[r][c];
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        ma[i][j]=sc.nextInt();
		    }
		}
		for(int i=0;i<r;i++){
		    boolean prev,wholerow;
		    prev=wholerow=false;
		    for(int j=0;j+1<c;j++){
		        if(gcd(ma[i][j],ma[i][j+1])==1){
		            prev=true;
		            wholerow=true;
		            System.out.print(ma[i][j]+" ");
		            if(j==c-2){
		                System.out.print(ma[i][j+1]);
		            }
		        }
		        else if(prev){
		            System.out.print(ma[i][j]+" ");
		            prev=false;
		        }
		    }
		    if(wholerow==false){
		        System.out.println(-1);
		    }
		    else{
		        System.out.println();
		    }
		}

	}
	static int gcd(int a,int b){
	    if(a<b){
	        int t=a;
	        a=b;
	        b=t;
	    }
	    if(b==0){
	        return a;
	    }
	    return gcd(a%b,b);
	}
}
