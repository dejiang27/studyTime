package LeetCode;

/*
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
*/

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class integerToRoman {

    public void intToRoman(int num){

        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        /*HashMap<Integer, String> list = new HashMap<>();

        list.put(1, "I");
        list.put(4, "IV");
        list.put(5, "V");
        list.put(9, "IX");

        list.put(10, "X");
        list.put(40, "XL");
        list.put(50, "L");
        list.put(90, "XC");

        list.put(100, "C");
        list.put(400, "CD");
        list.put(500, "D");
        list.put(900, "CM");

        list.put(1000, "M");*/

        String result = "";

        for(int x = 0; x < nums.length; x ++){

            if(num >= nums[x]) {
                int z = num / nums[x];
                while(z != 0) {
                    result = result + (roman[x]);
                    z --;
                }
            }
            num = num % nums[x];
        }
        System.out.println(result);
    }


    public static void main(String[] args){
        integerToRoman itr = new integerToRoman();

        itr.intToRoman(3);
        itr.intToRoman(4);
        itr.intToRoman(9);
        itr.intToRoman(58);
        itr.intToRoman(1994);
    }
}
