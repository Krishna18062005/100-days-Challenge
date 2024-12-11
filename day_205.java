import java.util.*;
public class Hello {
    public static void main(String []$){
        Scanner sc=new Scanner(System.in);
        List<Character> inp=new ArrayList<>();
        String ip=sc.next();
        for(int i=0;i<ip.length();i++){
            inp.add(ip.charAt(i));
        }
        while(inp.size()!=0){
            inp=SortUni(inp);
        }
    }

    public static List<Character> SortUni(List<Character> Kaidrix) {
		//Unique Alphabets Sorting
		Set<Character> set=new HashSet<>();
		List<Character> uni=new ArrayList<>();
		List<Character> dup=new ArrayList<>();
		for(char i:Kaidrix){
		    if(set.contains(i)){
		        dup.add(i);
		    }
		    else{
		        set.add(i);
		        uni.add(i);
		    }
		}
		uni.sort(null);
		for(char i:uni)
		System.out.print(i);
		return dup;
	}
}
