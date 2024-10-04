package LeetCode;

public class Leetcode_746 {

    public static void main(String[] args) {
        int[] cost1 = new int[3];
        cost1[0] = 10;
        cost1[1] = 15;
        cost1[2] = 20;
        int[] cost2 = new int[10];
        cost2[0] = 1;
        cost2[1] = 100;
        cost2[2] = 1;
        cost2[3] = 1;
        cost2[4] = 1;
        cost2[5] = 100;
        cost2[6] = 1;
        cost2[7] = 1;
        cost2[8] = 100;
        cost2[9] = 1;

        int minCost = minCostClimbingStairs(cost1);
        System.out.println(minCost);



    }

    public static int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length+1];
        dp[0] = 0;
        dp[1] = 0;

        for(int i =2; i<= cost.length; i++){
            dp[i] = Math.min(dp[i-1] + cost[i-1], dp[i-2] + cost[i-2]);
        }
        for (int minCost:dp) {
            System.out.println(minCost);
        }
        return dp[cost.length];
    }
}
