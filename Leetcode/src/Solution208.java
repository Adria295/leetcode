public class Solution208 {
    private Solution208[] children;
    private boolean isEnd;

    public Solution208() {
        children = new Solution208[26];
        isEnd = false;
    }

    public void insert(String word) {
        Solution208 node = this;
        for (int i=0;i<word.length();i++){
            char c = word.charAt(i);
            int index = c - 'a';
            if (node.children[index]==null){
                node.children[index] = new Solution208();
            }
            node = node.children[index];
        }
        node.isEnd = true;
    }

    public boolean search(String word) {
        Solution208 node = searchPrefix(word);
        return node!=null && node.isEnd == true;
    }

    public boolean startsWith(String prefix) {
        Solution208 node = searchPrefix(prefix);
        return node!=null;
    }

    private Solution208 searchPrefix(String prefix){
        Solution208 node = this;
        for (int i=0;i<prefix.length();i++){
            char c = prefix.charAt(i);
            int index = c - 'a';
            if (node.children[index]==null) return null;
            else {
                node = node.children[index];
            }
        }
        return node;
    }
}
