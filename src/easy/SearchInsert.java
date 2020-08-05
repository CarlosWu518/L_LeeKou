package easy;

import javax.swing.text.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @Description: 难度简单628收藏分享切换为英文关注反馈给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
    你可以假设数组中无重复元素。
    来源：力扣（LeetCode）
    链接：https://leetcode-cn.com/problems/search-insert-position
    著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author: CarlosWu
 * @Date: 2020/8/5 10:16
 * @Version: 0.0.1
 */
public class SearchInsert {
    public static void main(String[] args) {
        int [] nums = {1,3,5,6};
        int target = 5;
        new SearchInsert().searchInsert(nums,target);
    }
    public int searchInsert(int[] nums, int target) {
        List list = new ArrayList();
        list.add(target);
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        Integer[] r = (Integer[]) list.toArray(new Integer[list.size()]);
        Arrays.sort(r);
        for (int i = 0; i < r.length; i++) {
            if (target == r[i]){
                return i;
            }
        }
        return 0;
    }
}
