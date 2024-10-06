class Solution {
    public int maxGoodNumber(int[] nums) {
        String fn[]=new String[3];
        for(int i=0;i<3;i++){
        fn[i]=Integer.toBinaryString(nums[i]);
        }
        int max=0;
        for(int i=0;i<3;i++){
            String ans=fn[i%3]+fn[(i+1)%3]+fn[(i+2)%3];
            max=Math.max(Integer.parseInt(ans,2),max);
            String an=fn[i%3]+fn[(i+2)%3]+fn[(i+1)%3];
            max=Math.max(Integer.parseInt(an,2),max);
            String ana=fn[(i+2)%3]+fn[(i+1)%3]+fn[i%3];
            max=Math.max(Integer.parseInt(ans,2),max);

        }
        return max;
    }
}
