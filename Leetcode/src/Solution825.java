import java.util.Arrays;

public class Solution825 {
    public int numFriendRequests(int[] ages) {
        int n = ages.length;
        Arrays.sort(ages);
        int left = 0; int right = 0; int ans = 0;
        for (int age : ages) {
            if (age<=14) continue;
            while (ages[left]<=0.5*age+7){
                ++left;
            }
            while (right + 1<n && ages[right+1]<=age){
                ++right;
            }
            ans += right - left;
        }
        return ans;
    }
}
