
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Consonants & Square Brackets
		String ip=new Scanner(System.in).next();
		int c=0;
		for(char i:ip.toCharArray()){
		    if(i=='a'||i=='e'||i=='i'||i=='o'||i=='u'||i=='A'||i=='E'||i=='I'||i=='O'||i=='U'){
		        continue;
		    }
		    c++;
		}
		
		String[] Ar=ip.split("");
		for(int i=1;i<=(c+1)/2;i++){
		    
		    sqbrack(Ar);
		    
		    System.out.println(String.join("",Ar));
		}

	}
	static void sqbrack(String[] ar){
	    for(int i=0;i<ar.length;i++){
	        if(!"AEIOUaeiou".contains(ar[i])&&!ar[i].contains("[")){
	            ar[i]='['+ar[i]+"]";
	            break;
	        }
	    }
	    for(int i=ar.length-1;i>=0;i--){
	        if(!"AEIOUaeiou".contains(ar[i])&&!ar[i].contains("[")){
	            ar[i]="["+ar[i]+"]";
	            break;
	        }
	    }
	}
}
