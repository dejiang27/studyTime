package LeetCode;

import java.util.Stack;

public class BackspaceStringCompare {

    public boolean backspaceCompare(String S, String T) {

        Stack<Character> dic1 = new Stack<>();
        Stack<Character> dic2 = new Stack<>();

        for(char s:S.toCharArray()){
            if(s != '#'){
                dic1.push(s);
            }else{
                if(!dic1.isEmpty()){
                    dic1.pop();
                }
            }
        }
        for(char t:T.toCharArray()){
            if(t != '#'){
                dic2.push(t);
            }else{
                if(!dic2.isEmpty()){
                    dic2.pop();
                }
            }
        }
        if(dic1.size() != dic2.size()){
            return false;
        }
        String ss = "", ts = "";
        for(char s: dic1){
            System.out.println(s);
            ss+=s;
        }
        for(char t : dic2){
            System.out.println(t);
            ts+=t;
        }
        if(!ts.equals(ss)){
            return false;
        }
        return true;

    }
    public static void main(String[] args){
        BackspaceStringCompare bs = new BackspaceStringCompare();

        bs.backspaceCompare("ab#c", "ad#c");
    }
}
