import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Dice Roll Game
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//4
		int[] ma=new int[n];
		for(int i=0;i<n;i++){
		    ma[i]=sc.nextInt();//1 6 3 4
		}
		int a=0,b=0;
		boolean f=true;
		boolean s=false;
		for(int i=0;i<n;i++){
		    if(f) a+=ma[i];
		    if(s) b+=ma[i];
		    if(ma[i]!=6){
		        f=!f;
		        s=!s;
		    }
		    
		}
		System.ou.print(a+" "+b);//5 9

	}
}
