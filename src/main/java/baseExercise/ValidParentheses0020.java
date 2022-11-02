package baseExercise;

import java.util.Stack;

/**
 * @author : Jason.ma
 * @date : 2022/11/2 16:09
 */
public class ValidParentheses0020 {
    public boolean isValid(String s) {
        boolean result = true;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char charAt = s.charAt(i);
            char matchParentheses = getMatchParentheses(charAt);
            if (matchParentheses == ' '){
                stack.push(charAt);
            } else {
                if (stack.empty()){
                    result = false;
                    break;
                }
                Character pop = stack.pop();
                if (pop != matchParentheses){
                    result = false;
                    break;
                }
            }
        }
        if (stack.size() != 0){
            result = false;
        }
        return result;
    }

    public char getMatchParentheses(char ch){
        switch (ch){
            case ')':
                return '(';
            case '}':
                return '{';
            case ']':
                return '[';
            default:
                return ' ';
        }
    }

    public static void main(String[] args) {
        ValidParentheses0020 validParentheses0020 = new ValidParentheses0020();
        System.out.println(validParentheses0020.isValid("()"));
        System.out.println(validParentheses0020.isValid("()[]{}"));
        System.out.println(validParentheses0020.isValid("(]"));
        System.out.println(validParentheses0020.isValid("("));
        System.out.println(validParentheses0020.isValid("]"));
    }
}
