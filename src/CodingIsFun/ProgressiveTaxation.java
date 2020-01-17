package CodingIsFun;

import java.util.Scanner;

/*
The nation of Examplania has the following income tax brackets:

income cap      marginal tax rate
  ¤10,000           0.00 (0%)
  ¤30,000           0.10 (10%)
 ¤100,000           0.25 (25%)
    --              0.40 (40%)
If you're not familiar with how tax brackets work, see the section below for an explanation.

Given a whole-number income amount up to ¤100,000,000, find the amount of tax owed in Examplania. Round down to a whole number of ¤.

Examples
tax(0) => 0
tax(10000) => 0
tax(10009) => 0
tax(10010) => 1
tax(12000) => 200
tax(56789) => 8697
tax(1234567) => 473326
 */
public class ProgressiveTaxation {

    public int Tax(int income){

        double tax = 0;

        if(income <= 10000){
            return 0;
        }
        else if(income > 10000 && income<=30000){
            tax = (income-10000)*0.1;
        }
        else if(income > 30000 && income <= 100000){
            tax = (20000*0.1)+(income-30000)*0.25;
        }else{
            tax = (20000*0.1)+(70000*0.25)+(income-100000)*0.4;
        }

        if (tax != 0){
            return (int) tax;
        }
        return 0;

    }
    //10000-30000 -> 0-0.07
    //30000-100000 -> 0.07 - 0.2
    public int overall(double oa){

        return 0;
    }


    public static void main(String[] args){

        ProgressiveTaxation pt = new ProgressiveTaxation();

        System.out.println("Please type '-1' to exit the tax program.");
        Scanner sc = new Scanner(System.in);
        int in;
        int result;
        System.out.println("Enter your income: ");
        while(sc.hasNextInt() && (in = sc.nextInt())!= -1){
            result = pt.Tax(in);
            System.out.println("The tax for the income " +in + " is: " +result);
            System.out.println("Enter your income: ");

        }

        sc.close();
    }
}
