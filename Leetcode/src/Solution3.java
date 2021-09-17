import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution3 {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        char[] chars = s.toCharArray();
        int max = 0;
        for (int i=0;i<chars.length;i++){
            for (int j=i;j<chars.length;j++){
                if (!set.contains(chars[j])){
                    set.add(chars[j]);
                    continue;
                }
                max = max > set.size() ? max : set.size();
                set.clear();
                break;
            }
            max = max > set.size() ? max : set.size();
        }
        return max;
    }

    public static int lengthOfLongestSubstring2(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int end = 0, start = 0; end < n; end++) { //滑动窗口遍历end，在循环中调整start
            char alpha = s.charAt(end);
            if (map.containsKey(alpha)) {
                start = Math.max(map.get(alpha), start);
            }
            ans = Math.max(ans, end - start + 1);
            map.put(s.charAt(end), end + 1); //更新相同的字符的最后出现位置，+1是指从它本身的下一位开始不再重复。
        }
        return ans;
    }

    public static void main(String[] args) {
        String s="pwwkew";
        System.out.println(lengthOfLongestSubstring2(s));
    }
}
