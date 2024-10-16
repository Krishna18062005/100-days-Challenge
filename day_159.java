import java.util.*;
public class Hello {

    public static void main(String[] arg) {
		String st=new Scanner(System.in).next();
		boolean M5=false;
		char ch=st.charAt(0);
		int r=(ch-'0'==0)?1:0;
		String nn=r+st.substring(1);
		if(Integer.parseInt(nn,2)%5==0) M5=true;
		for(int i=1;i<st.length();i++){
		    if(st.charAt(i)=='0') {
		        String str=st.substring(0,i)+'1'+st.substring(i+1);
		        int ans=Integer.parseInt(str,2);
		        if(ans%5==0)
		        M5=true;
		    }
		    else{
		        String str=st.substring(0,i)+'0'+st.substring(1+i);
		        int ans=Integer.parseInt(str,2);
		        if(ans%5==0)
		        M5=true;
		    }
		}
		System.out.println((M5)?"Yes":"No");
	//	System.exit(0);
		

	}
}
