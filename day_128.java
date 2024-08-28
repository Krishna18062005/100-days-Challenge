import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Zer0 Arrow Pattern Printing
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n*2-1;i++){
		    for(int j=0;j<n;j++){
		        if(i<n-1){
		            if(j==n-1||n-i-1==j)
		            System.out.print("0 ");
		            else
		            System.out.print("* ");
		        }
		        else{
		            int k=i-n;
		            if(k==j-1||j==n-1)
		            System.out.print("0 ");
		            else
		            System.out.print("* ");
		        }
		    }
		    System.out.println();
		}

	}
}


//day 128 starts with ml concepts
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Shift Integers;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] ma=new int[n];
		
		for(int i=0;i<n;i++){
		    ma[i]=sc.nextInt();
		    
		}
		
		int c=0;
		while(c<k){
		    ma=rotate(ma);
		    c++;
		
		System.out.print(Arrays.toString(ma));
}
	}
	static int[] rotate(int[] ma){
	    int p=0;
	    for(int i=0;i<ma.length;i++){
	        if(ma[i]%2==0) {p=i;break;}
	    }
	    int k=0;
	    int[] ar=new int[ma.length];
	    for(int i=p+1;i<ma.length;i++){
	        ar[k++]=ma[i];
	    }
	    for(int i=0;i<=p;i++){
	        ar[k++]=ma[i];
	    }
	    return ar;
	} 
}
