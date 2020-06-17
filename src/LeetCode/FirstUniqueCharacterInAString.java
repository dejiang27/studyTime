package LeetCode;

import java.util.HashMap;

public class FirstUniqueCharacterInAString {

    public int firstUniqChar(String s){

        for(int i = 0; i < s.length(); i ++){
            char x = s.charAt(i);
            if(s.indexOf(x) == s.lastIndexOf(x)){
                return i;
            }
        }
        return -1;
    }
}
/*
Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.


Note: You may assume the string contain only lowercase English letters.
 */