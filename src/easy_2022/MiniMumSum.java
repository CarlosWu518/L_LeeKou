package easy_2022;

import java.util.Arrays;

/*
* 给你一个四位正整数num。请你使用 num中的 数位 ，将num拆成两个新的整数new1和new2。new1 和new2中可以有前导 0，且num中 所有数位都必须使用。
比方说，给你num = 2932，你拥有的数位包括：两个2，一个9和一个3。一些可能的[new1, new2]数对为[22, 93]，[23, 92]，[223, 9] 和[2, 329] 。
请你返回可以得到的new1和 new2的 最小和。
来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
* */
public class MiniMumSum {
    public static void main(String[] args) {
        int num = 2932;
        new MiniMumSum().minimumSum(num);
    }

    public int minimumSum(int num) {
        int [] nums = new int[4];
        for (int i = 0; i < 4; i++) {
            nums[i] = num % 10;
            num = num / 10;
        }
        Arrays.sort(nums);
        int num1 = nums[0] * 10  + nums[2];
        int num2 = nums[1] * 10  + nums[3];
        return num1 + num2;
    }
}
