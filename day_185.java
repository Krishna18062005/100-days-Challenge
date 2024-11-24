import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Insert Subarray Sum
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int t=sc.nextInt();
		ArrayList<Integer> ar=new ArrayList<>();
		for(int i=0;i<n;i++){
		    
		    ar.add(sc.nextInt());
		}
		int s=0;
		for(int i=0;i<k;i++){
		    s+=ar.get(i);
		}
		ar.add(s);
		Collections.sort(ar);
		t--;
		int r=t+1+n;
		for(int i=k;i<r&&t>0;i++){
		    s+=ar.get(i)-ar.get(i-k);
		    ar.add(s);
		    Collections.sort(ar);
		    t--;
		}
		//Arrays.sort(ar);
		for(int i:ar){
		    System.out.print(i+" ");
		}

	}
}
