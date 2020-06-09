package LeetCode;

import java.util.HashMap;

public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine){

        HashMap<Character, Integer> map = new HashMap<>();

        for(Character cha: magazine.toCharArray()){
            if(!map.containsKey(cha)){
                map.put(cha, 1);
            }else{
                map.put(cha, map.get(cha)+1);
            }
        }
        for(Character cha: ransomNote.toCharArray()){
            if(!map.containsKey(cha)){
                return false;
            }else{
                if(map.get(cha) > 0) {
                    map.put(cha, map.get(cha) - 1);
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
