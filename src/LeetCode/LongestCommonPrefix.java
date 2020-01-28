package LeetCode;

import java.lang.reflect.Array;

public class LongestCommonPrefix {

    public String longestCommon(String[] strs){

        StringBuilder str = new StringBuilder();
        int length=Integer.MAX_VALUE;
        int result=0;
        for(int i=0;i< strs.length;i++)
        {
            if(strs[i].length() < length)
                length = strs[i].length();
        }
        if(length == Integer.MAX_VALUE)
            return "";
        int j=0;
        for(int i=0;i< length;i++)
        {
            for(j=1;j< strs.length;j++)
            {
                if(strs[j].charAt(i) == strs[j-1].charAt(i))
                    continue;
                else
                    break;
            }

            if(j == strs.length)
                str.append(strs[0].charAt(i));
            else
                break;
        }
        return str.toString();    }

    public static void main(String[] args){
        LongestCommonPrefix lc = new LongestCommonPrefix();

        String[] ex1 = new String[]{"flower","flow","flight"};
        String[] ex2 = new String[]{"dog","racecar","car"};

    }
}
