import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//form List of Integers - Digits 
		Scanner sc=new Scanner(System.in);
		String[] Digits=sc.nextLine().split(" ");
		int[] freq= new int[10];
		while(sc.hasNext()){
		    int n=sc.nextInt();
		    while(n>0){
		        freq[n%10]++;
		        n/=10;
		    }
		}
		for(int i=0;i<10;i++){
		    if(Integer.parseInt(Digits[i])<(freq[i])){
		        System.out.print("NO");
		        return;
		    }
		}
		System.out.print("YES");

	}
}
