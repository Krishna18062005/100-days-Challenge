
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//X - Integers - Triangle Pattern
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []ar=new int[n];
		for(int i=0;i<n;i++){
		    ar[i]=sc.nextInt();
		}
		int np=sc.nextInt();
		int ind=0;
		for(int i=0;i<np;i++){
		    for(int j=0;j<=i;j++){
		        System.out.print(ar[ind]+" ");
		        ind=(ind+1)%n;
		    }
		    System.out.println();
		}

	}
}
