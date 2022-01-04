import org.junit.Test;

public class Solution1137 {
    public int tribonacci(int n) {
        if (n==0) return 0;
        if (n==1||n==2) return 1;
        if (n==3) return 2;
        int p = 0; int q = 1; int r = 1; int ans = p+q+r;
        for (int i=3;i<n;i++){
            p = q;
            q = r;
            r = ans;
            ans = p+q+r;
        }
        return ans;
    }

    @Test
    public void Test(){
        int tribonacci = tribonacci(6);
        System.out.println(tribonacci);

    }
}
