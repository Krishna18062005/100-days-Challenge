/// 

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Maximum Sum - Remove Subarray;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<n;i++){
		    ar[i]=sc.nextInt();
		}
		int si=sc.nextInt();
		int st=0;
		int end=si-1;
		int min=Integer.MAX_VALUE;
		int sum=0;
		for(int i=0;i<si;i++){
		    sum+=ar[i];
		}
		min=sum;
		for(int i=si;i<n;i++){
		    sum+=ar[i]-ar[i-si];
		    if(min>sum){
		        min=sum;
		        st=i-si+1;
		        end=i;
		    }
		}
		for(int i=st;i<=end;i++){
		    System.out.print(ar[i]+" ");
		}


	}
}
