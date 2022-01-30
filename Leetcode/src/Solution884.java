import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Solution884 {
    public String[] uncommonFromSentences(String s1, String s2) {

        ArrayList<String> ans = new ArrayList<>();
        Map<String,Integer> map1 = new HashMap<>();
        Map<String,Integer> map2 = new HashMap<>();
        String[] split1 = s1.split(" ");
        String[] split2 = s2.split(" ");
        for (String s : split1) {
            if (map1.containsKey(s)) {
                map1.put(s,map1.get(s)+1);
            }
            else map1.put(s,1);
        }
        for (String s : split2) {
            if (map2.containsKey(s)) {
                map2.put(s,map2.get(s)+1);
            }
            else map2.put(s,1);
        }
        for (Map.Entry<String,Integer> entry: map1.entrySet()){
            if (entry.getValue()==1&&!map2.containsKey(entry.getKey())){
                ans.add(entry.getKey());
            }
        }
        for (Map.Entry<String,Integer> entry: map2.entrySet()){
            if (entry.getValue()==1&&!map1.containsKey(entry.getKey())){
                ans.add(entry.getKey());
            }
        }
        return ans.toArray(new String[ans.size()]);
    }

    public static void main(String[] args) {
        String s1 = "APPLE APPLE";
        String s2 = "BANANA";
        Solution884 solution884 = new Solution884();
        solution884.uncommonFromSentences(s1,s2);
    }
}
