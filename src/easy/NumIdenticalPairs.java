package easy;

/**
 * @Description： 给你一个整数数组 nums 。如果一组数字 (i,j) 满足 nums[i] == nums[j] 且 i < j ，就可以认为这是一组 好数对 。返回好数对的数目。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/number-of-good-pairs
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author： CarlosWu
 * @date： 2020/7/22 15:33
 */
public class NumIdenticalPairs {
    public static void main(String[] args) {
    int nums [] = {1,2,3};
    new NumIdenticalPairs().numIdenticalPairs(nums);
    }
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (i<j && nums[i] == nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
