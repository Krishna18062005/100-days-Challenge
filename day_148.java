class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String ,Integer> map=new HashMap<>();
        HashSet<String> set=new HashSet<>();
        for(String s:s1.split(" ")){
            set.add(s);
            if(map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }
            else{
                map.put(s,1);
            }
        }
        for(String s:s2.split(" ")){
            set.add(s);
            if(map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }
            else{
                map.put(s,1);
            }
        }
        String ans="";
        for(String i:set){
            if(map.get(i)==1){
                ans+=i+" ";
            }
        }
        if(ans.equals("")) return new String[0];
        return ans.split(" ");
    }
}
