public class Solution318 {
    public int maxProduct(String[] words) {
        int n = words.length, idx = 0;
        int[] masks = new int[n];
        for (String w : words) {
            int t = 0;
            for (int i = 0; i < w.length(); i++) {
                int u = w.charAt(i) - 'a';
                t |= (1 << u);
            }
            masks[idx++] = t;
        }
        return 0;
    }

    public static void main(String[] args) {
        Solution318 solution318 = new Solution318();
        String[] words = {"bbb","abc"};
        solution318.maxProduct(words);
    }
}
