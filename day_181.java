import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Generate Sequence By Position
		int n=new Scanner(System.in).nextInt();
		int c;
		int num=3;
		ArrayList<Integer> ans=new ArrayList<>();
		ans.add(1);
		ans.add(2);
		ans.add(2);
		int i=1;
		while(i<10000){
		    c=ans.get(num-1);
		    while(c>0){
		        ans.add(num);
		        i++;
		        c--;
		     
		    }
		    num++;
		    
		}
		for(i=0;i<n;i++){
		    System.out.print(ans.get(i)+" ");
		}

	}
}
