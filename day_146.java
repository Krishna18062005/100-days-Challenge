class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int[] ans=new int[2];
        int id=0;
        for(int i:nums){
            if(set.contains(i)){
                ans[id++]=i;
            }
            else{
                set.add(i);
            }
        } 
        Arrays.sort(ans);
        return ans;
    }
}
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Pattern to Pattern 
		String pattern[] =new Scanner(System.in).next().split(":");
		for(String pat:pattern){
		    String nums[] =pat.split("-");
		    for(int i=0;i+1<nums.length;i++){
		        for(int j=Integer.parseInt(nums[i]);j<=Integer.parseInt(nums[i+1]);j++){
		            System.out.print(j+" ");
		        }
		        System.out.println();
		    }
		    
		}
    }
}
