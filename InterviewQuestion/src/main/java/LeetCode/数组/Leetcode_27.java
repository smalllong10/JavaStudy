package LeetCode.数组;

public class Leetcode_27 {
    //双指针算法
   public int removeElement(int[] nums, int val){
       int slowIndex =0;
       for(int fastIndex = 0; fastIndex < nums.length; fastIndex++){
            if(nums[fastIndex] != val)  {
                nums[slowIndex] = nums[fastIndex];
                slowIndex++;
            }

       }

       return slowIndex;
   }

   public int removeElement1(int[] nums, int val){
       int left = 0;
       int right = nums.length-1;
       while(right >=0 && nums[right] == val) right --;
       while(left <= right){
           if(nums[left] == val){
               nums[left] = nums[right];
               right --;
           }
           left ++;
           while(right >= 0 && nums[right] == val) right--;
       }
       return left;
   }
}
