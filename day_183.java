class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int sum=Integer.MAX_VALUE;
        for(int i=l;i<=r;i++){
            sum=Math.min(minPos(nums,i),sum);
            //System.out.print(sum);
        }
        return (sum==Integer.MAX_VALUE)?-1:sum;
        
        
    }
    public static int minPos(List<Integer> num,int k){
        
        int s=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<k;i++){
            s+=num.get(i);
        }
        if(s>0) min=s;
        for(int i=k;i<num.size();i++){
            s+=num.get(i)-num.get(i-k);
            if(s>0) min=Math.min(min,s);
        }
        return min;
    }
}


class Solution {
    public boolean isPossibleToRearrange(String s, String t, int k) {
        int d=s.length()/k;
        if(s.equals(t)) return true;
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i+=d){
            String req=s.substring(i,i+d);
            if(map.containsKey(req)){
                map.put(req,map.get(req)+1);
            }
            else
            map.put(s.substring(i,i+d),1);
        }
        for(int i=0;i<t.length();i+=d){
            String tar=t.substring(i,i+d);
            if(!map.containsKey(tar)) return false;
            else if(map.get(tar)<1) return false;
            else{
                map.put(tar,map.get(tar)-1);
            }
        }
        return true;
    }
}
