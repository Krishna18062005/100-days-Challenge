//
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Replace Border With String 
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		sc.nextLine();
		String[][] ma=new String[r][c];
		for(int i=0;i<r;i++){
		    ma[i]=sc.nextLine().split(" "); 
		}
		String ip=sc.next();
		int t=c-2;
		int f=r-2;
		int i=0;
		while(i<ip.length()){
		    if(i<c){
		        ma[0][i]=ip.charAt(i)+"";
		    }else if(i<r+c-1){
		        ma[i-c+1][c-1]=ip.charAt(i)+"";
		    }
		    else if(i<r+c+r-2){
		        ma[r-1][t--]=ip.charAt(i)+"";
		    }
		    else{
		        ma[f--][0]=ip.charAt(i)+"";
		    }
		    i++;
		}
	for(i=0;i<r;i++){
	    for(int j=0;j<c;j++){
	        System.out.print(ma[i][j]+" ");
	    }
	    System.out.println();
	}

	}
}
//ip 
//3 3 
//A b c 
//d * f
// g h i
//d@Szling

// d @ $
// g * z
// n i l
