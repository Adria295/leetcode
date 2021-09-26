import org.junit.Test;

public class Solution371 {
    public int getSum(int a, int b) {
        while (b!=0){
            int carry = (a&b) << 1;
            a = a^b;
            b = carry;
        }
        return a;
    }

    @Test
    public void test371(){
        System.out.println(getSum(3,5));
    }
}
