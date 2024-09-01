class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] mat=new int[m][n];
        if(m*n!=original.length) return new int[0][0];
        int id=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=original[id++];
            }
        }
        return mat;
    }
}
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Two Digital clocks
		Scanner sc=new Scanner(System.in);
		String[] t1=sc.next().split(":");
		String[] t2=sc.next().split(":");
		String[] c1=sc.next().split(":");
		int diff=Math.abs(Integer.parseInt(t1[0])*60+Integer.parseInt(t1[1])-(Integer.parseInt(t2[0])*60+Integer.parseInt(t2[1])));
		
		int clt=Integer.parseInt(c1[0])*60+Integer.parseInt(c1[1]);
		clt+=diff;
		System.out.print((clt/60%24)>9?clt/60%24+":":"0"+clt/60%24+":");
		if(clt%60<=9){
		    System.out.print(0);
		}
		System.out.print((clt%60));

	}
}
