package easy;

/*
 * @Description: 给你一个数组 nums ，数组中有 2n 个元素，按 [x1,x2,...,xn,y1,y2,...,yn] 的格式排列。
    请你将数组按 [x1,y1,x2,y2,...,xn,yn] 格式重新排列，返回重排后的数组。
    来源：力扣（LeetCode）
    链接：https://leetcode-cn.com/problems/shuffle-the-array
    著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author: CarlosWu
 * @Date: 2020/8/6 9:41
 * @Version: 0.0.1
 */
public class Shuffle {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,3,2,1};
        int n = 4;
        new Shuffle().shuffle(nums,n);
    }
    public int[] shuffle(int[] nums, int n) {
        int[] NewNums = new int[nums.length];
        int count = n-2;
        for (int i = 0; i < nums.length;i++) {
           if(i==0){
               NewNums[i]=nums[i];
               i++;
               NewNums[i]=nums[i+(n-1)];
           }else {
               NewNums[i]+=nums[i/2];
               i++;
               NewNums[i]+=nums[i+count];
               count--;
           }
        }
        return NewNums;
    }
}
