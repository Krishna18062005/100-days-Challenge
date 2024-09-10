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
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Video Game Movement
		int f=0,s=0;
		String move=new Scanner(System.in).next();
		for(int i=0;i<move.length();i++){
		    char ch=move.charAt(i);
		    if(ch=='U'||ch=='u') f+=1;
		    else if(ch=='D'||ch=='d') f-=1;
		    else if(ch=='r'||ch=='R') s+=1;
		    else s-=1;
		    
		}
		System.out.print((f==0&&s==0)?"YES":"NO");

	}
}
//input
//uprl
//output
//YES
