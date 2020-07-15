package LeetCode;

import java.util.Arrays;

public class AverageSalaryExcludingTheMinimumAndMaximumSalary {

    public double average(int[] salary){
        int sum = 0, min = salary[0], max = salary[0];
        for(int s : salary) {
            sum += s;
            min = Math.min(s, min);
            max = Math.max(s, max);
        }
        return (double)(sum - min - max) / (salary.length - 2);
    }
}
