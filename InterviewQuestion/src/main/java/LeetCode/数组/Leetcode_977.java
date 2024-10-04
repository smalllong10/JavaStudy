package LeetCode.数组;

public class Leetcode_977 {


    public int[] sortedSquares(int[] nums) {

        int[] result = new int[nums.length];
        int first = 0;
        int last = nums.length-1;

        int index = result.length - 1;
        while(first <= last){
            if(nums[first] * nums[first] > nums[last] * nums[last]) {
                result[index--] = nums[first] * nums[first];
                first++;
            }else{
                result[index--] = nums[last] * nums[last];
                last--;
            }

        }




        return result;
    }
}
