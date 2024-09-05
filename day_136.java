public class Solution {
    public static int minCostRearrangement(int x) {
        int i=0;
        int ans=x%10;
        while(x>0){
            if(x%2==0){
                return 0;
            }
            ans=Math.min(x%10,ans);
            x/=10;
        }
        return ans;
    }
}
