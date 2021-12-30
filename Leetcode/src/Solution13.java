public class Solution13 {
    public int romanToInt(String s) {
        int n = s.length();
        int ans = 0;
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            switch (c){
                case 'I':
                    if ((i+1)<n&&'V'==s.charAt(i+1)) {
                        ans += 4;
                        i++;
                        continue;
                    }
                    if ((i+1)<n&&'X'==s.charAt(i+1)) {
                        ans += 9;
                        i++;
                        continue;
                    }
                    else ans +=1;
                    continue;
                case 'V':
                    ans += 5;
                    continue;
                case 'X':
                    if ((i+1)<n()&&'L'==s.charAt(i+1)) {
                        ans += 40;
                        i++;
                        continue;
                    }
                    if ((i+1)<n&&'C'==s.charAt(i+1)) {
                        ans+=90;
                        i++;
                        continue;
                    }
                    else ans +=10;
                    continue;
                case 'L':
                    ans += 50;
                    continue;
                case 'C':
                    if ((i+1)<n&&'D'==s.charAt(i+1)){
                        ans+=400;
                        i++;
                        continue;
                    }
                    if ((i+1)<n&&'M'==s.charAt(i+1)) {
                        ans+=900;
                        i++;
                        continue;
                    }
                    else ans +=100;
                    continue;
                case 'D':
                    ans += 500;
                    continue;
                case 'M':
                    ans += 1000;
                    continue;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution13 solution13 = new Solution13();
        System.out.println(solution13.romanToInt("MCDLXXVI"));
    }
}
