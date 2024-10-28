import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Distance Balanced String
		String str=new Scanner(System.in).next();
		int firstHalfSum=0;
		int secondHalfSum=0;
		int i=0;
		int j=str.length()/2;
		while(j<str.length()){
		    char chf=str.charAt(i);
		    char chs=str.charAt(j);
		    if(chf>95){
		        firstHalfSum+=(int)(chf-'a');
		    }
		    else{
		        firstHalfSum+=(int)(chf-'A');
		    }
		    if(chs>95){
		        secondHalfSum+=(int)(chs-'a');
		    }
		    else{
		        secondHalfSum+=(int)(chs-'A');
		    }
		    i++;
		    j++;
		    
		}
		System.out.print((firstHalfSum==secondHalfSum)?"Yes":"No");
		

	}
}
