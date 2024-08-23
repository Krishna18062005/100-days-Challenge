import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Largest Two-digit Even Integer
		String[] n=new Scanner(System.in).next().split("");
		Arrays.sort(n);
		int ed=1;
		for(int i=n.length-2;i>=0;i--){
		    int k=Integer.parseInt(n[i]);
		    if(k%2==0){
		        ed=k;
		        break;
		    }
		}
		if(ed!=1)
		System.out.println(n[n.length-1]+""+ed);
		else{
		    System.out.println(n[n.length-2]+""+n[n.length-1]);
		}

	}
}
