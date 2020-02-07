package LeetCode;

import java.util.*;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> ans = new ArrayList<>();

        Map<String, List<String>> dic = new HashMap<String, List<String>>();

        if(strs.length<0){
            return ans;
        }

        for(String str : strs){
            char temp[] = str.toCharArray();
            Arrays.sort(temp);
            String t = new String(temp);
            if(dic.containsKey(t)){
                dic.get(t).add(str);
            }else{
                dic.put(t, new ArrayList<String>(){{
                    add(str);
                }});
            }
        }
        for (List<String> entry: dic.values()) {
            ans.add(entry);
        }
        return ans;
    }
    public static void main(String[] arge){
        GroupAnagrams ga = new GroupAnagrams();

        ga.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
    }

}
