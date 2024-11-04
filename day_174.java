// class Solution {//1004 ms
//     public String compressedString(String word) {
//         String ans="";
//         char prev=word.charAt(0);
//         int c=0;
//         for(int i=0;i<word.length();i++){
//             if(prev!=word.charAt(i)){
//                 ans+=c+""+prev;
//                 c=1;
//                 prev=word.charAt(i);
//             }
//             else{
                
//                 if(c>8){
//                     ans+=c+""+prev;
//                     c=0;
//                     prev=word.charAt(i);
//                 }
//                 c++;
//             }

//         }
//         if(c>0){
//             ans+=c+""+prev;

//         }
//         return ans;

//     }
// }


// class Solution {//36ms
//     public String compressedString(String word) {
//         StringBuilder ans=new StringBuilder("");
//         char prev=word.charAt(0);
//         int c=0;
//         for(int i=0;i<word.length();i++){
//             if(prev!=word.charAt(i)){
//                 ans.append(c+""+prev);
//                 c=1;
//                 prev=word.charAt(i);
//             }
//             else{
                
//                 if(c>8){
//                     ans.append(c+""+prev);
//                     c=0;
//                     prev=word.charAt(i);
//                 }
//                 c++;
//             }

//         }
//         if(c>0){
//             ans.append(c+""+prev);

//         }
//         return ans.toString();

//     }
// }

class Solution {//18ms
    public String compressedString(String word) {
        StringBuilder ans=new StringBuilder("");
        char prev=word.charAt(0);
        int c=0;
        for(int i=0;i<word.length();i++){
            if(prev!=word.charAt(i)){
                ans.append(c);
                ans.append(prev);
                c=1;
                prev=word.charAt(i);
            }
            else{
                
                if(c>8){
                    ans.append(c);
                    ans.append(prev);
                    c=0;
                    prev=word.charAt(i);
                }
                c++;
            }

        }
        if(c>0){
            ans.append(c);
            ans.append(prev);

        }
        return ans.toString();

    }
}
