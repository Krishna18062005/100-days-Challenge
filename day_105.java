import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Absent Nurses
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
		    String ip=sc.next();
		    String ans="";
		    String od="";
		    for(char ic:ip.toCharArray()){
		        if(ans.contains(ic+"")) od=""+ic;
		        else ans+=ic;
		        
		    }
		    String lev="";
		    for(int j=0;j<=6;j++){
		        if(!ans.contains((char)(65+j)+"")) lev=(char)(65+j)+"";
		    }
		    if(lev==od){
		        System.out.println(-1);
		    }
		    else{
		        System.out.println(lev+" "+od);
		    }
		}

	}
}
