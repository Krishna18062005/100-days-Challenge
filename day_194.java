https://www.hackerrank.com/challenges/contacts/problem?isFullScreen=true
//question no: 720
class TrieNode{
    TrieNode[] child=new TrieNode[26];
    String w;
    public TrieNode(){
        for(int i=0;i<26;i++){
            child[i]=null;
        }
    }
}

class Trie {
    static TrieNode root;
    public Trie(){
        root=new TrieNode();
    }
    public void insert(String word){
        TrieNode current=root;
        for (int i = 0; i < word.length(); i++) {
            int index=word.charAt(i)-'a';
            if(current.child[index]==null){
                current.child[index]=new TrieNode();
            }
            current=current.child[index];
        }
        current.w=word;
    }

}
class Solution {
    static String res;
    static void dfs(TrieNode root){
        if(root==null){
            return;
        }
        if(root.w!=null){
            if(root.w.length()>res.length() || root.w.length()==res.length();&&root.w.compareTo(res)<0){
                res=root.w;
            }
        }
        for(int i=0;i<26;i++){
            if(root.child[i]!=null && root.child[i].w!=null){
                dfs(root.child[i]);
            }
        }
    }
    public String longestWord(String[] words) {
        Trie t=new Trie();
        for(String word:words){
            t.insert(word);
        }
        res="";
        dfs(t.root);
        return res;
    }
}
class TrieNode{
    TrieNode[] child=new TrieNode[26];
    boolean end;
    public TrieNode(){
        end=false;
        for(int i=0;i<26;i++){
            child[i]=null;
        }
    }
}

class Trie {
    static TrieNode root;
    public Trie(){
        root=new TrieNode();
    }
    public void insert(String word){
        TrieNode current=root;
        for (int i = 0; i < word.length(); i++) {
            int index=word.charAt(i)-'a';
            if(current.child[index]==null){
                current.child[index]=new TrieNode();
            }
            current=current.child[index];
        }
        current.end=true;
    }

    public String search(String word){
        TrieNode current=root;
        StringBuilder res=new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            int index=word.charAt(i)-'a';
            if(current.child[index]==null){
                return word;
            }
            res.append(word.charAt(i));
            current=current.child[index];
            if(current.end){
                return res.toString();
            }
        }
        return word;
    }
}
class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        Trie t=new Trie();
        StringBuilder sb=new StringBuilder();
        for(String word: dictionary){
            t.insert(word);
        }
        String words[]=sentence.split(" ");
        for(String word:words){
            sb.append(t.search(word)).append(" ");
        }
        return sb.toString().trim();
    }
}

//leetcode question no: 208
class TrieNode{
    TrieNode[] child=new TrieNode[26];
    boolean end;
    public TrieNode(){
        end=false;
        for(int i=0;i<26;i++){
            child[i]=null;
        }
    }
}

class Trie {
    static TrieNode root;
    public Trie(){
        root=new TrieNode();
    }
    public void insert(String word){
        TrieNode current=root;
        for (int i = 0; i < word.length(); i++) {
            int index=word.charAt(i)-'a';
            if(current.child[index]==null){
                current.child[index]=new TrieNode();
            }
            current=current.child[index];
        }
        current.end=true;
    }

    public boolean search(String word){
        TrieNode current=root;
        for (int i = 0; i < word.length(); i++) {
            int index=word.charAt(i)-'a';
            if(current.child[index]==null){
                return false;
            }
            current=current.child[index];
        }
        return current.end;
    }
    public boolean startsWith(String prefix) {
        TrieNode current=root;
        for (int i = 0; i < prefix.length(); i++) {
            int index=prefix.charAt(i)-'a';
            if(current.child[index]==null){
                return false;
            }
            current=current.child[index];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
class TrieNode{
    TrieNode[] child=new TrieNode[26];
    boolean end;
    public TrieNode(){
        end=false;
        for(int i=0;i<26;i++){
            child[i]=null;
        }
    }
}
public class Trie{
    static TrieNode root;
    public Trie(){
        root=new TrieNode();
    }
    public void insert(String word){
        TrieNode current=root;
        for (int i = 0; i < word.length(); i++) {
            int index=word.charAt(i)-'a';
            if(current.child[index]==null){
                current.child[index]=new TrieNode();
            }
            current=current.child[index];
        }
        current.end=true;
    }

    public boolean search(String word){
        TrieNode current=root;
        for (int i = 0; i < word.length(); i++) {
            int index=word.charAt(i)-'a';
            if(current.child[index]==null){
                return false;
            }
            current=current.child[index];
        }
        return current.end;
    }
    public boolean startsWith(String prefix){
        TrieNode current=root;
        for (int i = 0; i < prefix.length(); i++) {
            int index=prefix.charAt(i)-'a';
            if(current.child[index]==null){
                return false;
            }
            current=current.child[index];
        }
        return true;
    }
    public static void main(String[] args) {
        Trie t=new Trie();
        t.insert("elite");
        t.insert("code");
        t.insert("catch");
        t.insert("cat");
        System.out.println(t.search("code"));
        System.out.println(t.search("elit"));
        System.out.println(t.search("hello"));
    }
}
