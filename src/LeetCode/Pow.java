package LeetCode;

public class Pow {

    public double myPow(double x, int n){
        double ans = Math.pow(x,n);
        System.out.println(ans);
        return ans;
    }

    public static void main(String[] args){
        Pow p = new Pow();
        p.myPow(2.00000, 10);
        p.myPow(2.10000, 3);
        p.myPow(2.00000, -2);
    }
}
