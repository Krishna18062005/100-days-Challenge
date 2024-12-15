import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Alphabets Triangle Pattern
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int R=sc.nextInt();
		for(int i=0;i<R;i++){
		    char ch=(char)((int)'A'+N-1);
		    for(int j=0;j<=i;j++){
		        System.out.print(ch+" ");
		        if(ch=='Z') ch='A';
            else ch++;
		    }
		    System.out.println();
		}

	}
}
