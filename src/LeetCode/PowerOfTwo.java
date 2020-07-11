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




        return false;
    }
}
