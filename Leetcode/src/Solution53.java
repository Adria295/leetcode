public class Solution53 {
    public int maxSubArray(int[] nums) {

        boolean allNeg = true;
        int negAns = Integer.MIN_VALUE;
        int ans= 0;
        for (int i=0;i<nums.length;i++){
            int temp = 0;
            if (nums[i]<0) {
                negAns = Math.max(negAns,nums[i]);
                continue;
            }
            allNeg = false;
            for (int j=i;j<nums.length;j++){
                temp += nums[j];
                if (j+1==nums.length||nums[j+1]<=0){
                    ans = Math.max(ans,temp);
                }
            }
        }
        if (allNeg) {
            return negAns;
        }else {
            return ans;
        }
    }


    public int maxSubArray1(int[] nums) {
        int ans = nums[0];
        int pre = 0;
        for (int num : nums) {
            pre = Math.max(pre+num,num);
            ans = Math.max(ans,pre);
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution53 solution53 = new Solution53();
        int[] test = {-2,-1,4};
        int s = solution53.maxSubArray(test);
        System.out.println(s);
    }
}
