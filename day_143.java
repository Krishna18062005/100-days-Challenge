class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int c=0;
        for(String i:words){
            for(int j=0;j<i.length();j++){
                if(!allowed.contains(""+i.charAt(j))){
                    break;

                }
            if(j==i.length()-1) c++;
            }
        }
        return c;
    }
}
