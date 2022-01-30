import com.sun.jmx.remote.internal.ArrayQueue;
import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Solution1765 {
    public int[][] highestPeak(int[][] isWater) {
        int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};

        int m = isWater.length;
        int n = isWater[0].length;
        int[][]ans = new int[m][n];

        Queue<int[]> queue = new ArrayDeque<>();
        for (int i=0;i<m;i++){
            Arrays.fill(ans[i],-1);
            for(int j=0;j<n;j++){
                if (isWater[i][j]==1){
                    ans[i][j]=0;
                    queue.offer(new int[]{i,j});
                }
            }
        }

        while (!queue.isEmpty()){
            int[] p = queue.poll();
            for (int[] dir : dirs) {
                int x = p[0] + dir[0];
                int y = p[1] = dir[1];
                if (0<=x&&0<=y&&x<m&&y<n&&ans[x][y]==-1){
                    ans[x][y] = ans[p[0]][p[1]] + 1;
                    queue.offer(new int[]{x,y});
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] isWater = {{0,1},{0,0}};
        Solution1765 solution1765 = new Solution1765();
        int[][] ints = solution1765.highestPeak(isWater);
        int x = 0;
        int y = 0;
        x = y = 4;
    }
}
