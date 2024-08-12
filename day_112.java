import java.util.* ;
import java.io.*; 
public class Solution{
    public static boolean checkMeta(String str1, String str2) {
        // Write your code here.
        int dif=0;
        if(str1.length()!=str2.length()) return false;
        char[] a=str1.toCharArray();
        char[] b=str2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(!Arrays.equals(a,b)) return false;
        for(int i=0;i<str1.length();i++){
        if(str1.charAt(i)!=str2.charAt(i)) dif++;
        }
        return dif==2;
    }
}
