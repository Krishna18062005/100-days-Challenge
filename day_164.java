import java.util.*;

public class main{
  public static void main(String[] args){
    //Borrow and Add
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sum=0;
    for(int i=0;i<n;i++){
      int num=sc.nextInt();
      if(num%100==0) continue;
      if(num%10==0) sum+=num-9;
      else sum+=num;
    }
    System.out.println(sum);
  }
  
}
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Matrix Row Blast - Digit 0
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int[][] mat=new int[row][col];
		boolean[] increment =new boolean[row];
		for(int i=0;i<row;i++){
		    int zeroCount=0;
		    for(int j=0;j<col;j++){
		        mat[i][j]=sc.nextInt();
		        int num=mat[i][j];
		        int Count = 0;
		        while(num!=0) {
		            if(num%10==0) Count=1;
		            num/=10;
		        }
		        zeroCount+=Count;
		    }
		    if(zeroCount==1) increment[i]=true;
		}
		for(int i=0;i<row;i++){
		    for(int j=0;j<col;j++){
		        int printableValue=mat[i][j];
		        if(increment[i]&&!(printableValue+"").contains("0")) printableValue+=1;
		        System.out.print(printableValue+" ");
		    }
		    System.out.println();
		}

	}
}
