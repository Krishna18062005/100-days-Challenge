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
