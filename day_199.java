import java.util.*;
public class Hello {

    public static void main(String[] Kaidrix) {
		//Matrix Modification Queries
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][] mat=new int[r][c];
		int n=sc.nextInt();
		for(;n-->0;){
		    String a=sc.next();
		    if(a.contains("r")&&a.contains("c")){
		        String[] nu=a.split("\\D+");
		        String[] va=a.split("\\d+");
		        int row=Integer.parseInt(nu[0]);
		        int col=Integer.parseInt(nu[1]);
		        if(va[1].contains("c")) {
		            int t=row;
		            row=col;
		            col=t;
		        }
		        mat[row-1][col-1]++;
		        
		    }
		    else if(a.contains("r")){
		        int row=Integer.parseInt(a.substring(0,a.indexOf("r")));
		        for(int i=0;i<c;i++){
		            mat[row-1][i]++;
		        }
		    }
		    else if(a.contains("c")){
		        int col=Integer.parseInt(a.substring(0,a.indexOf("c")));
		        for(int i=0;i<r;i++) mat[i][col-1]++;
		    }
		}
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        System.out.print(mat[i][j]+" ");
		    }
		    System.out.println();
		}
	}
}//--> Kaidrix
