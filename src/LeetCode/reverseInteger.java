package LeetCode;

public class reverseInteger {

    public int reverse(int num){

        int reversed = 0;

        while(num != 0){
            int x = num % 10;
            reversed = reversed * 10 + x;
            num /= 10;
        }

        return reversed;
    }

    public static void main(String[] args){

        reverseInteger ri = new reverseInteger();

        int result = ri.reverse(120);

        System.out.println(result);

    }
}
