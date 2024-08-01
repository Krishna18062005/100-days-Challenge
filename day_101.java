import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//List Compression Add Two Integers
		Scanner sc=new Scanner(System.in);
		List<Integer> ar=new ArrayList<>();
		while(sc.hasNext()){
		    ar.add(sc.nextInt());
		}
		Collections.sort(ar);
		for(int i:ar)
		System.out.print(i+" ");
		System.out.println();
		while(ar.size()>1){
		    ar=addPairsInList(ar);
		}

	}
	static List<Integer> addPairsInList(List<Integer> ar){
	    List<Integer> ans=new ArrayList<>();
	    int n=ar.size();
	   
	    for(int i=0;i+1<n;i+=2){
	        int s=ar.get(i)+ar.get(i+1);
	        System.out.print(s+" ");
	        ans.add(s);
	    }
	    if(n%2!=0){
	    int a=ar.get(ar.size()-1);
	    ans.add(a);
	    System.out.print(a);
	}   System.out.println();
	    return ans;
	}
}
