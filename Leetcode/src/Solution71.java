import org.junit.Test;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solution71 {
    public String simplifyPath(String path) {
        Deque<String> d = new ArrayDeque<>();
        int n = path.length();
        for (int i = 1; i < n;i++) {
            if (path.charAt(i) == '/') continue;
            int j = i + 1;
            while (j < n && path.charAt(j) != '/') j++;
            String item = path.substring(i, j);
            if (item.equals("..")) {
                if (!d.isEmpty()) d.pollLast();
            } else if (!item.equals(".")) {
                d.addLast(item);
            }
            i = j;
        }
        StringBuilder ans = new StringBuilder();
        while (!d.isEmpty()) ans.append("/" + d.pollFirst());
        return ans.length() == 0 ? "/" : ans.toString();
        }

    @Test
    public void Test(){
        String test = "/a";
        String s = simplifyPath(test);
        System.out.println(s);
    }
}

