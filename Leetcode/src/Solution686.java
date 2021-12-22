public class Solution686 {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int ans = 0;
        int max = a.length() +  b.length();
        while (sb.length()<=max){
            sb.append(a);
            ans++;
            if (sb.toString().indexOf(b)!=-1) return ans;
        }
        return -1;
    }
}
