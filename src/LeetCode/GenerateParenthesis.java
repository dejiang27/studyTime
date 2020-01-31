package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

    public List<String> generateParenthesis(int n){

        List<String> result = new ArrayList<>();
        helper(n, 0, 0, "", result);
        return result;
    }

    public static void helper(int n, int open, int close,String s,List<String> list)
    {
        if(s.length()==2*n)
        {
            list.add(s);
            return;
        }
        if(close<open)
        {
            helper(n,open,close+1,s+")",list);
        }
        if(open<n)
        {
            helper(n,open+1,close,s+"(",list);
        }
        return;
    }

    public static void main(String[] args){
        GenerateParenthesis gp = new GenerateParenthesis();

        gp.generateParenthesis(3);

    }

}
