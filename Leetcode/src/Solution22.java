import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Solution22 {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        backTrace(ans,new StringBuilder(),0,0,n);
        return ans;
    }

    public void backTrace(List<String> ans,StringBuilder cur,int open,int close,int max){
        if (cur.length()==2*max){
            ans.add(cur.toString());
        }
        if (open<max){
            cur.append('(');
            backTrace(ans,cur,open+1,close,max);
            cur.delete(cur.length()-1,cur.length());
         }
        if (close<open){
            cur.append(')');
            backTrace(ans,cur,open,close+1,max);
            cur.delete(cur.length()-1,cur.length());
        }
    }

    @Test
    public void test22(){
        Solution22 solution22 = new Solution22();
        List<String> ans = solution22.generateParenthesis(3);
        for (String an : ans) {
            System.out.println(an);
        }
    }
}
