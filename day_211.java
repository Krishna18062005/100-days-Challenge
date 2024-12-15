import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		int n=new Scanner(System.in).nextInt();
		for(int i=2;i+6<=n;i++){
		    if(isp(i)&&isp((i+6))){
		        System.out.println(i+" "+(i+6));
		    }
		}

	}
	public static boolean isp(int i){
	    if(i==2||i==3) return true;
	    if(i%2==0||i%3==0) return false;
	    for(int ii=4;ii*ii<=i;ii++){
	        if(i%ii==0) return false;
	    }
	    return true;
	}
}
