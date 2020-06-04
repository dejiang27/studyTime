package LeetCode;

import java.util.HashMap;

public class LRUCache {

    HashMap<Integer, Integer> cache;
    int cap;
    public LRUCache(int capacity){
        cache = new HashMap<>();
        cap = capacity;

    }
    public int get(int key){
        if(cache.containsKey(key)){
            return cache.get(key);
        }else{
            return -1;
        }
    }
    public void put(int key, int value){
        if(cache.size() <= cap) {
            cache.put(key, value);
        }else{
            //TODO
            //Need to add more to finish this question
            //IF the cache.size is larger than the capacity, need to remove one <key, value> from the hashmap first, then put the new <key, value>.
        }
    }
    /**
     * Your LRUCache object will be instantiated and called as such:
     * LRUCache obj = new LRUCache(capacity);
     * int param_1 = obj.get(key);
     * obj.put(key,value);
     */
}
