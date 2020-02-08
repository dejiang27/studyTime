package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class FractionToRecurringDecimal {

    public String fractionToDecimal(int numerator, int denominator) {

        if (numerator == 0 || denominator == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        if ( numerator > 0 ^ denominator > 0) {
            sb.append("-");
        }
        long n = Math.abs(Long.valueOf(numerator));
        long d = Math.abs(Long.valueOf(denominator));
        long q = n/d;
        sb.append(q);
        long r = n - q*d;
        if (r == 0) {
            return sb.toString();
        }
        sb.append(".");
        Map<Long, Integer> map = new HashMap<Long, Integer>();
        while(r > 0) {
            if (map.containsKey(r)) {
                sb.insert(map.get(r), "(");
                sb.append(")");
                break;
            }
            map.put(r, sb.length());
            r = r*10;
            q = r/d;
            sb.append(q);
            r = r - q*d;
        }
        return sb.toString();
    }

    public static void main(String[] args){
        FractionToRecurringDecimal fr = new FractionToRecurringDecimal();
        fr.fractionToDecimal(1,2);
        fr.fractionToDecimal(2,1);
        fr.fractionToDecimal(2,3);
    }
}
