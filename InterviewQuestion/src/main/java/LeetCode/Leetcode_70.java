package LeetCode;

//爬楼梯
public class Leetcode_70 {

    public static void main(String[] args) {
        int stair = 10;
        System.out.println(climbStairs(3));
    }

    public static int climbStairs(int n) {
        if(n <=2){
            return n;
        }
        int[] dp = new int[n + 1];
        //dp[i]代表到达某个楼梯有多少种方法
        dp[1] = 1;
        dp[2] = 2;


        for(int i = 3; i <= n; i ++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
