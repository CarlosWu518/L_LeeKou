package easy_2022;

import java.util.Stack;

public class IsValid {
    public static void main(String[] args) {
        String s = "()";
        new IsValid().isValid(s);
    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c){
                case '{':
                    stack.push(c);
                    break;
                case '}':
                    if (stack.isEmpty()||!stack.pop().equals('{'))return false;
                    break;
                case '(':
                    stack.push(c);
                    break;
                case ')':
                    if (stack.isEmpty()||!stack.pop().equals('('))return false;
                    break;
                case '[':
                    stack.push(c);
                    break;
                case ']':
                    if (stack.isEmpty()||!stack.pop().equals('[')) return false;
                    break;
            }
        }
        if (stack.isEmpty() ){
            return true;
        }else{
            return false;
        }
    }
}
