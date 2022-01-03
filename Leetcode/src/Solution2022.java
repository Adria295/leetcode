import org.junit.Test;

public class Solution2022 {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] ans = new int[m][n];
        int k=0;

        if (original.length!=(m*n)) return new int[0][];

        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                ans[i][j] = original[k++];
            }
        }
        return ans;
    }

    @Test
    public void Test(){
        int [] original = {1,2};
        int[][] ints = construct2DArray(original, 1, 0);
    }
}
