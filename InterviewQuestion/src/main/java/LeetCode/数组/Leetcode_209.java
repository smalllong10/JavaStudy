package LeetCode.数组;

public class Leetcode_209 {
    public static void main(String[] args) {
        int[] test = {2, 3, 1, 2, 4, 3};
        int result = minSubArrayLen(7, test);
        System.out.println(result);

    }

    public static int minSubArrayLen(int target, int[] nums){
        int minSize = Integer.MAX_VALUE;
        int slow = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while(sum >= target){
                minSize = Math.min(minSize, i - slow +1);
                sum -= nums[slow];
                slow++;
            }
        }
        return minSize == Integer.MAX_VALUE? 0 : minSize;
    }
}
