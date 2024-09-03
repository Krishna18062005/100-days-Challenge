import java.util.* ;
import java.io.*; 
public class Solution {
	public static int slotScore(String or, String g) {
		// Write your code here.
		ArrayList<Character> s1=new ArrayList<>();
		ArrayList<Character> s2=new ArrayList<>();
		int s=0;
		for(int i=0;i<or.length();i++){
			if(or.charAt(i)==g.charAt(i)) s+=2;
			else {
				s1.add(or.charAt(i));
				s2.add(g.charAt(i));
				
				
			}}
			for(char i:s1){
				for(int j=0;j<s2.size();j++){
					if(i==s2.get(j)){
						s+=1;
						s2.remove(j);
						break;
					}
				}
			}

		
		return s;
	}
}
class Solution {
    public int getLucky(String st, int k) {
        
        String str="";
        for(char i:st.toCharArray()){
            str+=(i-'a'+1);
        }
        System.out.println(str);
        int i=0;
        while(i<k){
            str=sum(str);
            System.out.print(str+" ");
            i++;
        }
        return Integer.parseInt(str);
    }
    public static String sum(String s){
        int su=0;
        for(char i:s.toCharArray()){
            su+=i-'0';
        }
        return Integer.toString(su);

    }
}
