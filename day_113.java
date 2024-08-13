import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Append ,Prepenf and Concatenate
		Scanner sc=new Scanner(System.in);
		String ip=sc.next();
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
		    String m=sc.next();
		    if(m.equals("S++")){
		        ip=ip+ip.charAt(ip.length()-1);
		    }
		    else if(m.equals("S+1"))
		    ip=ip+ip;
		    else{
		        ip=ip.charAt(0)+ip;
		    }
		    System.out.println(ip);
		}

	}
}
import java.util.* ;
import java.io.*; 
/*******************************************
 *
 *   Following is the Pair class structure
 *
 *   class Pair{
 *
 *       char firstLetterOfName;
 *       int avgMarks;
 *
 *       Pair(char firstLetterOfName, int avgMarks){
 *           this.firstLetterOfName = firstLetterOfName;
 *           this.avgMarks = avgMarks;
 *       }
 *   } 
 *
 **********************************************/


public class Solution {
	public static Pair averageMarks(char firstLetterOfName, int m1, int m2, int m3) {
		// Write your code here.
		return new Pair(firstLetterOfName,(m1+m2+m3)/3);
	}
}
