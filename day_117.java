import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Split string based on Vowels
		String inp=new Scanner(System.in).next();
		char[] s1=inp.toCharArray();
		char[] s2=new char[inp.length()];
		for(int i=0;i<inp.length();i++){
		    s2[i]='*';
		}
		for(int i=1;i<inp.length();i++){
		    if("aeiouAEIOU".contains(inp.charAt(i-1)+"")){
		       s2[i]=s1[i];
		        s1[i]='*';
		    }
		}
		System.out.print(new String(s1)+"\n"+new String(s2));

	}
}
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Enclose Vowels Within Hyphens
		String s=new Scanner(System.in).next();
		int v=0;
		for(int i=0;i<s.length();i++){
		    if("AEIOUaeiou".contains(""+s.charAt(i))) v++;
		}
	
		String[] rs=new String[v];
		for(int i=1;i<=v/2;i++){
		    int vc=0;
		   
		   
		    String[] d=s.split("");
		    for(int j=0;j<d.length;j++){
		        if("AEIOUaeiou".contains(d[j])) vc++;
		        if(vc==i){
		            d[j]="-"+d[j]+"-";
		            break;
		        }
		    }
		    vc=0;
		    
		    for(int k=d.length-1;k>=0;k--){
		        if("AEIOUaeiou".contains(d[k])) vc++;
		        if(vc==i){
		            d[k]="-"+d[k]+"-";
		            break;
		        }
		    }
		    String Ans="";
		    for(String st:d){
		        Ans+=st;
		    }
		   rs[i-1]=(Ans);
		 
		   
		}
		int ind=0;
		if(v%2==0)
		ind=v/2-1;
		else{
		    ind=v/2;
		    String ans="";
		    int vc=0;
		    for(int i=0;i<s.length();i++){
		        if("AEIOUaeiou".contains(s.charAt(i)+"")) vc++;
		        if(vc==ind+1){ ans+="-"+s.charAt(i)+"-"+s.substring(i+1);
		        break;
		        }
		        else{
		            ans+=s.charAt(i);
		        }
		        
		    }
		    rs[ind]=ans;
		}
		for(int j=v/2;j<v;j++){
		    rs[j]=rs[ind--];
		}
		for(String r:rs)
		System.out.println(r);
	}
}
