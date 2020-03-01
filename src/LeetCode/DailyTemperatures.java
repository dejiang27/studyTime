package LeetCode;

public class DailyTemperatures {

    public int[] dailyTemperatures(int[] T) {

        int[] ans = new int[T.length];

        int n = T.length;

        for(int i = 0; i < n; i ++){
            int j = i +1;
            if(i == n-1){
                ans[i] = 0;
            }
            while(j < n){
                if(T[i]> T[j] && j == n-1){
                    ans[i] = 0;
                    break;
                }else if(T[i] < T[j]){
                    ans[i] = j - i;
                    break;
                }else{
                    j ++;
                }
            }

        }
        for(int x:ans){
            System.out.println(x);
        }
        return ans;
    }

    public static void main(String[] args){
        DailyTemperatures dt = new DailyTemperatures();
        dt.dailyTemperatures(new int[]{73,74,75,71,69,72,76,73});
    }
}
