public class Solution {
    public static int upperBound(int []arr, int x, int n){
        // Write your code here.
        int i=0;
        int j=n-1;
        int ans=n;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]>x){
                ans=mid;
                j=mid-1;
            } 
            else if(arr[mid]<=x){
                i=mid+1;
            }

        }
        return ans;
    }
}
