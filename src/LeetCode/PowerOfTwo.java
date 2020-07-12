package LeetCode;

public class PowerOfTwo {

    public boolean isPowerOfTwo(int n){
        if(n == 1){
            return true;
        }
        if(n < 1){
            return false;
        }
        if(n % 2 == 1){
            return false;
        }

        while(n/2 > 2 && n%2 == 0){
            n = n/2;
        }

        if(n % 2 == 1){
            return false;
        }

        return true;
    }
}
