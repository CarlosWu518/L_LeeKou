package easy;

import java.util.Arrays;

/*
 * @Description: 难度简单7收藏分享切换为英文关注反馈给你一个整数数组 salary ，数组里每个数都是 唯一 的，其中 salary[i] 是第 i 个员工的工资。
    请你返回去掉最低工资和最高工资以后，剩下员工工资的平均值。
    来源：力扣（LeetCode）
    链接：https://leetcode-cn.com/problems/average-salary-excluding-the-minimum-and-maximum-salary
    著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author: CarlosWu
 * @Date: 2020/8/6 16:27
 * @Version: 0.0.1
 */
public class Average {
    public static void main(String[] args) {
    int[] salary = {4000,3000,1000,2000};
    new Average().average(salary);
    }
    public double average(int[] salary) {
        Arrays.sort(salary);
        int count=0;
        for (int i = 0; i < salary.length; i++) {
            if (i!=0&&i!=salary.length-1){
               count+=salary[i];
            }
        }
        double averageSalary = count/(salary.length-2);
        return averageSalary;
    }
}
