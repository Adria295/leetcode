import java.util.HashSet;
import java.util.Set;

public class Solution219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (k>=nums.length) k=(nums.length-1);
        for (int left = 0;left<nums.length-1;left++){
            for (int right = left + 1;right<nums.length&&right>left&&right<=left+k;right++){
                if (nums[left]==nums[right]) return true;
            }
        }
        return false;
    }

    public boolean containsNearbyDuplicate2(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i=0;i<nums.length;i++){
            if (i>k) {
                set.remove(nums[i-k-1]);
            }

            if (!set.add(nums[i])) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution219 solution219 = new Solution219();
        int[] test = {9,9};
        System.out.println(solution219.containsNearbyDuplicate2(test,3));
    }
}
