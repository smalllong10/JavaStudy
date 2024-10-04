package LeetCode;

public class Leetcode_343 {
    public int integerBreak(int n) {

        //dp含义: dp[i]为i可拆分成的数的最大乘积
        int[] dp = new int[n];
        //初始化
        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 1;
        //递推公式
        //第一个循环：从3开始慢慢往上拆，一直保留拆完最大的数字
        for (int i = 3; i <= n; i++) {
            //第二个循环：拆分的方法是从1开始一个一个减少
            for (int j = 1; j < i - j; j++) {
                //dp[i]是拆完后的最大乘积
                //j * dp[i-j]是拆成三个和三个以上
                //j * (i-j) 是拆成两个
                dp[i] = Math.max(dp[i], Math.max(j * dp[i - j], j * (i - j)));
            }
        }
        return dp[n];
    }
}
