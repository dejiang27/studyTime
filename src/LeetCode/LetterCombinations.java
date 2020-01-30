package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.

A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

2: a b c
3: d e f
4: g h i
5: j k l
6: m n o
7: p q r s
8: t u v
9: w x y z

Input: "23"
Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 */
public class LetterCombinations {

    public List<String> letterCombinations(String digits){

        List<String> result = new ArrayList<String>();

        if(digits.length() == 0){
            return result;
        }

        result.add("");

        HashMap<String, String> hm = new HashMap<>();
        hm.put("2", "abc");
        hm.put("3", "def");
        hm.put("4", "ghi");
        hm.put("5", "jkl");
        hm.put("6", "mno");
        hm.put("7", "pqrs");
        hm.put("8", "tuv");
        hm.put("9", "wxyz");

        for(int x = 0; x < digits.length(); x ++){
            if(hm.containsKey(digits.substring(x, x+1))){
                String digit = hm.get(digits.substring(x, x+1));
                result = helper(result, digit);
            }else{
                return null;
            }
        }
        for(int z = 0; z < result.size(); z++){
            System.out.println(result.get(z));
        }
        return result;
    }

    public List<String> helper(List<String> result, String digit){

        List<String> results = new ArrayList<>();

        for(String r: result){
            for(int x = 0; x < digit.length(); x ++){
                results.add(r + digit.substring(x, x+1));
            }
        }
        return results;
    }

    public static void main(String[] args){

        LetterCombinations lc = new LetterCombinations();

        lc.letterCombinations("23");

    }
}
