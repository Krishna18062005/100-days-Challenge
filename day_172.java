import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Leading Zeroes in Binary Representation
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int max=Integer.MIN_VALUE;
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		    max=Math.max(arr[i],max);
		}
		int len=Integer.toBinaryString(max).length();
		for(int i:arr){
		    String bin=Integer.toBinaryString(i);
		    for(int j=len-bin.length();j>0;j--) bin='0'+bin;
		    System.out.print(bin+" ");
		}

	}
}
