public class Solition326 {
    public  boolean isPowerOfThree(int n) {


        if (n==1){
            return true;
        }

        if (n!=0&&n % 3==0){
            return isPowerOfThree(n/3);
        }

        return false;
    }

    public static void main(String[] args) {
        Solition326 s = new Solition326();
        System.out.println(s.isPowerOfThree(27));
    }
}
