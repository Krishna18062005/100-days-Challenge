import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Sort Digits -Odd/Even
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []ar=new int[n];
		for(int i=0;i<n;i++){
		    ar[i]=sortDigit(sc.next());
		}
		int s=0;
		for(int i:ar){
		    s+=i;
		}System.out.print(s);

	}
	static int sortDigit(String a){
	    int ld=a.charAt(a.length()-1)-'0';
	    a=a.substring(0,a.length()-1);
	    char[] arr=a.toCharArray();
	    Arrays.sort(arr);
	    if(ld%2==0){
	        for(int i=0;i<arr.length/2;i++){
	            char tmp=arr[i];
	            arr[i]=arr[arr.length-i-1];
	            arr[arr.length-i-1]=tmp;
	        }
	    }
	    int ans=0;
	    for(char i:arr){
	        ans=ans*10+(int)i-48;
	    }
	    ans=ans*10+ld;
	    
	    return ans;
	}
}
