import java.util.*;
public class Hello {

    public static void main(String[] args) {
		// Three Digit Integer -Unit Digit;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++){
		    ar[i]=sc.nextInt()%10;
		}
		for(int i=0;i<n;i+=3){
		    
		    int num=FindGreater(ar,i);
		    if(num==0) System.out.print(-1+" ");
		    else
		    System.out.print(num+" ");
		}

	}
	public static int FindGreater(int[] ar,int l){
	    int[] arr=new int[3];
	    int id=l;
	    for(int i=0;i<3;i++){
	        arr[i]=ar[id++];
	    }
	    Arrays.sort(arr);
	    String ans="";
	    for(int i:arr){
	        ans=i+ans;
	    }
	    return Integer.parseInt(ans);
	}
}
// 6
// 989 32 232 223 23 23

// Output:

// 229 333 
