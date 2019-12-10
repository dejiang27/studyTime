
import java.util.*;

public class LongestSubstring {
    /*Given a string, find the length of the longest substring without repeating characters.

Example 1:

Input: "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
*/

    public int longestSubstring(String aStr){


        System.out.println("Input: " +aStr);

        HashSet<Character> set = new HashSet<>();
        int ans = 0;
        int i = 0;
        int j = 0;
        while (i < aStr.length() && j < aStr.length()) {

            if (!set.contains(aStr.charAt(j))){
                set.add(aStr.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(aStr.charAt(i++));
            }
        }
        Iterator<Character> z=set.iterator();

        while(z.hasNext()) {
            System.out.println(z.next());
        }
        return ans;

    }

    public static void main(String[] args){

        LongestSubstring ls = new LongestSubstring();
        String test = "abcabcbb";
        int ans = ls.longestSubstring(test);

        System.out.println("The answer is "+ ans +".");

    }
}
