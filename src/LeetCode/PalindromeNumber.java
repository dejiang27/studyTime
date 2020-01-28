package LeetCode;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int revertedNumber = 0;
        while(x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        return x == revertedNumber || x == revertedNumber/10;
    }

    public static void main(String[] args){
        PalindromeNumber pn = new PalindromeNumber();

        pn.isPalindrome(121);
        pn.isPalindrome(-121);
        pn.isPalindrome(10);
        pn.isPalindrome(100);
        pn.isPalindrome(0);


    }
}
