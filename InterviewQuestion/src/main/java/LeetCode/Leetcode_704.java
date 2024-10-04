package LeetCode;

public class Leetcode_704 {
    public int search(int[] nums, int target){
        // 避免当 target 小于nums[0]或大于nums[nums.length-1]时的多次运算
        if(target < nums[0] || target > nums[nums.length -1]){
            return -1;
        }
        //左闭右闭
        int left = 0, right = nums.length -1;
        //因为是右闭 所以要等于
        while(left <= right){
            int mid = left + ((right - left) / 2);
            if (nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                left = mid +1;
            }
            else{
                right = mid -1;
            }
        }
        return -1;
    }
}
