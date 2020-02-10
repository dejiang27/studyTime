package LeetCode;

public class MultiplyStrings {



    public String multiply(String num1, String num2) {

        int s = Integer.parseInt(num1) * Integer.parseInt(num2);

        String result = String.valueOf(s);

        return result;
        //TODO
    }

    public static void main(String[] args){
        MultiplyStrings ms = new MultiplyStrings();

        ms.multiply("2", "3");
    }



}
