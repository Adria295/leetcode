public class Solution33 {
    public int search(int[] nums, int target) {
        int n = nums.length;
        if (n==0) return -1;
        if (n==1) return nums[0]==target?0:-1;
        int l = 0;
        int r = n-1;
        while (l<=r){
            int mid = (l+r)/2;
            if (nums[mid]==target) return mid;
            if (nums[l]<nums[mid]){
                if (nums[l]<=target&&target<=nums[mid]){
                    r = mid - 1;
                }else {
                    l = mid + 1;
                }
            }
            else{
                if (nums[mid]<=target&&target<=nums[r]){
                    l = mid + 1;
                }else {
                    r = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] test = {3,1};
        Solution33 solution33 = new Solution33();
        int search = solution33.search(test, 1);
    }
}