import java.util.ArrayList;
import java.util.List;

public class Solution507 {
    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        List<Integer> list = posMember(num);
        for (Integer integer : list) {
            sum += integer;
        }
        return sum==num;
    }

    public List<Integer> posMember(int num){
        List<Integer> posMemList = new ArrayList<>();
        if (num!=1) posMemList.add(1);
        for (int i=2;i<Math.sqrt(num);i++){
            if (num%i==0){
                posMemList.add(i);
                posMemList.add(num/i);
            }
        }
        return posMemList;
    }

    public static void main(String[] args) {
        Solution507 solution507 = new Solution507();
        List<Integer> list = solution507.posMember(1);
        System.out.println(solution507.checkPerfectNumber(1));
    }
}
