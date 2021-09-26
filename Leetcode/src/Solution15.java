import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int lens = nums.length;
        if (nums==null||lens<3) return ans;
        Arrays.sort(nums);
        for (int i=0;i<lens;i++){
            if (nums[i]>0) break;
            while (i>0&&nums[i]==nums[i-1]) i++;
            int L=i+1;
            int R=lens-1;
            while (L<R){
                int sum = nums[i]+nums[L]+nums[R];
                if (sum==0){
                    ans.add(Arrays.asList(nums[i],nums[L],nums[R]));
                    while(L<R&&nums[L]==nums[L+1]) L++;
                    while(L<R&&nums[R]==nums[R-1]) R--;
                    L++;
                    R--;
                }
                else if (sum<0) L++;
                else R--;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};
        Solution15 s = new Solution15();
        s.threeSum(nums);

    }
}
