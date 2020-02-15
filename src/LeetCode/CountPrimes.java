package LeetCode;

public class CountPrimes {

    public int countPrimes(int n) {
        int ans = 0;
        if(n <= 2){
            return 0;
        }
        for(int x = 2; x < n; x ++){
            if(isPrime(x)){
                ans ++;
            }
        }
        System.out.println(ans);
        return ans;
    }

    static boolean isPrime(int n)
    {
        if (n <= 1) return false;

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    static boolean isPrimes(int n)
    {
        if (n <= 1) return false;
        if (n <= 3) return true;

        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

        return true;
    }

    public static void main(String[] args){
        CountPrimes cp = new CountPrimes();
        cp.countPrimes(10);
    }

}
