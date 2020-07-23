package easy;

import java.util.Arrays;

/**
 * @Description： 给你一个数字数组 arr 。
 * 如果一个数列中，任意相邻两项的差总等于同一个常数，那么这个数列就称为 等差数列 。
 * 如果可以重新排列数组形成等差数列，请返回 true ；否则，返回 false 。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/can-make-arithmetic-progression-from-sequence
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author： CarlosWu
 * @date： 2020/7/22 15:46
 */
public class CanMakeArithmeticProgression {
    public static void main(String[] args) {
        int [] arr = {1,3,5};
        new CanMakeArithmeticProgression().canMakeArithmeticProgression(arr);
    }
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int number = arr[0]-arr[1];
       for (int i = 1; i < arr.length; i++) {
           if ((i+1)>arr.length-1){
               break;
           }
            for (int j = i+1; j < arr.length;j++) {
                if ((arr[i]-arr[j])==number){
                    break;
                }else {
                    return false;
                }
            }
        }
        return true;
    }
}

