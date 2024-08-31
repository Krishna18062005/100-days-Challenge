class Solution {
    public int generateKey(int num1, int num2, int num3) {
        String n1=num1+"";
        String n2=num2+"";
        String n3=num3+"";
        n1=makePerfect(n1);
        n2=makePerfect(n2);
        n3=makePerfect(n3);
        int ans=0;
        for(int i=0;i<4;i++){
            ans=ans*10+Math.min(n1.charAt(i)-'0',Math.min(n2.charAt(i)-'0',n3.charAt(i)-'0'));

        }
        return ans;
    }
    public static String makePerfect(String a){
        int req=4-a.length();
        if(req==0) return a;
        else{
            for(int i=0;i<req;i++){
                a='0'+a;
            }
        }
        return a;
    }
}
