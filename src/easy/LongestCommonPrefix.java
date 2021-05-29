package easy;

/*
 * @Description:
 * @Author: CarlosWu
 * @Date: 2021/5/29 9:48
 * @Version: 0.0.1
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
     String[] strs = {"ab","ab","ab","ab"};
     new LongestCommonPrefix().longestCommonPrefix(strs);
    }
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1){
            return strs[0];
        }
        String str = "";
        String FStr = "";
        int count = 0;
        for (int i = 0; i < strs[0].length(); i++) {
            str += strs[0].charAt(i);
            if (count < strs.length-1){
                count += 1;
            }else {
                continue;
            }
            if (strs[count].length() <= i){
                return FStr;
            }
            for (int j = i; j < strs[count].length();) {
                char c = strs[count].charAt(j);
                String s = String.valueOf(c);
                if (str.equals(s)){
                    if (count < strs.length-1){
                        count+=1;
                    }else {
                        count = 0;
                        str = "";
                        FStr += strs[count].charAt(j);
                        break;
                    }
                    continue;
                }else {
                    if (str.equals("")){
                        return "";
                    }else {
                        return FStr;
                    }
                }
            }
        }
        return FStr;
    }
}
