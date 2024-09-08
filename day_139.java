class Solution {
    public long findMaximumScore(List<Integer> nums) {
        long ans=0;
        long prev=nums.get(0);
        int pri=0;
        for(int i=0;i<nums.size();i++){
            if(prev<nums.get(i)||i==nums.size()-1){
                ans+=((i-pri)*prev);
                prev=nums.get(i);
                pri=i;
            }

        }
        return ans;
    }
}

class Solution {
    public String convertDateToBinary(String date) {
        String[] ans=date.split("-");
        String ar="";
        for(String i: ans ){
            ar+=Integer.toBinaryString(Integer.parseInt(i))+"-";
        }
        return ar.substring(0,ar.length()-1);
    }
}
class Solution {
    public String largestNumber(int[] nums) {
        String[] n=new String[nums.length];
        int id=0;
        for(int i:nums){
            n[id++]=i+"";
        }
        Arrays.sort(n,(a,b)->(b+a).compareTo(a+b));
        String ans="";
        for(String s:n){
            ans+=s;
        }
        if(ans.charAt(0)=='0') return "0";
        return ans;
    }
}

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Matching Word - Replace ?
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] str=sc.nextLine().split(" ");
		System.out.println(s);
		for(String st:str){
		    if(st.length()!=s.length()) continue;
		    else{
		        int i=0;
		        for(;i<s.length();i++){
		            if(s.charAt(i)!=st.charAt(i)&&s.charAt(i)!='?') 
		            break;
		            }
		            if(i==s.length()){
		    System.out.print(st);
		     break;}
		}    
		}

	}
}
