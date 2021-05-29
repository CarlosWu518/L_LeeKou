package easy;

/*
 * @Description:
 * @Author: CarlosWu
 * @Date: 2021/5/28 18:28
 * @Version: 0.0.1
 */
public class IsPalindrome {
    public static void main(String[] args) {
        int x = 121;
        new IsPalindrome().isPalindrome(x);
    }
    public boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }
        String strX = String.valueOf(x);
        StringBuilder sb =new StringBuilder();
        String newSb = sb.append(strX).reverse().toString();
        if (strX.equals(newSb)){
            return true;
        }
        return false;
    }
}
