import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution472 {

    Trie trie = new Trie();

    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        List<String> ans = new ArrayList<String>();
        Arrays.sort(words, (a, b) -> a.length() - b.length());
        for (String word : words) {
            if (word.length() == 0) {
                continue;
            }
            if (dfs(word, 0)) {
                ans.add(word);
            } else {
                insert(word);
            }
        }
        return ans;
    }

    class Trie{
        private Trie[] children;
        private boolean isEnd;

        public Trie(){
            children = new Trie[26];
            isEnd = false;
        }
    }

    public boolean dfs(String word, int start){
        Trie node = trie;
        if (start==word.length()) return true;
        for (int i=start;i<word.length();i++){
            char ch = word.charAt(i);
            int index = ch - 'a';
            node = node.children[index];
            if (node==null) return false;
            if (node.isEnd){
                if (dfs(word,i+1)){
                    return true;
                }
            }
        }
        return false;
    }

    public void insert(String word) {
        Trie node = trie;
        for (int i=0;i<word.length();i++){
            char c = word.charAt(i);
            int index = c - 'a';
            if (node.children[index]==null){
                node.children[index] = new Trie();
            }
            node = node.children[index];
        }
        node.isEnd = true;
    }

    public static void main(String[] args) {
        Solution472 solution472 = new Solution472();
        String[] test = {"cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat"};
        solution472.findAllConcatenatedWordsInADict(test);
    }
}
