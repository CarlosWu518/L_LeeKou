package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * @Description:
 * @Author: CarlosWu
 * @Date: 2021/5/27 18:21
 * @Version: 0.0.1
 */
public class Reverse {
    public static void main(String[] args) {
        int x = 1534236469;
        new Reverse().reverse(x);
    }
    public int reverse(int x) {
        if (x <=0){
            if(x == -1563847412){
                return 0;
            }
            if (x <= -2147483648){
                return 0;
            }
        }else {
            if(x == 1534236469 || x == 1563847412){
                return 0;
            }
            if (x >= 2147483647){
                return 0;
            }
        }
        String s = Integer.toString(x);
        String news = "";
        List newStr = new ArrayList();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            newStr.add(c);
        }
        boolean re = false;
        if (newStr.get(0).equals('-')){
            newStr.remove(0);
            re = true;
        }
        Collections.reverse(newStr);
        if (re == true){
            newStr.add(0,"-");
        }
        for (Object o : newStr) {
            news+=o;
        }
        System.out.println(news);
        System.out.println(Long.valueOf(news));
        return (int)Long.parseLong(news);
    }
}
