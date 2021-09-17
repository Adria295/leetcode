public class Solution5 {
    public static String longestPalindrome(String s) {

        if (s == null || s.length() == 0) {
            return "";
        }
        int max = 1;
        int maxALL = 0;
        int maxStart = 0;
        int i;
        int left;
        int right;
        for (i=0;i<s.length();i++){
            left=i-1;
            right=i+1;
            while (left>=0&&s.charAt(left)==s.charAt(i)){ //中心扩散法，分别向左，右，左右一起扩散。
                max++;
                left--;
            }
            while (right<s.length()&&s.charAt(right)==s.charAt(i)){
                max++;
                right++;
            }
            while (left>=0&&right<s.length()&&s.charAt(right)==s.charAt(left)){
                max += 2;
                right++;
                left--;
            }

            if (max>maxALL){
                maxALL = max;
                maxStart=left;
            }
            max = 1;
        }
        return s.substring(maxStart+1,maxStart+maxALL+1);
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("bab"));
    }
}
