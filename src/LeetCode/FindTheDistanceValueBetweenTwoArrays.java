package LeetCode;

public class FindTheDistanceValueBetweenTwoArrays {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d){

        int check = 0;

        for(int i = 0; i < arr1.length; i ++){

            for(int j = 0; j < arr2.length; j ++){

                if(Math.abs(arr1[i] - arr2[j]) <= d){
                    --check;
                    break;
                }
            }
            ++check;
        }

        return check;
    }
}
