package CodingIsFun;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Given a string containing only the characters x and y, find whether there are the same number of xs and ys.

balanced("xxxyyy") => true
balanced("yyyxxx") => true
balanced("xxxyyyy") => false
balanced("yyxyxxyxxyyyyxxxyxyx") => true
balanced("xyxxxxyyyxyxxyxxyy") => false
balanced("") => true
balanced("x") => false
*/
public class PerfectlyBalanced {

    public void balanced(String aStr){

        int x = 0;
        int y = 0;
        for(char c: aStr.toCharArray()){
            if(c == 'x'){
                x ++;
            }else{
                y ++;
            }
        }
        if(x == y){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }

    public void balcnced_bonus(String aStr){
        HashMap<Character, Integer> hm = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(char c: aStr.toCharArray()){
            if(!hm.containsKey(c)){
                hm.put(c, 1);
            }
            hm.replace(c, hm.get(c)+1);
        }
        if(hm.isEmpty() || hm.size() == 1){
            System.out.println("True");
            return ;
        }else{
            for(Map.Entry keys: hm.entrySet()){
                list.add((int)keys.getValue());
            }
            for(int z = 0; z < list.size()-1; z ++){
               if(list.get(z) != list.get(z +1)){
                   System.out.println("False");
                   return ;
               }
            }
        }
        System.out.println("True");
    }


    public static void main(String[] args){
        PerfectlyBalanced pb = new PerfectlyBalanced();

        System.out.println("----------Testing----------");
        pb.balanced("xxxyyy");
        pb.balanced("yyyxxx");
        pb.balanced("xxxyyyy");
        pb.balanced("yyxyxxyxxyyyyxxxyxyx");
        pb.balanced("xyxxxxyyyxyxxyxxyy");
        pb.balanced("");
        pb.balanced("x");

        System.out.println("----------Testing----------");
        pb.balcnced_bonus("xxxyyyzzz");
        pb.balcnced_bonus("abccbaabccba");
        pb.balcnced_bonus("xxxyyyzzzz");
        pb.balcnced_bonus("abcdefghijklmnopqrstuvwxyz");
        pb.balcnced_bonus("pqq");
        pb.balcnced_bonus("fdedfdeffeddefeeeefddf");
        pb.balcnced_bonus("www");
        pb.balcnced_bonus("x");
        pb.balcnced_bonus("");


    }

}
