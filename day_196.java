import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Alphabets & Hexadecimal
		char[] Hex=Integer.toHexString(new Scanner(System.in).nextInt()).toUpperCase().replace("0","O").replace("1","L").toCharArray();
		for(char i:Hex){
		    if(i=='A'||i=='B'||i=='C'||i=='D'||i=='E'||i=='F'||i=='O'||i=='L') continue;
		    else{
		        System.out.print(-1);
		        return;
		    }
		}
		System.out.print(Hex);

	}
}
