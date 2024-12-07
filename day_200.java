import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//BinaryPattern
		int n=new Scanner(System.in).nextInt();
		int k=(int)Math.pow(2,n);
		for(int ii=0;ii<k;ii++){
		    String an=Integer.toBinaryString(ii);
		    for(int i=n-an.length();i>0;i--){
		        System.out.print(0+" ");
		    }
		    for(int i=0;i<an.length();i++){
		        System.out.println(an.charAt(i)+" ");
		    }
		    System.out.println();
		    
		}

	}
}
