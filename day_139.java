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
