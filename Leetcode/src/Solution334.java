public class Solution334 {
    public boolean increasingTriplet2(int[] nums) {
        boolean ans = false;
        int left = 0;
        int right = left+2;
        while(left<nums.length-2){
            if (nums[left]<nums[left+1]){
                if (nums[left+1]<nums[right]){
                    return true;
                }else {
                    left += 2;
                    continue;
                }
            }
            left++;
        }
        return ans;
    }

    public boolean increasingTriplet(int[] nums) {
        int left = 0;
        int mid = left + 1;
        int right = mid + 1;
        while(left<nums.length-2&&right<nums.length){
            if (nums[left]<nums[mid]){ //5,7
                if (nums[mid]<nums[right]) return true;
                else if (nums[right]>nums[left]){ //5,7,6
                    mid = right;
                    right +=1;
                    continue;
                }else if (nums[right]<nums[left]) {
                    int i = right;//5,7,4,5,6 // 5,7,4,8,2
                    while (i<nums.length){
                        if (nums[mid]<nums[i]) return true;
                        i++;
                    }
                    left = right;
                    mid = left + 1;
                    right = mid + 1;
                    continue;
                }
                right++;
                continue;
            }else {
                left = mid;
                mid +=1;
                right = mid +1;
                continue;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution334 solution334 = new Solution334();
        int[] nums = {1,2,2,1};
        boolean b = solution334.increasingTriplet(nums);
        System.out.println(b);
    }
}
