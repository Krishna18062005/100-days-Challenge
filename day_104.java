import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static ArrayList<Integer> rowWaveForm(ArrayList<ArrayList<Integer>> mat) {

		// Write your code here
		ArrayList<Integer> ans=new ArrayList<>();
		for(int i=0;i<mat.size();i++){
			for(int j=0;j<mat.get(i).size();j++){
				if(i%2==0) ans.add(mat.get(i).get(j));
				else ans.add(mat.get(i).get(mat.get(i).size()-j-1));
			}
		}
	
		return ans;
	}
}
