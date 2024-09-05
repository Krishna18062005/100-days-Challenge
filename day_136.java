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
class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int sum=0;
        for(int i:rolls) sum+=i;
        int reqs=mean*(n+rolls.length);
        reqs-=sum;
        int mre=reqs/n;
        if(sum+(n*6)<reqs+sum||mre==0||reqs<0){
            return new int[0];
        }
        int ex=reqs%n;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=mre;
            while(ans[i]<6&&ex>0){
                ans[i]+=1;
                ex--;
            }
        }
        return ans;
    }
}
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Sequence - Based on Previous term
		int st=new Scanner(System.in).nextInt();
		
		while(st!=1){
		    System.out.print(st+" ");
		    if(st%2==0){
		        st/=2;
		    }
		    else{
		        st=(st*3)+1;
		    }
		}
		System.out.print(1);

	}
}
