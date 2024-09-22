
class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        int c=0;
        Set<String> se=new HashSet<>(Arrays.asList(bannedWords));
        System.out.print(se);
            for(String i:message){
                if(se.contains(i)){
                    c++;}
                if(c>1){
                    return true;
                }
        }
        
        return c>1;
    }
}
