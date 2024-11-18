import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Flip Vertically - MAtrix Product
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][] m1=new int[r][c];
		int[][] m2=new int[r][c];
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        m1[i][j]=sc.nextInt();
		    }
		}
		for(int i=0;i<r;i++){
		    for (int j=0;j<c;j++){
		        m2[i][j]=sc.nextInt();
		    }
		}
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        System.out.print(m1[i][j]*m2[r-i-1][j]+" ");
		    }
		    System.out.println();
		}

	}
}
