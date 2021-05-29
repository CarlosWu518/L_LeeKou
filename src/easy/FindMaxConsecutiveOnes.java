package easy;

/*
 * @Description:
 * @Author: CarlosWu
 * @Date: 2020/8/11 15:09
 * @Version: 0.0.1
 */
public class FindMaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1};
        new FindMaxConsecutiveOnes().findMaxConsecutiveOnes(nums);
    }
    public int findMaxConsecutiveOnes(int[] nums) {
        int number = nums[0];
        int count = 0;
        int count1 = 0;
        if (nums.length==1){
            count=1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (number!=nums[i]){
                number = nums[i];
                if (count1>count){
                    count=count1;
                    count1=1;
                }
            }else {
                count1++;
            }
        }
    return count;
    }
}

