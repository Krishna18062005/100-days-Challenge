import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Four Digit Integers Divisible
		Scanner sc=new Scanner(System.in);
		
		String st=sc.nextLine();
		int d=sc.nextInt();
		sc.close();
		
		int c=0;
		for(int i=0;i+4<=st.length();i++){
		    if(st.charAt(i)=='0') continue;
		    else{
		        if(Integer.parseInt(st.substring(i,i+4))%d==0) c++;
		    }
		}
		System.out.print(c);

	}
}
