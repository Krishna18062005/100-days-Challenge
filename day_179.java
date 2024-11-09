class Solution {
    public int smallestNumber(int n, int t) {
        while(!dig(n,t)){
            n++;
        } 
        return n;
    }
    public static boolean dig(int a,int d){
        if(d==0) return true;
        int p=1;
        while(a!=0){
            p*=a%10;
            a/=10;
        }
        return p%d==0;
    }
}
