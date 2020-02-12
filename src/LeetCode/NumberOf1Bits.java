package LeetCode;

public class NumberOf1Bits {
    public int hammingWeight(int n) {
        int count = 0;
        for(int i = 0; i < Integer.SIZE; i++) {
            count += n & 1;
            n = n >> 1;
        }
        return count;
    }

    public static void main(String[] args){
        NumberOf1Bits nb = new NumberOf1Bits();

        nb.hammingWeight(00000000000000000000000000001011);
        nb.hammingWeight(00000000000000000000000010000000);
    }
}
