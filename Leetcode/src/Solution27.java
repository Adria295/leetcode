public class Solution27 {
    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        if (length==0) return 0;

        int fast=0;
        int slow=0;

        while (fast<length){
            if (nums[fast]!=val) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }

        return slow;
    }

    public static void main(String[] args) {
        int[] nums = {2};
        Solution27 solution27 = new Solution27();
        System.out.println(solution27.removeElement(nums,3));
    }
}
