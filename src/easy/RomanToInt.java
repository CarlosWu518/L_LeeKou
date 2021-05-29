package easy;

import java.util.Random;

/*
 * @Description:
 * @Author: CarlosWu
 * @Date: 2021/5/28 18:54
 * @Version: 0.0.1
 */
public class RomanToInt {
    public static void main(String[] args) {
            String s = "MCMXCIV";
            new RomanToInt().romanToInt(s);
    }
    public int romanToInt(String s) {
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c){
                case 'I':
                    num+=1;
                    break;
                case 'V':
                    num+=5;
                    break;
                case 'X':
                    num+=10;
                    break;
                case 'L':
                    num+=50;
                    break;
                case 'C':
                    num+=100;
                    break;
                case 'D':
                    num+=500;
                    break;
                case 'M':
                    num+=1000;
                    break;
            }
            if (i > 0){
                if ( s.charAt(i-1) == 'I' && (c == 'V'|| c == 'X')){
                    num -= 2;
                }else if(s.charAt(i-1) == 'X' && (c == 'C'|| c == 'L')){
                    num -= 20;
                }else if(s.charAt(i-1) == 'C' && (c == 'D'|| c == 'M')){
                    num -= 200;
                }
            }
        }
        System.out.println(num);
        return num;
    }
}
