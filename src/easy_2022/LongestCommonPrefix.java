package easy_2022;
/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串""。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-common-prefix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String [] strs = {"flower","flow","flight"};
        new LongestCommonPrefix().longestCommonPrefix(strs);
    }
    public String longestCommonPrefix(String[] strs) {
        String result = strs[0];
        for (int i = 0; i < strs.length; i++) {
            if (strs.length == 0){
                return "";
            }
            while (!strs[i].startsWith(result)){
                result=result.substring(0,result.length()-1);
            }
        }
        return result;
    }
}
