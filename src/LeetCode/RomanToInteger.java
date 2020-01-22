package LeetCode;

public class RomanToInteger {


    public void romanToInteger(String astr){

        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        int result = 0;

        for(int x = 0; x <roman.length; x ++){
            if(astr.length() == 0){
                System.out.println(result);
                //test System.out.println("end");
                return ;
            }
            while(astr.startsWith(roman[x])){
                result = result + nums[x];
                astr = astr.substring(roman[x].length());
                //test System.out.println("while loop");
            }
            //test System.out.println("for loop");

        }
        System.out.println(result);
    }

    public static void main(String[] args){
        RomanToInteger rti = new RomanToInteger();

        rti.romanToInteger("III");
        rti.romanToInteger("IV");
        rti.romanToInteger("IX");
        rti.romanToInteger("LVIII");
        rti.romanToInteger("MCMXCIV");

    }

}
