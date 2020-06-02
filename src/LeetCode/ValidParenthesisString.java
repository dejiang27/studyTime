package LeetCode;

import java.util.Stack;

public class ValidParenthesisString {

    public boolean checkValidString(String s) {

        Stack<Integer> stk1 = new Stack<>();
        Stack<Integer> stk2 = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '('){
                stk1.push(i);
            }
            else if(c == '*'){
                stk2.push(i);
            }
            else{
                if(!stk1.isEmpty()){
                    stk1.pop();
                }
                else if(!stk2.isEmpty()){
                    stk2.pop();
                }
                else{
                    return false;
                }
            }
        }

        while(!stk1.isEmpty() && !stk2.isEmpty()){
            if(stk1.pop() > stk2.pop()){
                return false;
            }
        }

        return stk1.isEmpty();


        /*int sp = 0;
        Stack<Character> chars = new Stack<>();
        for (Character cha : s.toCharArray()) {
            if (cha == ')') {
                if (!chars.isEmpty()) {
                    chars.pop();
                } else if (sp > 0) {
                    sp--;
                } else {
                    System.out.println("False");
                    return false;
                }
            } else if (cha == '(') {
                if(chars.isEmpty()){
                    sp = 0;
                }
                chars.push(cha);
            } else {
                sp++;
            }
        }
        while (!chars.isEmpty()) {
            if (sp > 0) {
                chars.pop();
                sp--;
            } else {
                System.out.println("False");
                return false;
            }
        }
        System.out.println("True");
        return chars.isEmpty();*/
    }

    public static void main(String[] args){

        ValidParenthesisString vp = new ValidParenthesisString();

        vp.checkValidString("()");
        vp.checkValidString("(*)");
        vp.checkValidString("(*))");
        vp.checkValidString("(())((())()()(*)(*()(())())())()()((()())((()))(*");
    }


}
