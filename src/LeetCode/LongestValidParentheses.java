package LeetCode;

import java.util.Stack;

public class LongestValidParentheses {

    public int longestValidParentheses(String s) {
        int result = 0;
        if(s.length() < 2){
            return result;
        }

        Stack<Integer> test = new Stack<>();
        test.push(-1);

        for(int x = 0; x < s.length(); x ++){
            char y = s.charAt(x);

            if(y == '('){
                test.push(x);
            }else{
                test.pop();
                if(test.isEmpty()){
                    test.push(x);
                }else {
                    result = Math.max(result, x - test.peek());
                }
            }
        }
        System.out.println(result);
        return result;
    }
    public static void main(String[] args){
        LongestValidParentheses lvp = new LongestValidParentheses();
        lvp.longestValidParentheses("(()");
        lvp.longestValidParentheses(")()())");
        lvp.longestValidParentheses("()(()");
    }
}
