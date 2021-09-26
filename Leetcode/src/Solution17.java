import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution17 {
    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<String>();
        if (digits.length() == 0) {
            return combinations;
        }
        Map<Character, String> phoneMap = new HashMap<Character, String>() {{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};
        backtrack(combinations, phoneMap, digits, 0, new StringBuffer());
        return combinations;
    }

    public void backtrack(List<String> combinations,Map<Character, String> phoneMap,String digits, int index, StringBuffer combination){
        int lens = digits.length();
        if (index==lens){
            combinations.add(combination.toString());
        }
        else {
            char key = digits.charAt(index);
            String s = phoneMap.get(key);
            int length = s.length();
            for (int i=0;i<length;i++){
                combination.append(s.charAt(i));
                backtrack(combinations,phoneMap,digits,index+1,combination);
                combination.deleteCharAt(index);
            }
        }
    }

    public static void main(String[] args) {
        Solution17 s17 = new Solution17();
        s17.letterCombinations("23");
    }
}
