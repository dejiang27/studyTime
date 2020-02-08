package LeetCode;

import java.util.Arrays;
import java.util.List;

public class WordBreak {

    public boolean wordBreak(String s, List<String> wordDict) {

        if(wordDict.size() == 0 || s.length() == 0){
            return false;
        }
        for(String st:wordDict){
            if(s.contains(st)){
                s = s.replace(st, "");
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        WordBreak wb = new WordBreak();
        wb.wordBreak("leetcode", Arrays.asList("leet", "code"));

    }
}
