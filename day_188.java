import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Shift Right A
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int[][] mat=new int[row][col];
		for(int i=0;i<row;i++){
		    for(int j=0;j<col;j++){
		        mat[i][j]=sc.next().charAt(0)-'A'; 
		    }
		}
		for(int i=0;i<row;i++){
		    int c=0;
		    for(int j=0;j<col;j++){
		        if(mat[i][j]==1){
		            System.out.print("- ");
		        }
		        else c++;
		    }
		    while(c-->0){
		        System.out.print("A ");
		    }
		    System.out.println();
		}
	}
}
