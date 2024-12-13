import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Word with Maximum Score
		Scanner sc=new Scanner(System.in);
		String inp=sc.nextLine();
		int n=sc.nextInt();
		int max=0;
		String ans="";
		while(n-->0){
		    String ip=sc.next();
		    int sco=0;
		    for(int i=0;i<ip.length();i++){
		        sco+=(inp.indexOf(ip.charAt(i)))+1;
		    }
		    if(max<sco){
		        max=sco;
		        ans=ip;
		    }
		}
		System.out.println(ans);

	}
}
