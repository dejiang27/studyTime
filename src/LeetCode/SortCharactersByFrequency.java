package LeetCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class SortCharactersByFrequency {

    public String frequencySort(String s){

        HashMap<Character, Integer> maps = new HashMap<>();
        String ans = "";
        for(char chara: s.toCharArray()){
            if(!maps.containsKey(chara)){
                maps.put(chara, 1);
            }else{
                maps.put(chara, maps.get(chara)+1);
            }
        }
        char[] z;
        int n = maps.size();
        for(int i = 0; i < n; i ++){
            int max = Collections.max(maps.values());
            for(Character entry:maps.keySet()){
                if(maps.get(entry) == max){
                    z = new char[maps.get(entry)];
                    Arrays.fill(z, entry);
                    ans += new String(z);

                    System.out.println(ans);
                    maps.put(entry, 0);
                    break;
                }
            }
        }
        return ans;
    }

    /*

    Given a string, sort it in decreasing order based on the frequency of characters.

Example 1:

Input:
"tree"

Output:
"eert"

Explanation:
'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.

     */




    public static void main(String[] args){
        SortCharactersByFrequency sc = new SortCharactersByFrequency();
        sc.frequencySort("tree");
        sc.frequencySort("cccaaa");
        sc.frequencySort("Aabb");
    }
}