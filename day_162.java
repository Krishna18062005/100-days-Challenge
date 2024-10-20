class Solution {
    public List<String> stringSequence(String target) {
        String as=new String("a");
        List<String> ans=new ArrayList<>();
        ans.add(as);
        int i=0;
        int j=0;
        while(!as.equals(target)){
           
            if(target.charAt(i)==as.charAt(j)){
                i++;
                j++;
                as+='a';
                ans.add(as);
            }
            else{
                char l=as.charAt(j);
                if(l=='z'){
                    l='a';
                }
                else{
                    l=(char)(int)(l+1);
                }
                as=as.substring(0,j)+l;
                ans.add(as);

            }

        }
        return ans;
    }
}


class Solution {
    public int numberOfSubstrings(String s, int k) {
        int c=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String ss=s.substring(i,j+1);
              
                if(count(ss,k)) c++;
            }
        }
        return c;
    }
    public static boolean count(String s,int k){
        int[] fr=new int[26];
        for(char i:s.toCharArray()){
            fr[i-'a']++;
        }
        for(int i:fr){
            if(i>=k) return true;
        }
        return false;
    }
}
