class Treenode{
    Treenode[] child;
    boolean end;
    Treenode(){
        child=new Treenode[26];
        for(int i=0;i<26;i++){
            child[i]=null;
        }
        end=false;
    }
}
class Trie {
    static Treenode root; 
    public Trie() {
        root=new Treenode();
        
    }

    
    public void insert(String word) {
        Treenode current = root;
        for( int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if(current.child[index] == null) {
                current.child[index] = new Treenode();
            }
            current = current.child[index];
        }
        current.end = true;       
    }
    
    public boolean search(String word) {
        Treenode current = root;
        for(int i=0; i<word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if(current.child[index] == null) {
                return false;
            }
            current = current.child[index];
        }
        return current.end;
       
    }
    
    public boolean startsWith(String prefix) {
        Treenode current=root;
        for(int i=0;i<prefix.length();i++){
            int index=prefix.charAt(i)-'a';
            if(current.child[index] == null) {
                return false;
            }
            current = current.child[index];
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
