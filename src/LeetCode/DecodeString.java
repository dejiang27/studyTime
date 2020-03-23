package LeetCode;

import java.util.Stack;

public class DecodeString {

    public String decodeString(String s) {

        String ans = "";
        if(s == ""){
            return ans;
        }
        Stack<Character> ss = new Stack<Character>();

        int n = s.length();
        //TODO
        return ans;
    }

    public static void main(String[] args){
        DecodeString ds = new DecodeString();
        ds.decodeString("3[a]2[bc]");
    }

}
