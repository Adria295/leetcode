import org.junit.Test;

public class Solution1629 {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        char ans = keysPressed.charAt(0);
        int record = releaseTimes[0];
        for (int i=1;i<releaseTimes.length;i++){
            int tempRec = releaseTimes[i]-releaseTimes[i-1];
            if (tempRec>record){
                record = tempRec;
                ans = keysPressed.charAt(i);
            }
            if (tempRec==record){
                if (keysPressed.charAt(i)-ans>0){
                    ans = keysPressed.charAt(i);
                }
            }
        }
        return ans;
    }

    @Test
    public void Test(){
        int[] a = {9};
        String k = "c";
        char c = slowestKey(a, k);
        System.out.println(c);
    }
}
