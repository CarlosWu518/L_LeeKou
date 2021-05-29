package easy;

import java.util.Arrays;
import java.util.List;

/*
 * @Description:
 * @Author: CarlosWu
 * @Date: 2021/5/27 15:56
 * @Version: 0.0.1
 */
public class TwoSum {
    public static void main(String[] args) {
        int [] nums = {3,2,4};
        int target = 6;
        new TwoSum().twoSum(nums,target);
    }
    public int[] twoSum(int[] nums, int target) {
        int [] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                int sum = nums[i]+nums[j];
                if (sum == target){
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }
     return null;
    }
}
