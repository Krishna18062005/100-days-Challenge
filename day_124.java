//JUMP MAXI COUNT
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Jump On Stones;
		int c=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<n;i++){
		    ar[i]=sc.nextInt();
		}
		int jc=1;
		int i=0;
		while(i<n-1){
		    c+=1;
		    if(ar[i]%2!=0){
		        jc+=2;
		    }
		    if(ar[i]%2==0) jc+=3;
		    if(ar[i]%9==0) jc-=5;
		    if(jc<1) jc=1;
		    i+=jc;
		}
		System.out.println(c+"");

	}
}
