class Solution {
    public int[] xorQueries(int[] arr, int[][] q) {
        int[] ps=new int[arr.length];
        int[] ans=new int[q.length];
        ps[0]=arr[0];
                for(int i=1;i<arr.length;i++){
                    
                        
                        ps[i]=ps[i-1]^arr[i];
                     }
                 for(int i=0;i<q.length;i++){
                    int f=q[i][0];
                    int s=q[i][1];
                    if(f==0) ans[i]=ps[s];
                    else
                   ans[i]=ps[s]^ps[f-1];
                 }    
                 return ans;
    }
}
