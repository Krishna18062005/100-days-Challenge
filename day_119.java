import java.util.* ;
import java.io.*; 

public class Solution {
	public static void posAndNeg(int[] arr) {
		// Write your code here
		int i=0;
		int j=1;
		int id=0;
		int[] cp=new int[arr.length];
		while(id<cp.length){
			if(arr[id]>=0){
				cp[i]=arr[id];
				i+=2;
			}
			else{
				cp[j]=arr[id];
				j+=2;
			}
			id++;
		}
		for(i=0;i<cp.length;i++)
		arr[i]=cp[i];
	}

}
