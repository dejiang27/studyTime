package LeetCode;

public class SqrtX {
    public int mySqrt(int x) {

        double ans = Math.sqrt((double)x);
        System.out.println((int)ans);
        return (int)ans;
    }

    public static void main(String[] args){
        SqrtX sx = new SqrtX();
        sx.mySqrt(4);
        sx.mySqrt(8);
    }
}
