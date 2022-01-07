import org.junit.Test;

import java.util.Stack;

public class Solution1614 {
    public int maxDepth(String s) {
        int ans = 0;
        int tempCount =0;
        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if (ch=='('){
                tempCount++;
                ans = Math.max(ans,tempCount);
            }
            if (ch==')'){
                tempCount--;
            }
        }
        return ans;
    }

    @Test
    public void Test(){
        int i = maxDepth("8*((1*(5+6))*(8/6))");
        System.out.println(i);
    }
}
