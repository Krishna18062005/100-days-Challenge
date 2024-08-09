import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Nearest Character
		Scanner sc=new Scanner(System.in);
		String i1=sc.next();
		String i2=sort(sc.next());
//System.out.print(i2);
		for(int i=0;i<i1.length();i++){
		    int min=9999;
		    char mc=i2.charAt(0);
		    for(int j=0;j<i2.length();j++){
		        char f=i1.charAt(i);
		        char s=i2.charAt(j);
		        if(Math.abs((int)f-(int)s)<min){
		            
		            min=Math.abs((int)f-(int)s);
		            
		            mc=s;
		        }
		    }
		    System.out.print(i1.charAt(i)+""+mc+" ");
		}

	}
	static String sort(String a){
	    char[] ar=a.toCharArray();
	    Arrays.sort(ar);
	    String ans="";
	    for(char i:ar){
	        ans+=i;
	    }
	    return ans;
	}
}
