import java.util.*;
public class Solution {
    public static int[] getFrequencies(int []v) {
        // Write Your Code Here
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:v){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else map.put(i,1);
        }
        int maxf=0;
        int minf=v.length;
        int maxele=Integer.MAX_VALUE;
        int minele=Integer.MAX_VALUE;
        for(int i:v){
            int key=map.get(i);
            if(key<=minf){
                minf=key;
           }
            if(key>=maxf){
                maxf=key;                
            }
        }
        for(int i:v){
             int key=map.get(i);
            if(key==minf){
                minele=Math.min(minele,i);
            }
            if(key==maxf){
                maxele=Math.min(maxele,i);
            }
        }
        int[] ans={maxele,minele};
        return ans;
    }
}
