package com.problems.java;

public class SumOfDigitsOfNumber {
    public static void main(String[] args) {
        System.out.println(sumOfDigitsOfNumber(2));
    }
    public static int sumOfDigitsOfNumber(int n) {
        if(n == 0)
            return 0;
        else
            return (n%10)+sumOfDigitsOfNumber(n/10);
    }
}
