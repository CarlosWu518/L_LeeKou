package easy_2022;
/**
 * 给你三个整数数组 nums1、nums2 和 nums3 ，请你构造并返回一个 与这三个数组都不同的 数组，且由 至少 在 两个 数组中出现的所有值组成。数组中的元素可以按 任意 顺序排
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-out-of-three
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoOutOfThree {
    public static void main(String[] args) {
        int[] nums1 = {1,1,3,2};
        int[] nums2 = {2,3};
        int[] nums3 = {3};
        new TwoOutOfThree().twoOutOfThree(nums1, nums2, nums3);
    }
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
//        HashSet<Integer> Res = new HashSet<>();
//        for (int i = 0; i < nums1.length; i++) {
//            for (int j = 0; j < nums2.length; j++) {
//                if (nums1[i] == nums2[j]){
//                    Res.add(nums1[i]);
//                }
//            }
//        }
//        for (int i = 0; i < nums2.length; i++) {
//            for (int j = 0; j < nums3.length; j++) {
//                if (nums2[i] == nums3[j]){
//                    Res.add(nums2[i]);
//                }
//            }
//        }
//        for (int i = 0; i < nums1.length; i++) {
//            for (int j = 0; j < nums3.length; j++) {
//                if (nums1[i] == nums3[j]){
//                    Res.add(nums1[i]);
//                }
//            }
//        }
//        List<Integer> NewRes = new ArrayList<>(Res);
//        System.out.println(NewRes);
//        return NewRes;
        Set<Integer> qc = new HashSet<>();
        Set<Integer> qc1 = new HashSet<>();
        Set<Integer> qc2 = new HashSet<>();
        ArrayList<Integer> cfres = new ArrayList<>();
        for (int i : nums1) {
            qc.add(i);
        }
        cfres.addAll(qc);

        for (int i : nums2) {
            qc1.add(i);
        }
        cfres.addAll(qc1);

        for (int i : nums3) {
            qc2.add(i);
        }
        cfres.addAll(qc2);

        for (int i = 0; i < cfres.size(); i++) {
            for (int j = 0; j < cfres.size(); j++) {
                if (i != j){
                    if (cfres.get(i) == cfres.get(j)){
                        qc.add(cfres.get(i));
                    }
                }
            }
        }
        ArrayList<Integer> res = new ArrayList<>(qc);
        return res;
    }
}
