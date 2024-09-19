import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Largest Integer -Sorted Digits
		int n=new Scanner(System.in).nextInt();
		for(int i=n;i>0;i--){
		    if(isSort(i)){
		        System.out.println(i);
		        break;
		    }
		    
		}
		

	}
	static boolean isSort(int n){
	    char[] ar=Integer.toString(n).toCharArray();
	    for(int i=0;i+1<ar.length;i++){
	        if((ar[i])>(ar[i+1])) return false;
	    }
	    return true;
	}
}
