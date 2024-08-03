import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Sort Digits -Odd/Even
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []ar=new int[n];
		for(int i=0;i<n;i++){
		    ar[i]=sortDigit(sc.next());
		}
		int s=0;
		for(int i:ar){
		    s+=i;
		}System.out.print(s);

	}
	static int sortDigit(String a){
	    int ld=a.charAt(a.length()-1)-'0';
	    a=a.substring(0,a.length()-1);
	    char[] arr=a.toCharArray();
	    Arrays.sort(arr);
	    if(ld%2==0){
	        for(int i=0;i<arr.length/2;i++){
	            char tmp=arr[i];
	            arr[i]=arr[arr.length-i-1];
	            arr[arr.length-i-1]=tmp;
	        }
	    }
	    int ans=0;
	    for(char i:arr){
	        ans=ans*10+(int)i-48;
	    }
	    ans=ans*10+ld;
	    
	    return ans;
	}
}
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Matric - Integers / Alphabets 
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		char[][] mat=new char[r][c];
		for(int i=0;i<r;i++) for(int j=0;j<c;j++) mat[i][j]=sc.next().charAt(0);
		int numc=0;
		int alpc=0;
		for(char[] i:mat){
		    for(char j:i){
		        if(((int)j-'0'<=9) &&((int)j-'0'>=0)) numc++;
		        else alpc++;
		    }
		}
		int sq=(int)Math.sqrt(numc);
		int sq2=(int)Math.sqrt(alpc);
		if(numc==sq*sq&&alpc==sq2*sq2) {
		    if(alpc>=numc){
		        print(0,sq2,mat);
		    }
		    else{
		        print(1,sq,mat);
		    }
		}
		else if(numc==sq*sq) print(1,sq,mat);
		else print(0,sq2,mat);
		
	}
	static void print(int a,int count,char[][] ma){
	    if(a==1){
	        int c=0;
	        for(char[] i:ma){
	            for(char j:i){
	                if((int)j-'0'<=9&&(int)j-'0'>=0){
	                    c++;
	                    System.out.print(j+" ");
	                }
	                if(c==count){
	                    System.out.println();
	                    c=0;
	                }
	            }
	        }
	    }
	    else{
	        int c=0;
	        for(char[] i:ma){
	            for(char j:i){
	                if(!((int)j-'0'<=9&&(int)j-'0'>=0)) {
	                    System.out.print(j+" ");
	                    c++;
	                }
	                if(c==count){
	                    System.out.println();
	                    c=0;
	                }
	            }
	        }
	    }
	}
}
