import java.util.ArrayList;
import java.util.List;

public class Solution89 {
    public List<Integer> grayCode(int n) {
        List<Integer> ans = new ArrayList<>();
        ans.add(0);
        if (n==0) return ans;
        int first = 1;
        for (int i=0;i<n;i++){
            for (int j=ans.size()-1;j>=0;j--){
                ans.add(first+ans.get(j));
            }
            first = first<<1;
        }
        return ans;
    }
}
