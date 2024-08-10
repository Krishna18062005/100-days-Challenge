//ily
//depressed !
// 0,1 ares stressing me !
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Split String & Shift Left;
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int num=sc.nextInt();
		ArrayList<String> ar=new ArrayList<>();
		int i=0;
		while(i+num<=s.length()){
		    ar.add(s.substring(i,i+num));
		    i=i+num;
		}
		if(i<s.length())
		ar.add(s.substring(i));
		int c0=-1;
		for(String st:ar){
		    
		c0++;
		
		System.out.println(rot(st,c0%st.length(),num));
        
}
	}
	static String rot(String st,int a,int le){
	    if(st.length()<le){
	        String strr=st.substring(a)+st.substring(0,a);
	       int req=le-strr.length();
	       while(req-->0){
	           strr+='*';
	       }
	       return strr;
	    }
	    if(a==0) return st;
	    return st.substring(a)+st.substring(0,a);
	}
}
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Top to Bottom - Triangle Pattern 
		int n=new Scanner(System.in).nextInt();
		
		for(int i=1;i<=n;i++){
		    System.out.print(i+" ");
		    int c=i;
		    for(int j=n;j>i;j--){
		        System.out.print((c=c+j)+" ");
		    }System.out.println();
		}

	}
}
