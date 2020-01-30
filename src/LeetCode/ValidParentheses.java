package LeetCode;

import java.util.Stack;

public class ValidParentheses {


    public boolean isValid(String s){

        if(s.length() == 0 ){
            System.out.println("true");
            return true;
        }
        if(s.length()%2 != 0){
            System.out.println("false");
            return false;
        }
        Stack<Character> result = new Stack<Character>();
        for(int x = 0; x < s.length(); x ++){
            char y = s.charAt(x);
            if(y == '(' || y == '{' || y == '['){
                result.push(y);
            }else if( y == ')' && result.peek() == '(' && !result.isEmpty()){
                result.pop();
            }else if( y == ']' && result.peek() == '[' && !result.isEmpty()) {
                result.pop();
            }else if( y == '}' && result.peek() == '{' && !result.isEmpty()) {
                result.pop();
            }else{
                System.out.println("false");
                return false;
            }
        }
        System.out.println("true");
        return result.isEmpty();
    }

    public static void main(String[] args){
        ValidParentheses vp = new ValidParentheses();

        vp.isValid("()");
        vp.isValid("()[]{}");
        vp.isValid("(]");
        vp.isValid("([)]");
        vp.isValid("{[]}");
    }
}
