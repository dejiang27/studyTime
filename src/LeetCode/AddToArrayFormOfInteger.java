package LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class AddToArrayFormOfInteger {
    public List<Integer> addToArrayForm(int[] A, int K){

        List<Integer> sum = new ArrayList<>();
        int carry = K;
        for (int index = A.length - 1; index >= 0; --index) {

            int curDigit = A[index] + carry;

            if (curDigit > 9) {
                carry = (curDigit - curDigit % 10) / 10;
                curDigit = curDigit % 10;
            } else {
                carry = 0;
            }

            sum.add(curDigit);

        }
        while (carry > 0) {
            int curDigit = carry % 10;
            carry = (carry - curDigit) / 10;
            sum.add(curDigit);
        }

        Collections.reverse(sum);
        return sum;
    }


    public static void main(String[] args){
        AddToArrayFormOfInteger a = new AddToArrayFormOfInteger();
        a.addToArrayForm(new int[]{1,2,0,0}, 34);
    }
}
