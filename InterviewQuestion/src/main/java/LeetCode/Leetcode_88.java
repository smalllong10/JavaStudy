package LeetCode;

public class Leetcode_88 {
        public void merge(int[] nums1, int m, int[] nums2, int n) {

            //错误死路1：想不到怎么一个一个替换，不如反过来从后往前
            //错误死路2：这道题的本质是把第二个array并到第一个array当中，所以只需要循环到第二个array为空位置
//            int slow = 0;
//            for(int i =0; i < m+n ; i++){
//               int temp = 0;
//               if(nums1[i] <= nums2[i]){
//                   nums1[i] = nums1[slow];
//                   slow++;
//               }else {
//                   temp = nums1[i];
//                   nums1[i] = nums2[slow];
//                   slow++;
//
//               }
//

            int i = m-1;
            int j = n-1;
            int totalElement = m+n-1;
            while(j >=0){
                if(i >=0 &&nums1[i] > nums2[j]){
                    nums1[totalElement] = nums1[i];
                    totalElement --;
                    i--;
                }else{
                   nums1[totalElement]  = nums2[j];
                   totalElement--;
                   j--;
                }

            }
        }
}
