
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Integers - Same Unit Digit\\
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int lastDigit=arr[n-1]%10;
		for(int i=n-1;i>=0;i--){
		    if(arr[i]%10==lastDigit){
		        System.out.print(arr[i]+" ");
		    }
		}

	}
}
