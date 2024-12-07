import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Fill Water Tanks - Rain
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar1=new int[n];
		int[] ar2=new int[n];
		int ans=0;
		for(int i=0;i<n;i++){
		    ar1[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
		    ar2[i]=sc.nextInt();
		}
		boolean full[] =new boolean[n];
		int anss=0;
		while(!allFilled(full)){
		    anss=ans;
		    for(int i=0;i<n;i++){
		        ar2[i]++;
		        if(ar2[i]>ar1[i]){
		            full[i]=true;
		            ans++;
		        }
		        
		    }
		}
		System.out.print(anss);
		

	}
	static boolean allFilled(boolean ar[]){
	    for(boolean i:ar){
	        if(!i) return false;
	    }
	    return true;
	}
}
