package LeetCode;

public class DivideTwoIntegers {

    public int divide(int dividend, int divisor) {

        if (divisor == 1) {
            return dividend;
        }
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        int results = 0;
        int test = Math.abs(dividend);
        while( test >= Math.abs(divisor)){
            test = test - Math.abs(divisor);
            results++;
        }
        if(dividend > 0 && divisor > 0){
            return results;
        }else if(dividend < 0 && divisor > 0){
            return -results;
        }else if(dividend > 0 && divisor < 0){
            return -results;
        }else{
            return results;
        }
    }

    /*
    public int divide(int D, int d) {
        return (int) divideInternal(D, d);
    }

    private long divideInternal(long D, long d) {
        if (D == d) return 1;
        if (d == 1) return D;
        if (d == -1) return D == Integer.MIN_VALUE ? Integer.MAX_VALUE : -D;

        long sign = (D > 0 && d > 0 || D < 0 && d < 0) ? 1 : -1;
        D = D >= 0 ? D : -D;
        d = d > 0 ? d : -d;

        if (D < d) return 0;

        long quot = 0, rem = D, f = 1, p = 0, temp = 0;
        while (D >> (p + 1) > 0) {
            p++;
            f <<= 1;
        }

        while (rem >= 0 && p >= 0) {
            temp = rem - (d << p);
            if (temp >= 0) {
                rem = temp;
                quot += f;
            }
            p--;
            f >>= 1;
        }

        quot = sign == 1 ? quot: -quot;
        return quot;
    }
     */


    public static void main(String[] args){

        DivideTwoIntegers d2i = new DivideTwoIntegers();

        d2i.divide(10, 3);
        d2i.divide(7,-3);
    }
}
