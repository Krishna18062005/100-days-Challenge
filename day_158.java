import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//minimum left remoVAL TO MAKE STRING EQUAL 
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		int c=-1;
		boolean k=true;
		for(int i=0;i<s1.length()&&k;i++){
		    for(int j=0;j<s2.length();j++){
		        if(s1.substring(i).equalsIgnoreCase(s2.substring(j))){
		           //System.out.println(i+" "+j);
		            c=i+j;
		            k=false;
		            break;
		        }
		    }
		}
		System.out.println(c);

	}
}
