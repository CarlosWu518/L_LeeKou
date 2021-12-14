package easy_2022;
/**
 *给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 *如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-integer
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * */
public class Reverse {
    public static void main(String[] args) {
        int x = 1534236469;
        new Reverse().reverse(x);
    }
    public int reverse(int x) {
        String str = "";
        if (x >= Integer.MAX_VALUE && x <= Integer.MIN_VALUE || x == 0){
            return 0;
        }
        StringBuffer sb = new StringBuffer();
        if (x < 0){
            str = sb.append(x).reverse().substring(0,sb.length()-1);
            long result = Long.valueOf(str);
            if((0-result)<= Integer.MIN_VALUE){
                return 0;
            }
            return (int)(0-result);
        }else{
            str = sb.append(x).reverse().toString();
            long result = Long.valueOf(str);
            if(result >= Integer.MAX_VALUE){
                return 0;
            }
            return (int)result;
        }
    }

}
