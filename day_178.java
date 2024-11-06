import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Spin Game
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int key=sc.nextInt();
		for(int i=0;i<n;i++){
		    if(arr[i]<0){
		        key=(key-arr[i])%100;
		        if(key<0){
		            key=100+key;
		        }
		    }
		    else{
		    key-=arr[i]%100;
		    if(key<0){
		        key=100+key;
		    }
		    }
		    System.out.print((key)+" ");
		}

	}
}


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Sum - Middle & Alternative Ends;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int mid=n/2;
		int[] arr=new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		for(int i=0;i<mid;i++){
		    System.out.print(arr[mid]+arr[i]+" "+(arr[n-i-1]+arr[mid])+" ");
		} 

	}
}
