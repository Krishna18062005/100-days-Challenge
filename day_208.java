import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Common Factors(X,Y) and (Y,Z)
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		List<Integer> ans=new ArrayList<>();
		for(int i=1;i<=Math.min(a,b);i++){
		    if(a%i==0&&b%i==0) ans.add(i);
		}
		for(int i=1;i<=Math.min(b,c);i++){
		    if(c%i==0&&b%i==0) ans.add(i);
		}
		ans.sort((a1,b1)->b1-a1);
		for(var i:ans){
		    System.out.print(i+" ");
		}

	}
}
