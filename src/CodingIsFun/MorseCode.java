package CodingIsFun;

import java.util.HashMap;

public class MorseCode {

    public HashMap code(){

        HashMap<Character,String> codes = new HashMap<>();

        codes.put('a', ".-");
        codes.put('b', "-...");
        codes.put('c', "-.-.");
        codes.put('d', "-..");
        codes.put('e', ".");
        codes.put('f', "..-.");
        codes.put('g', "--.");
        codes.put('h', "....");
        codes.put('i', "..");
        codes.put('j', ".---");
        codes.put('k', "-.-");
        codes.put('l', ".-..");
        codes.put('m', "--");
        codes.put('n', "-.");
        codes.put('o', "---");
        codes.put('p', ".--.");
        codes.put('q', "--.-");
        codes.put('r', ".-.");
        codes.put('s', "...");
        codes.put('t', "-");
        codes.put('u', "..-");
        codes.put('v', "...-");
        codes.put('w', ".--");
        codes.put('x', "-..-");
        codes.put('y', "-.--");
        codes.put('z', "--..");

        return codes;
    }

    public static void main(String[] args){
        MorseCode mc = new MorseCode();

        HashMap<Character, String> hm = mc.code();
        //String test = "SOs";
        String test = "Programmer";

        String result= "";
        for(int x = 0; x <test.length(); x ++) {
            if(hm.containsKey(Character.toLowerCase(test.charAt(x)))){
                result = result + hm.get(Character.toLowerCase(test.charAt(x))) + " ";
            }
        }
        System.out.println("The Morse code for " + test +" is: " + result);
    }



}
