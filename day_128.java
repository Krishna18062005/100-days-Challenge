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
