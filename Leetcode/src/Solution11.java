public class Solution11 {
    public static int maxArea(int[] height) {
        int maxArea = 0;
        int temp;
        for (int i=0;i<height.length;i++){
            for(int j=i+1;j<height.length;j++){
                temp = (j-i) * Math.min(height[i],height[j]);
                maxArea = Math.max(temp,maxArea);
            }
        }
        return maxArea;
    }

    public static int maxArea2(int[] height) { //双指针
        int maxArea = 0;
        int i = 0;
        int j = height.length-1;
        while (i<j){
            maxArea = height[i]<=height[j] ?
            Math.max(maxArea,(j-i) * Math.min(height[i++],height[j])):
            Math.max(maxArea,(j-i) * Math.min(height[i],height[j--]));
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] test = {2,3,4,5,18,17,6};
        System.out.println(maxArea2(test));
    }
}
